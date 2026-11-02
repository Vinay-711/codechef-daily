from pathlib import Path
import subprocess, tempfile
root = Path(__file__).parent
values = [1234, 124894, 242323, 1, 9, 10, 1000000, 90909, 100001]
values += list(range(1, 991))
with tempfile.TemporaryDirectory() as d:
    subprocess.run(['javac', '-d', d, str(root / 'Main.java')], check=True)
    result = subprocess.run(['java', '-cp', d, 'Main'], input=str(len(values))+'\n'+'\n'.join(map(str,values))+'\n', text=True, capture_output=True, check=True)
    assert list(map(int,result.stdout.split())) == [int(str(n)[0])+int(str(n)[-1]) for n in values]
print(f'{len(values)} independent sample and boundary cases passed')

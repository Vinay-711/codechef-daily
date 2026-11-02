from pathlib import Path
import subprocess,tempfile
pairs = [(1,2),(100,200),(40,15),(1,1),(10000,1),(10000,10000),(9999,10000)]
pairs += [(a,b) for a in range(1,31) for b in range(1,31)]
with tempfile.TemporaryDirectory() as d:
    subprocess.run(['javac','-d',d,str(Path(__file__).with_name('Main.java'))],check=True)
    result=subprocess.run(['java','-cp',d,'Main'],input=str(len(pairs))+'\n'+'\n'.join(f'{a} {b}' for a,b in pairs)+'\n',text=True,capture_output=True,check=True)
    values=list(map(int,result.stdout.split()))
    assert len(values)==len(pairs)
    for (a,b),r in zip(pairs,values):
        assert 0<=r<b and (a-r)//b*b+r==a and (a-r)%b==0
print(f'{len(pairs)} sample and division-invariant checks passed')

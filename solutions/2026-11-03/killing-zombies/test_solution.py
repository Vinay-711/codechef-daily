from pathlib import Path
import subprocess,tempfile
p=Path(__file__).parent
cases=[('2\n5 5\n1 2 3 4 5\n1 2 3\n1 5 1\n2 4 3\n3 5 3\n4 5 3\n3 2\n2 5 2\n1 2 2\n2 3 2', 'YES 6\nNO'), ('10\n6 3\n2 4 6 6 2 6\n5 6 3\n3 3 1\n2 2 2\n5 5\n1 3 2 5 3\n1 5 3\n4 5 2\n4 5 1\n1 3 3\n3 3 3\n6 4\n6 3 6 3 4 1\n4 6 2\n5 6 1\n1 5 3\n2 2 1\n2 4\n4 2\n1 1 3\n2 2 3\n2 2 1\n1 2 1\n6 5\n6 5 3 6 6 4\n6 6 2\n3 4 2\n1 5 3\n3 4 2\n5 5 2\n1 3\n2\n1 1 3\n1 1 2\n1 1 3\n5 5\n3 5 5 1 3\n4 4 3\n1 3 2\n3 4 3\n5 5 3\n5 5 1\n6 1\n6 2 2 1 6 3\n2 2 3\n6 6\n1 1 1 6 4 1\n5 5 3\n1 6 2\n2 2 1\n5 6 1\n4 5 1\n6 6 2\n2 2\n5 6\n1 2 2\n2 2 3', 'NO\nYES 5\nNO\nYES 5\nNO\nYES 2\nNO\nNO\nNO\nNO'), ('10\n2 5\n5 5\n2 2 3\n1 1 2\n2 2 1\n2 2 3\n2 2 3\n6 1\n4 1 1 4 3 4\n4 6 1\n1 2\n2\n1 1 2\n1 1 3\n6 3\n5 4 6 6 6 1\n1 1 1\n3 4 2\n4 6 2\n2 6\n1 4\n2 2 2\n1 2 1\n1 2 3\n2 2 3\n2 2 1\n2 2 2\n4 2\n3 4 5 2\n1 4 1\n1 3 1\n3 6\n3 2 4\n1 1 1\n2 2 1\n2 2 1\n1 1 3\n3 3 2\n1 3 3\n3 5\n5 5 3\n3 3 3\n2 2 1\n1 2 2\n1 3 3\n3 3 2\n5 3\n6 1 4 5 3\n5 5 3\n5 5 2\n3 5 3\n6 3\n1 2 3 4 3 3\n1 6 1\n5 5 2\n3 5 1', 'NO\nNO\nYES 2\nNO\nYES 4\nNO\nYES 4\nYES 5\nNO\nNO'), ('10\n4 1\n3 1 1 4\n4 4 1\n5 5\n5 6 6 1 2\n1 3 1\n2 2 3\n1 1 2\n4 5 1\n4 4 3\n2 2\n4 5\n2 2 3\n1 1 3\n5 3\n4 6 5 4 6\n5 5 1\n3 3 1\n1 3 1\n2 1\n1 4\n1 1 2\n4 6\n3 2 1 1\n3 3 3\n2 4 2\n2 2 3\n2 4 1\n3 4 1\n1 3 3\n1 1\n2\n1 1 1\n2 4\n5 6\n1 2 3\n1 2 2\n1 2 2\n2 2 1\n3 2\n3 4 4\n2 3 1\n2 3 2\n4 5\n2 1 1 2\n2 3 2\n4 4 2\n4 4 3\n3 4 3\n4 4 1', 'NO\nNO\nNO\nNO\nNO\nYES 4\nNO\nYES 6\nNO\nNO'), ('1\n2 2\n1000000000 1000000000\n1 1 1000000000\n2 2 1000000000', 'YES 2000000000')]
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 for data,want in cases:
  result=subprocess.run(['java','-cp',d,'Main'],input=data,text=True,capture_output=True,check=True,timeout=8)
  assert result.stdout.strip()==want.strip(),(data,result.stdout,want)
print(str(len(cases))+' sample and original edge-case checks passed')

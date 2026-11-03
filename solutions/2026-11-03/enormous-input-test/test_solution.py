from pathlib import Path
import subprocess,tempfile
p=Path(__file__).parent
cases=[('7 3\n1\n51\n966369\n7\n9\n999996\n11\n', '4'), ('1 10000000\n1000000000\n', '1'), ('4 7\n1 2 3 4', '0'), ('3 1\n1 999999999 1000000000', '3')]
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 for data,want in cases:
  result=subprocess.run(['java','-cp',d,'Main'],input=data,text=True,capture_output=True,check=True,timeout=8)
  assert result.stdout.strip()==want.strip(),(data,result.stdout,want)
print(str(len(cases))+' sample and original edge-case checks passed')

from pathlib import Path
import tempfile,subprocess
p=Path(__file__).parent
cases=[('3\n10\n5\n10000', '3\n2\n100'), ('7\n1\n2\n3\n4\n8\n9\n9999', '1\n1\n1\n2\n2\n3\n99')]
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 for data,want in cases:
  r=subprocess.run(['java','-cp',d,'Main'],input=data,text=True,capture_output=True,check=True,timeout=5)
  assert r.stdout.strip()==want.strip(),(data,r.stdout,want)
print(str(len(cases))+' sample and original edge checks passed')

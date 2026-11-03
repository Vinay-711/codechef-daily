from pathlib import Path
import tempfile,subprocess
p=Path(__file__).parent
cases=[('3\n1\n12\n-5\n', 'Thanks for helping Chef!\n-1\nThanks for helping Chef!'), ('6\n-20\n0\n9\n10\n11\n20\n', 'Thanks for helping Chef!\nThanks for helping Chef!\nThanks for helping Chef!\n-1\n-1\n-1')]
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 for data,want in cases:
  r=subprocess.run(['java','-cp',d,'Main'],input=data,text=True,capture_output=True,check=True,timeout=5)
  assert r.stdout.strip()==want.strip(),(data,r.stdout,want)
print(str(len(cases))+' sample and original edge checks passed')

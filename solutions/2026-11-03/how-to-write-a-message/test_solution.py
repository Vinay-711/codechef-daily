from pathlib import Path
import subprocess,tempfile
p=Path(__file__).parent
cases=[('1\n1 1\nA\nA\n', '25'), ('1\n1 1\nA\nB\n', '24'), ('1\n1 1\nB\nB\n', '25'), ('1\n3 1\nA\nA\n', '15625'), ('1\n3 1\nA\nB\n', '13824'), ('1\n3 1\nB\nB\n', '15625'), ('1\n3 2\nAA\nAA\n', '17525'), ('1\n3 2\nAA\nBB\n', '17376'), ('1\n3 2\nBA\nBB\n', '17474'), ('1\n4 2\nAA\nAA\n', '455000'), ('1\n4 2\nAA\nBB\n', '449280'), ('1\n4 2\nBA\nBB\n', '453026'), ('1\n5 3\nAAA\nAAA\n', '11879400'), ('1\n5 3\nAAA\nBBB\n', '11865984'), ('1\n5 3\nBAA\nBBB\n', '11873476'), ('1\n2 3\nAAA\nAAA\n', '676'), ('1\n2 3\nAAA\nBBB\n', '676'), ('1\n2 3\nBAA\nBBB\n', '676'), ('1\n19 1\nA\nB\n', '908585067')]
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 for data,want in cases:
  result=subprocess.run(['java','-cp',d,'Main'],input=data,text=True,capture_output=True,check=True,timeout=8)
  assert result.stdout.strip()==want.strip(),(data,result.stdout,want)
print(str(len(cases))+' sample and original edge-case checks passed')

from pathlib import Path
import tempfile,subprocess
p=Path(__file__).parent
cases=[('3\nB\nc\nD', 'BattleShip\nCruiser\nDestroyer'), ('8\nb B c C d D f F', 'BattleShip\nBattleShip\nCruiser\nCruiser\nDestroyer\nDestroyer\nFrigate\nFrigate')]
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 for data,want in cases:
  r=subprocess.run(['java','-cp',d,'Main'],input=data,text=True,capture_output=True,check=True,timeout=5)
  assert r.stdout.strip()==want.strip(),(data,r.stdout,want)
print(str(len(cases))+' sample and original edge checks passed')

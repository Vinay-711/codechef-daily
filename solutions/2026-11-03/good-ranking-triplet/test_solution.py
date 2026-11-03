from pathlib import Path
import subprocess,tempfile
p=Path(__file__).parent
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 for n in [3,4,5,7,8,9,16,17,31,32,63,64,127,128,249,250]:
  result=subprocess.run(['java','-cp',d,'Main'],input=str(n),text=True,capture_output=True,check=True,timeout=8)
  rows=result.stdout.strip().splitlines();m=int(rows[0]);assert 1<=m<=40 and len(rows)==m+1
  before=[[0]*(n+1) for _ in range(n+1)]
  for k,line in enumerate(rows[1:]):
   ranking=list(map(int,line.split()));assert sorted(ranking)==list(range(1,n+1))
   for i,a in enumerate(ranking):
    for b in ranking[i+1:]:before[a][b]|=1<<k
  for a in range(1,n+1):
   for b in range(1,n+1):
    if a==b:continue
    for c in range(1,n+1):
     if c!=a and c!=b:assert before[a][b]&before[b][c],(n,a,b,c)
print('All ordered triples covered for 16 sizes including N=250; every ranking is a permutation')

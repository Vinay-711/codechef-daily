from pathlib import Path
import subprocess,tempfile,random,math
p=Path(__file__).parent
rng=random.Random(77);cases=[('012',[(1,1),(1,2),(2,2)])]
for _ in range(20):
 n=rng.randint(1,100);s=''.join(rng.choice('012345') for _ in range(n));qs=[]
 for j in range(30):
  l=rng.randint(1,n);qs.append((l,rng.randint(l,n)))
 cases.append((s,qs))
cases.append(('0'*200000,[(1,200000),(200000,200000)]))
data=str(len(cases))+'\n'+'\n'.join(f'{len(s)} {len(qs)}\n'+s+'\n'+'\n'.join(f'{l} {r}' for l,r in qs) for s,qs in cases)
want=[]
for s,qs in cases:
 for l,r in qs:
  angle=0;x=0.0;y=0.0
  for c in s[l-1:r]:
   angle=(angle+int(c))%6;x+=math.cos(angle*math.pi/3);y+=math.sin(angle*math.pi/3)
  want.append((x,y))
with tempfile.TemporaryDirectory() as d:
 subprocess.run(['javac','-d',d,str(p/'Main.java')],check=True)
 result=subprocess.run(['java','-cp',d,'Main'],input=data,text=True,capture_output=True,check=True,timeout=8)
 lines=result.stdout.splitlines();assert len(lines)==len(want)
 for line,expected in zip(lines,want):
  assert all(len(v.split('.')[1])<=8 for v in line.split()),line
  actual=list(map(float,line.split()));assert all(abs(a-b)<1e-6 for a,b in zip(actual,expected)),(actual,expected)
print('605 sample, independent Cartesian simulation and maximum-length query checks passed')

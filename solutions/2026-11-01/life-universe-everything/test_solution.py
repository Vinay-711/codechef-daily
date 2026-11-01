from solution import solve
assert solve('42\n13\n') == ''
assert solve('0\n99\n42\n11\n') == '0\n99'
assert solve('1 2 3 42') == '1\n2\n3'
assert solve('41 43 42 42') == '41\n43'
assert solve(('7\n'*10000)+'42\n8') == '\n'.join(['7']*10000)
print('5 cases passed, including immediate stop and long prefix')

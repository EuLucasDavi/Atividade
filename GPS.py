import math
#coordenadas FATEC Diadema (-23.6736239,-46.623411)
lat1 = -23.6736239
lon1 = -46.623411
#coordenadas Marco Zero (-23.5504484,-46.6361052)
lat2 = -23.5504484
lon2 = -46.6361052
#coordenadas FATEC São Caetano (-23.6376231,-46.5809414)
lat3 = -23.6376231
lon3 = -46.5809414
#coordenadas FATEC Ipiranga (-23.6097063,-46.6100791)
lat4 = -23.6097063
lon4 = -46.6100791
#coordenadas FATEC Mauá (-23.6636004,-46.4623188)
lat5 = -23.6636004
lon5 = -46.4623188
#coordenadas FATEC São Bernardo (-23.6956141,-46.5513941)
lat6 = -23.6956141
lon6 = -46.5513941

deltaMarco = math.sqrt((lat1-lat2)**2 +(lon1-lon2)**2)
deltaSC = math.sqrt((lat1-lat3)**2 +(lon1-lon3)**2)
deltaIp = math.sqrt((lat1-lat4)**2 +(lon1-lon4)**2)
deltaMaua = math.sqrt((lat1-lat5)**2 +(lon1-lon5)**2)
deltaSBC = math.sqrt((lat1-lat6)**2 +(lon1-lon6)**2)

distMarco = int (deltaMarco * 10**9)
d1 = distMarco // 100000000 % 10
d2 = distMarco // 10000000 % 10
d3 = distMarco // 1000000 % 10
d4 = distMarco // 100000 % 10
d5 = distMarco // 10000 % 10
d6 = distMarco // 1000 % 10
d7 = distMarco // 100 % 10
d8 = distMarco // 10 % 10
d9 = distMarco // 1 % 10

dm1 = d1 * 11.132
dm2 = d2 * 1.1132
dm3 = d3 * 0.11132
dm4 = d4 * 0.011132
dm5 = d5 * 0.0011132
dm6 = d6 * 0.00011132
dm7 = d7 * 0.000011132
dm8 = d8 * 0.0000011132
dm9 = d9 * 0.00000011132
distMarco = dm1 + dm2 + dm3 + dm4 + dm5 + dm6 + dm7 + dm8 + dm9
print("a) A distância da FATEC Diadema até o Marco Zero é de %.2f Km" %distMarco)

distSC = int (deltaSC * 10**9)
sc1 = distSC // 100000000 % 10
sc2 = distSC // 10000000 % 10
sc3 = distSC // 1000000 % 10
sc4 = distSC // 100000 % 10
sc5 = distSC // 10000 % 10
sc6 = distSC // 1000 % 10
sc7 = distSC // 100 % 10
sc8 = distSC // 10 % 10
sc9 = distSC // 1 % 10

dsc1 = sc1 * 11.132
dsc2 = sc2 * 1.1132
dsc3 = sc3 * 0.11132
dsc4 = sc4 * 0.011132
dsc5 = sc5 * 0.0011132
dsc6 = sc6 * 0.00011132
dsc7 = sc7 * 0.000011132
dsc8 = sc8 * 0.0000011132
dsc9 = sc9 * 0.00000011132

distSC = dsc1 + dsc2 + dsc3 + dsc4 + dsc5 + dsc6 + dsc7 + dsc8 + dsc9

distIp = int (deltaIp * 10**9)
ip1 = distIp // 100000000 % 10
ip2 = distIp // 10000000 % 10
ip3 = distIp // 1000000 % 10
ip4 = distIp // 100000 % 10
ip5 = distIp // 10000 % 10
ip6 = distIp // 1000 % 10
ip7 = distIp // 100 % 10
ip8 = distIp // 10 % 10
ip9 = distIp // 1 % 10

dip1 = ip1 * 11.132
dip2 = ip2 * 1.1132
dip3 = ip3 * 0.11132
dip4 = ip4 * 0.011132
dip5 = ip5 * 0.0011132
dip6 = ip6 * 0.00011132
dip7 = ip7 * 0.000011132
dip8 = ip8 * 0.0000011132
dip9 = ip9 * 0.00000011132

distIp = dip1 + dip2 + dip3 + dip4 + dip5 + dip6 + dip7 + dip8 + dip9

distMaua = int (deltaMaua * 10**9)
maua1 = distMaua // 100000000 % 10
maua2 = distMaua // 10000000 % 10
maua3 = distMaua // 1000000 % 10
maua4 = distMaua // 100000 % 10
maua5 = distMaua // 10000 % 10
maua6 = distMaua // 1000 % 10
maua7 = distMaua // 100 % 10
maua8 = distMaua // 10 % 10
maua9 = distMaua // 1 % 10

dmaua1 = maua1 * 11.132
dmaua2 = maua2 * 1.1132
dmaua3 = maua3 * 0.11132
dmaua4 = maua4 * 0.011132
dmaua5 = maua5 * 0.0011132
dmaua6 = maua6 * 0.00011132
dmaua7 = maua7 * 0.000011132
dmaua8 = maua8 * 0.0000011132
dmaua9 = maua9 * 0.00000011132

distMaua = dmaua1 + dmaua2 + dmaua3 + dmaua4 + dmaua5 + dmaua6 + dmaua7 + dmaua8 + dmaua9

distSBC = int (deltaSBC * 10**9)
sbc1 = distSBC // 100000000 % 10
sbc2 = distSBC // 10000000 % 10
sbc3 = distSBC // 1000000 % 10
sbc4 = distSBC // 100000 % 10
sbc5 = distSBC // 10000 % 10
sbc6 = distSBC // 1000 % 10
sbc7 = distSBC // 100 % 10
sbc8 = distSBC // 10 % 10
sbc9 = distSBC // 1 % 10

dsbc1 = sbc1  * 11.132
dsbc2 = sbc2 * 1.1132
dsbc3 = sbc3 * 0.11132
dsbc4 = sbc4 * 0.011132
dsbc5 = sbc5 * 0.0011132
dsbc6 = sbc6 * 0.00011132
dsbc7 = sbc7 * 0.000011132
dsbc8 = sbc8 * 0.0000011132
dsbc9 = sbc9 * 0.00000011132

distSBC = dsbc1 + dsbc2 + dsbc3 + dsbc4 + dsbc5 + dsbc6 + dsbc7 + dsbc8 + dsbc9

lista = [distIp, distMaua, distSBC, distSC]
lista.sort()
if lista[0] == distIp:
    print('b) A FATEC Ipiranga é a mais próxima')
elif lista[0] == distMaua:
    print('b) A FATEC Mauá é a mais próxima')
elif lista[0] == distSBC:
    print('b) A FATEC SBC é a mais próxima')
else:
    print('b) A FATEC São Caetano é a mais próxima')

if lista[1] == distIp:
    print('c) A FATEC Ipiranga é a segunda mais próxima')
elif lista[1] == distMaua:
    print('c) A FATEC Mauá é a segunda mais próxima')
elif lista[1] == distSBC:
    print('c) A FATEC SBC é a segunda mais próxima')
else:
    print('c) A FATEC São Caetano é a segunda mais próxima')
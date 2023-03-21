const Conta = require('./conta');

const a = 1;
const b = 2;
const c = -3;

const raizes = Conta.calcularEquacaoSegundoGrau(a, b, c);

if (raizes === null) {
  console.log('As raízes são complexas');
} else {
  console.log(`As raízes são ${raizes[0]} e ${raizes[1]}`);
}
//No Node.js, os módulos são unidades independentes de código que podem ser 
//reutilizadas em vários arquivos JavaScript. Para utilizar um módulo em um arquivo, 
//é necessário exportá-lo usando a função module.exports e, em seguida, importá-lo em 
//outro arquivo usando a função require().
class Conta {
    static calcularEquacaoSegundoGrau(a, b, c) {
      const delta = b ** 2 - (4 * a * c);
  
      if (delta < 0) {
        return null;
      }
  
      const x1 = (-b + Math.sqrt(delta)) / (2 * a);
      const x2 = (-b - Math.sqrt(delta)) / (2 * a);
  
      return [x1, x2];
    }
  }
  
  module.exports = Conta;
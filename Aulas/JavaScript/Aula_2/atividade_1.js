// Função chamada "mais" que retorna a soma dos parâmetros.

// a) Sintaxe Básica
const maisBasic = function(num1, num2) {
    return num1 + num2;
}

// b) Sintaxe Alternativa
function maisAlt(num1, num2) {
    return num1 + num2;
}
 
// c) Sintaxe Arrow
const maisArrow = (num1, num2) => num1 + num2;

// Logs

console.log(maisBasic(4,5));
console.log(maisAlt(6,7));
console.log(maisArrow(8,2));
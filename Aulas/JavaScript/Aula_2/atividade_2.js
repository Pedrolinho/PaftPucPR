// Função chamada "menos" que retorna a subtração dos parâmetros.
// Caso um parâmetro não seja passado, imprime o número com o sinal invertido.

// a) Sintaxe Básica
const menosBasic = function(num1, num2) {
    if (num2 === undefined) return -num1;
    return num1 - num2;
}

// b) Sintaxe Alternativa
function menosAlt(num1, num2) {
    if (num2 === undefined) return -num1;
    return num1 - num2;
}

// c) Sintaxe Arrow
const menosArrow = (num1, num2) => {
    if (num2 === undefined) return -num1;
    return num1 - num2;
}

// Logs
console.log(menosBasic(4));
console.log(menosAlt(6,4));
console.log(menosArrow(-5));
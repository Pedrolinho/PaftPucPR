// Função chamada "maior" que retorna o maior valor entre os passados.

const valores1 = [3, 6, 256, 62, 12];
const valores2 = [-41, -43, -6, -2];

const maior = (valores) => {
    let maiorvalor = valores[0];
    for(const valor of valores) {
        if(valor > maiorvalor) maiorvalor = valor;
    }
    return maiorvalor;
}

console.log(maior(valores1)); // 256
console.log(maior(valores2)); // -2
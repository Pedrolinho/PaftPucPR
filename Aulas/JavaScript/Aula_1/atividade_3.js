let nums = [4, 6, 1, -29, 39, -2, 96];
let positivos = [];
let soma = 0;

for(const num of nums) {
    if(num > 0) positivos.push(num);
    soma += num;
}
console.log(`Positivos: ${positivos}; Média: ${(soma/nums.length).toFixed(2)}`);
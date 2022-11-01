const prompt = require('prompt-sync')();

let num = parseInt(prompt('Digite um número: '));

console.log(num);
while(num !== 1) {
    if(num % 2 === 0) {
        num /= 2;
    } else {
        num = (num * 3) + 1;
    }
    console.log(num);
}
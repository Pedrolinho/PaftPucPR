//a) Teste se existe um CPF no meio de um texto, no formato: xxx.xxx.xxx-xx
const regCPF = /\d{3}\.\d{3}\.\d{3}\-\d{2}$/;
console.log(regCPF.test("O CPF de João é: 123.123.123-12"));

//b) Valide se o texto de uma String é um telefone, no formato: (xx) xxxxx-xxxx
console.log(/^\(\d{2}\)\s{1}\d{5}\-\d{4}$/.test("(13) 99778-0510"));

//c) Teste se um determinado texto é ou não uma placa de carro
const placaOLD = /\w{3}\-\d{4}/;
const placaNEW = /\w{3}\d{1}\w{1}\d{2}/;
console.log((placaOLD | placaNEW).test("ABC-1234"));

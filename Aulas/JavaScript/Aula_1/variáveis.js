/* const -> usado para variáveis constantes */
/* let   -> usado para variáveis não constantes */

/* No JavaScript não é necessário o uso do ponto-e-vírgula (;) */
const nome = "Pedro"
const humano = true
let idade = 20

/* Para a impressão no console utiliza-se a função console.log() */
console.log("Nome: " + nome + "; Idade: " + idade + "; Humano: " + humano)

/* O uso de aspas simples invertidas (``) permitem o uso de uma string formatada utilizando ${variável} */
console.log(`Nome: ${nome}; Idade: ${idade}; Humano: ${humano}`)

console.log(parseInt(nome)) // Converte texto em int
console.log(parseFloat(idade)) // Converte texto em float
console.log(nome.toUpperCase()) // Converte o texto em letras maiúsculas
console.log(nome.toLowerCase()) // Converte o texto em letras minúsculass
console.log(nome.length) // Retorna o tamanho do texto incluindo espaços
console.log(idade.toFixed(2)) // Converte número em texto, com a quantidade de casas decimais desejadas

let quinzeAnos = idade == 15;
let maior = idade >= 18;
console.log(`${nome} tem 15 anos: ${quinzeAnos}; ${nome} tem 18 anos ou mais: ${maior}`)

const adulto = idade >= 18 ? "Pedro é adulto" : "Pedro é adolescente"; console.log(adulto);
console.log(("b" + 'a' + + 'z' + `a`).toLowerCase());
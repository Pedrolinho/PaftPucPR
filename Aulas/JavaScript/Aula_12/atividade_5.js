const nome = "Pedro André";
const regNome = /(\w+)?(\s{1})?(\w+[áàâãéèêíïóôõöúçñ])/

const nomeFormatado = nome.replace(regNome,
    (matchDaRegex, nome, espaço ,sobrenome) =>
    `${sobrenome}, ${nome}`);

console.log(nomeFormatado); //André, Pedro
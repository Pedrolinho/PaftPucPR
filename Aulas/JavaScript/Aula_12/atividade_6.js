const temperaturaF = `Curitiba: 48.2
São Paulo: 57.2
Alagoas: 77
Palmas: 73.4`;

const regTemp = /\b\d+\.?\d+?\b/mg;

const converterTemp = temperaturaF.replace(regTemp.test,
    (matchRegex, temp1, temp2, temp3, temp4) =>
    `Curitiba: ${(parseInt(temp1) - 32) * 5/9} 
    São Paulo: ${(parseInt(temp2) - 32) * 5/9} 
    Alagoas: ${(parseInt(temp3) - 32) * 5/9}
    Palmas: ${(parseInt(temp4) - 32) * 5/9}`)

console.log(converterTemp);
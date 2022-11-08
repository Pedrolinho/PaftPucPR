// Função chamada "join" que retorna os valores passados divididos por um separador.

const valores1 = [1, 2, 3, "índiozinhos"];
const valores2 = [4, 5, 6, "índiozinhos"];

const join = (valores, separador = ", ") => {
    if (valores.length === 0) return "";
    let saida = `${valores[0]}`
    for(let i=1; i < valores.length; i++) {
        saida += `${separador}${valores[i]}`
    }
    return saida;
}

console.log(join(valores1));
console.log(join(valores2));
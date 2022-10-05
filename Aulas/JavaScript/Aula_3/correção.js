const albuns = [
    {nome: "Mais", cantor: "Marisa Monte", ano: 1991, nota: 8.5},
    {nome: "A tempestade", cantor: "Legião Urbana", ano: 1996, nota: 9.5},
    {nome: "Domingo", cantor: "Titãs", ano: 1995, nota: 7.5},
    {nome: "Ouro de Minas", cantor: "Roupa Nova", ano: 2001, nota: 8},
    {nome: "Como estão vocês", cantor: "Titãs", ano: 2003, nota: 7},
    {nome: "Troco Likes", cantor: "Thiago Iorc", ano: 2015, nota: 4.5},
    {nome: "Dois", cantor: "Legião Urbana", ano: 1986, nota: 10},
    {nome: "Radiola", cantor: "Skank", ano: 2004, nota: 6.5},
    {nome: "Roupa acústico", cantor: "Roupa Nova", ano: 2004, nota: 9},
    {nome: "Umbilical", cantor: "Thiago Iorc", ano: 2011, nota: 3.5},
    {nome: "Barulhinho bom", cantor: "Marisa Monte", ano: 1996, nota: 7.5}
];

const cantores = [
    {nome: "Vinícius de Moraes", estilo: "MPB"},
    {nome: "Rita Lee", estilo: "Rock"},
    {nome: "Marisa monte", estilo: "MPB"},
    {nome: "Legião Urbana", estilo: "Rock"},
    {nome: "Titãs", estilo: "Rock"},
    {nome: "Roupa Nova", estilo: "Pop rock"},
    {nome: "Thiago Iorc", estilo: "Nova MPB"},
    {nome: "Skank", estilo: "Pop rock"}
];

// 1

const albunsMarisa = albuns
    .filter(a => a.cantor === "Marisa Monte")
    .map(a => ({nome: a.nome, ano: a.ano}));
console.log(albunsMarisa);
console.log();

// 2

const cantoresAlbuns = albuns.flatMap(a => [a.cantor, a.nome]);
console.log(cantoresAlbuns);
console.log();

// 3
const notas = albuns
    .filter(a => a.ano > 2005)
    .map(a => a.nota);
const soma = notas.reduce((a, e) => a + e);
console.log();

// 4
let contagem = {};


const albunsCantores = albuns.reduce((contagem, album) => {
    contagem[album.cantor] = !contagem[album.cantor] ? 1 : contagem[album.cantor] + 1;
    return contagem;
}, {});
console.log(albunsCantores);
console.log();

// 5
const mapCantores = cantores.reduce((m, c) => {
    m[c.nome] = c;
    return m;
}, {});
console.log(mapCantores);
console.log(mapCantores["Skank"]);

console.log();

albuns.forEach(a => a.cantor = mapCantores[a.cantor]);
console.log(albuns);
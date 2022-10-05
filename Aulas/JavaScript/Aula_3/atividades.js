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

// 1 - Gere uma lista de objetos com o nome e ano de todos os álbuns da
// Marisa Monte

const albunsMarisaFunction = function(...albuns){
    const albunsMarisaArray = [];
    for(const album of albuns){
        console.log(album);
        if (album.nome == "Marisa Monte") {
            albunsMarisaArray.push(album);
        }    
    }
    
    return albunsMarisaArray
}

console.log(albunsMarisaFunction(albuns));



// 2 - Gere uma lista contendo o nome de todos os cantores e álbuns. A 
//lista deve conter só os textos, não objetos.



// 3 - Calcule a média da nota dos discos anteriores ao ano de 2005.



// 4 - Gere uma lista contendo a quantidade de álbuns que cada cantor 
// possui, e em seguida, gere outra lista com o nome de todos os 
// cantores, sem repetições.



// 5 - Substitua o nome do cantor da lista anterior pelo seu objeto 
// correspondente, presente na lista abaixo:
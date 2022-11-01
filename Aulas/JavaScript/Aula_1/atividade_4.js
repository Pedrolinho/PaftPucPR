const pessoas = [
    {nome: "Paulo", cor: "pardo"},
    {nome: "Rafaela", cor: "preto"},
    {nome: "Isabela", cor: "outro"},
    {nome: "Emanuely", cor: "outro"},
    {nome: "Enzo", cor: "branco"},
    {nome: "Gabriel", cor: "pardo"},
    {nome: "Lorena", cor: "pardo"},
    {nome: "Lorenzo", cor: "preto"},
    {nome: "Kaique", cor: "pardo"},
    {nome: "Giovana", cor: "branco"},
    {nome: "João", cor: "preto"},
    {nome: "Larissa", cor: "preto"},
    {nome: "Ana", cor: "preto"},
    {nome: "Laura", cor: "outro"},
    {nome: "Luisa", cor: "outro"}
]

let contagem = {};
for (let pessoa of pessoas) {
    if (!contagem[pessoa.cor]) {
       contagem[pessoa.cor] = 1;
    } else {
       contagem[pessoa.cor]++;
    }
}
console.log(contagem);
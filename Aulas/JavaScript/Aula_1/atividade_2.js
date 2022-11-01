let chico = 1.50;
let zé = 1.10;
let ano = 2022;

console.log(`${ano}; Chico: ${chico.toFixed(2)}m; Zé: ${zé.toFixed(2)}m`);
while(chico >= zé) {
    chico += 0.02;
    zé += 0.03;
    ano++;
    console.log(`${ano}; Chico: ${chico.toFixed(2)}m; Zé: ${zé.toFixed(2)}m`);
}
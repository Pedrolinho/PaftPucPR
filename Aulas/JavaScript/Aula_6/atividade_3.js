let a = 0;
let b = 0;
let c = 0;
let contador = 0;

setTimeout(() => {
    a = 5;
    realizaCalculo();
}, 500);

setTimeout(() => {
    b = 10;
    realizaCalculo();
}, 200);

setTimeout(() => {
    c = 2;
    realizaCalculo();
}, 800);

function realizaCalculo(){
    contador = contador + 1;

    if(contador === 3) {
        console.log(a+b*c);
    }
}
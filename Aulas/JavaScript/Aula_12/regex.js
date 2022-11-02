//https://regex101.com/

console.log(/abc/.test("abcde"));
console.log("abcde".match(/abc/));

console.log(/^Processo/.test("Processo"));
console.log(/Processo:$/.test("A B C Processo:"));
console.log(/(na)+/.test("Banana"));


const myRe = /mundo/gmi;

const str = `Mundo mundo vasto mundo, 
se eu me chamasse Raimundo seria uma rima, não seria uma solução.
Mundo mundo vasto mundo, mais vasto é meu coração.`;

let myArray;
while ((myArray = myRe.exec(str)) !== null) {
    let msg = 'Encontrado ' + myArray[0] + ' em ' + myArray.index;
    msg += ' terminando em ' + myRe.lastIndex + ".";
    console.log(msg);
}

const result = [...str.matchAll(/mundo/gim)];
console.log(result);
// Função chamada "eCrescente" que retorna se a lista passada é crescente ou não.

list1 = [1, 2, 3, 4, 5, 6]; // crescente
list2 = [1, 2, 3, 2, 5, 6]; // decrescente

const eCrescente = list => {
    let crescente = true;
    for (let num of list) {
        if(num > (list[list.indexOf(num) + 1])) return crescente = false;
    }
    return crescente;
}

console.log(eCrescente(list1)); //true
console.log(eCrescente(list2)); //false
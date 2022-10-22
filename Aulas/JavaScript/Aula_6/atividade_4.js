function testNum(num) {
    return new Promise((resolve, reject) => {
        if(num>10) resolve(num);
        else reject(num);
    })
}

testNum(10)
    .then(() => console.log("Maior que 10!"))
    .catch(() => console.log("Menor ou igual a 10!"));

testNum(24)
    .then(() => console.log("Maior que 10!"))
    .catch(() => console.log("Menor ou igual a 10!"));
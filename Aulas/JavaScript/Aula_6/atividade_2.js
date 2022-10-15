function callback1 () {
    console.log("Pontifícia Universidade");

    setTimeout(callback2, 5000);
}

function callback2 () {
    console.log("Católica do");

    setTimeout(callback3, 500);
}

function callback3 () {
    console.log("Paraná");
}

setTimeout(callback1, 500);
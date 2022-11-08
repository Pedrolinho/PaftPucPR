function atualizaRelogio() {
    document
    .querySelector("#relogio")
    .innerHTML = new Date().toLocaleTimeString();
    }
    setInterval(atualizaRelogio, 1000);
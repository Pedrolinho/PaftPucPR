let index = 0;

var interval = setInterval(function(){
    console.log("PUCPR");
    index++;

    if (index >= 5) {
        clearInterval(interval);
    }
}, 500)
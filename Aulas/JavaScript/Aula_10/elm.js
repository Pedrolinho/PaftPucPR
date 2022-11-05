function elm(type, ...children) {
    const node = document.createElement(type);
    for (const child of children) {
        if (typeof child === "string") {
            node.appendChild(document.createTextNode(child));
        } else if (child instanceof Element) {
            node.appendChild(child);
        } else for (const [k, v] of Object.entries(child)) {
            node.setAttribute(k, v);
        }
    }
    return node
}

function citar() {
    const citacao = document
        .querySelector("#citacao")
        .appendChild(
            elm("footer", "-",
                elm("strong", "Carlos Drummond de Andrade"),
                ", extrato do ",
                elm("a", {href: "https://youtu.be/0oZN5GVzOoE"}, "Poema de Sete Faces"),
                elm("em", " (Alguma Poesia)"),
                ", 1930"
            )
        );
}
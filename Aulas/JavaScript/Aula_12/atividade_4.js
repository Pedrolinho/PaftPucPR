const cep = "O CEP de Peruíbe é 11750000";

const cepFormatado = cep.replace(/\b(\d{5})?(\d{3})\b/,
    (matchDaRegex, grupo1, grupo2) =>
    `${grupo1}-${grupo2}`);

console.log(cepFormatado); //11750-000
function turnObjectintoJSONString(input) {
    let object = {};
    for(let pair of input) {
        let tokens = pair.split("->");
        let key = tokens[0].trim();
        let value = tokens[1].trim();
        if(!isNaN(value)) {
            value = parseFloat(value);
        }
        object[key] = value;
    }

    let json = JSON.stringify(object);
    console.log(json);
}
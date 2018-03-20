function workingWithKeyValuePairs(input) {
    let object = {};
    for(let i = 0; i < input.length - 1; i++) {
        let tokens = input[i].split(' ');
        let key = tokens[0];
        let value = tokens[1];
        object[key] = value;
    }

    if(object.hasOwnProperty(input[input.length - 1])) {
        console.log(object[input[input.length - 1]]);
    } else {
        console.log("None");
    }
}
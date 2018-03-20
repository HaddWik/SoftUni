function setValues(input) {
    let length = Number(input[0]);
    let array = new Array(length).fill(0);

    for(let i = 1; i < input.length; i++) {
        let tokens = input[i].split(' ');
        let index = Number(tokens[0]);
        let value = Number(tokens[2]);
        array[index] = value;
    }

    for(let num of array) {
        console.log(num);
    }
}
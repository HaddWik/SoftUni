function calculate(input) {
    let numX = Number(input[0]);
    let numY = Number(input[1]);
    let numZ = Number(input[2]);

    if (numX == 0 || numY == 0 || numZ == 0)
    {
        return 'Positive';
    }
    else
    {
        let result = numX * numY * numZ;

        if (result < 0)
            return 'Negative';
        else
            return 'Positive';
    }
}

console.log(calculate(['3', '2', '-1']));
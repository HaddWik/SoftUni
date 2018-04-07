function doCalculation(input) {
    let N = Number(input[0]);
    let X = Number(input[1]);

    if (X >= N) {
        return N * X;
    }
    else {
        return N / X;
    }
}

console.log(doCalculation(['2', '3']));
console.log(doCalculation(['13', '13']));
console.log(doCalculation(['3', '2']));
console.log(doCalculation(['144', '12']));
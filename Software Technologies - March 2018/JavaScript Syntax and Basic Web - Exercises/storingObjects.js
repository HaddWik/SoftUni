function storingObjects(input) {
    let array = new Array();

    for(let string of input) {
        let tokens = string.split("->");
        let name = tokens[0].trim();
        let age = tokens[1].trim();
        let grade = tokens[2].trim();

        array.push({
            Name: name,
            Age: age,
            Grade: grade
        });
    }

    for(let student of array) {
        for(let key of Object.keys(student)) {
            console.log(`${key}: ${student[key]}`)
        }
    }
}

storingObjects(['Pesho -> 13 -> 6.00']);
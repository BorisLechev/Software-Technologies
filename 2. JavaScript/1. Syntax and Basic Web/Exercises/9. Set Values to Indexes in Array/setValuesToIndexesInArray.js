function setValuesToIndexes(input) {

    let lengthOfTheArray = Number(input[0]);
    let array = new Array(lengthOfTheArray).fill(0);

    for (let i = 1; i < input.length; i++) {
        let tokens = input[i].split(" - ")
            .map(Number);

        let index = tokens[0];
        let value = tokens[1];

        array[index] = value;
    }

    console.log(array.join('\n'));
}

setValuesToIndexes(['3', '0 - 5', '1 - 6', '2 - 7']);
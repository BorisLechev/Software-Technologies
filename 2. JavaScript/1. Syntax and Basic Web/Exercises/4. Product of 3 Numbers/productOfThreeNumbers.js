function isPositiveOrNegative(numbers) {

    let arrayOfNumbers = numbers.map(Number);
    let countOfNegativeNumbers = 0;

    if (arrayOfNumbers[0] == 0 || arrayOfNumbers[1] == 0 || arrayOfNumbers[2] == 0) {
        console.log('Positive');
        return;
    }

    arrayOfNumbers.forEach(e => {
        if (e < 0) {
            countOfNegativeNumbers++;
        }
    });

    console.log(numbers.map(Number).filter(e => e < 0).length % 2 == 0 ? "Positive" : "Negative");
}

isPositiveOrNegative(['2', '3', '-1']);
isPositiveOrNegative(['5', '4', '3']);
isPositiveOrNegative(['-3', '-4', '5']);
function printNumbersInReversedOrder(numbers) {

    numbers = numbers.map(Number).reverse();

    for (let value of numbers){
        console.log(value);
    }
}

printNumbersInReversedOrder([
    '10',
    '15',
    '20'
]);

printNumbersInReversedOrder([
    '5',
    '5.5',
    '24',
    '-3'
]);

printNumbersInReversedOrder([
    '20',
    '1',
    '20',
    '1',
    '20'
]);
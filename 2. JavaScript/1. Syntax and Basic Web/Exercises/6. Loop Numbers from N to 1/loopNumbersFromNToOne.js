function printNumbersFromNToOne(number) {

    let currentNumber = Number(number);

    for (let i = currentNumber; i >= 1; i--) {
        console.log(i);
    }
}

printNumbersFromNToOne('5');
printNumbersFromNToOne('2');
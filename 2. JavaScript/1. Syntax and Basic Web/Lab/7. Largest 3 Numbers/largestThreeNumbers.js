function solve(arr) {
    let numbers = arr.map(Number);

    numbers.sort((a, b) => a - b);

    console.log(numbers.pop());
    console.log(numbers.pop());
    console.log(numbers.pop());
}

solve([
    '10',
    '30',
    '15',
    '20',
    '50',
    '5'
]);
function solve(numbers) {

    let firstNumber = Number(numbers[0]);
    let secondNumber = Number(numbers[1]);

    if (secondNumber >= firstNumber) {
        console.log(secondNumber * firstNumber);
    }

    else {
        console.log(firstNumber / secondNumber);
    }
}

solve(['2', '3']);
solve(['13', '13']);
solve(['3', '2']);
solve(['144', '12']);
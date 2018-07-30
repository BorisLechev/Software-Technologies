function solve([numbers]) {
    numbers = numbers.split(' ').map(n => Number(n));

    if (numbers[0] + numbers[1] == numbers[2]) {
        print(numbers[0], numbers[1], numbers[2]);
    }

    else if (numbers[0] + numbers[2] == numbers[1]) {
        print(numbers[0], numbers[2], numbers[1]);
    }

    else if (numbers[1] + numbers[2] == numbers[0]) {
        print(numbers[1], numbers[2], numbers[0]);
    }

    else {
        console.log("No");
    }

    function print(n1, n2, n3) {
        console.log(`${Math.min(n1, n2)} + ${Math.max(n1, n2)} = ${n3}`);
    }
}

solve(['8 15 7']);
solve(['-5 -3 -2']);
solve(['3 8 12']);
solve(['0 0 0']);
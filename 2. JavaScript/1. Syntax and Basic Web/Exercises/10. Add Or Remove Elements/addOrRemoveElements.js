function addRemove(input) {

    let array = [];

    for (let line of input) {

        let tokens = line.split(' ');

        let command = tokens[0];

        switch (command) {
            case"add":
                let number = Number(tokens[1]);
                array.push(number);
                break;

            case"remove":
                let index = Number(tokens[1]);

                array.splice(index, 1);
                break;
        }
    }

    console.log(array.join('\n'));
}

addRemove([
    'add 3',
    'add 5',
    'remove 1',
    'add 7'
]);
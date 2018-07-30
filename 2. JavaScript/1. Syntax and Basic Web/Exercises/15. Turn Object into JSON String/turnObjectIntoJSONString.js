function solve(input) {
    let student = {};

    for (let line of input) {
        let tokens = line.split(" -> ");

        let propName = tokens[0];
        let value = isNaN(tokens[1]) ? tokens[1] : Number(tokens[1]);

        student[propName] = value;
    }

    console.log(JSON.stringify(student));
}

solve(['name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia']);
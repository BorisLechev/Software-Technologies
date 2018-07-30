function Calculator(leftOperand, operator1, operator2) {
    this.leftOperand = leftOperand;
    this.operator1 = operator1;
    this.operator2 = operator2;

    this.calculateResult = function () {
        let result = 0;
        let inMeter = 0;

        switch (this.operator1) {
            case"mm":
                inMeter = this.leftOperand / 1000;
                break;
            case"cm":
                inMeter = this.leftOperand / 100;
                break;
            case"inch":
                inMeter = this.leftOperand * 0.0254;
                break;
            case"foot":
                inMeter = this.leftOperand * 0.3048;
                break;
            case"yard":
                inMeter = this.leftOperand * 0.9144;
                break;
            case"meter":
                inMeter = this.leftOperand;
                break;
            case"km":
                inMeter = this.leftOperand * 1000;
                break;
            case"mile":
                inMeter = this.leftOperand * 1609.344;
                break;
        }

        switch (this.operator2) {
            case"mm":
                result = inMeter * 1000;
                break;
            case"cm":
                result = inMeter * 100;
                break;
            case"inch":
                result = inMeter * 39.370079;
                break;
            case"foot":
                result = inMeter * 3.280840;
                break;
            case"yard":
                result = inMeter * 1.093613;
                break;
            case"meter":
                result = inMeter;
                break;
            case"km":
                result = inMeter / 1000;
                break;
            case"mile":
                result = inMeter / 1609.344;
                break;
        }

        return result;
    }
}

module.exports = Calculator;
<form>
    <div>First Number:</div>
    <input type="text" name="num1">
    <div>Second Number:</div>
    <input type="text" name="num2">
    <button type="submit"><span style="color: navy">Sum</span></button>
</form>

<?php
if (isset($_GET['num1']) && isset($_GET['num2'])) {
    $num1 = $_GET['num1'];
    $num2 = $_GET['num2'];

    if (is_numeric($num1) && is_numeric($num2)) {

        $result = $num1 + $num2;
        echo "<div>The result is: $result</div>";
    } else {
        echo "<div>Enter valid numbers</div>";
    }
}
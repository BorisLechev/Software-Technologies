<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
    <form>
        X: <input type="text" name="num1" />
		Y: <input type="text" name="num2" />
        Z: <input type="text" name="num3" />
		<input type="submit" />
    </form>
<?php
if (isset($_GET['num1']) && isset($_GET['num2']) && isset($_GET['num3'])) {

    $negativeCount = 0;
    $num1 = $_GET['num1'];
    $num2 = $_GET['num2'];
    $num3 = $_GET['num3'];

    $numbers = array($num1, $num2, $num3);

    foreach ($numbers as $number){
        if ($number < 0){
            $negativeCount++;
        }
        else if ($number == 0){
          echo "Positive";
           return;
        }
    }

    if ($negativeCount % 2 == 1){
        echo "Negative";
    }

    else{
        echo "Positive";
    }
}
?>
</body>
</html>
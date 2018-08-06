<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num'])) {
    $num = intval($_GET['num']);
    if ($num == 1) {
        echo "1 ";
    } else if ($num == 2) {
        echo "1 1 ";
    } else if ($num == 3) {
        echo "1 1 2 ";
    } else {
        echo "1 1 2 ";
        $prePrev = 1;
        $prev = 1;
        $next = 2;

        for ($i = 3; $i < $num; $i++) {
            $sum = $prePrev + $prev + $next;
            $prePrev = $prev;
            $prev = $next;
            $next = $sum;

            echo "$sum ";
        }
    }
}
?>
</body>
</html>
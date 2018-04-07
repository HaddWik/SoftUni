<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>PHP Basic Syntax - Exercises</title>

</head>
<body>
<form>
    N: <input type="text" name="num" />
    <input type="submit" />
</form>
<?php
    if (isset($_GET['num'])){
        $number=intval($_GET['num']);
        $numbers;
        for ($i=1 ; $i<=$number;$i++){
            $numbers[]=$i;
        }

        echo join(' ',$numbers);
    }
?>
</body>
</html>
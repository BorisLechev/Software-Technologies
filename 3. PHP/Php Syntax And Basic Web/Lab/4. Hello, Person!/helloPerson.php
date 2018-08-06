<form>
    <div>Name: <input type="text" name="name"></div>
    <button type="submit"><span style="color: navy">Submit</span></button>
</form>

<?php
if (isset($_GET["name"])) {
    $name = $_GET["name"];
    echo "<div>Hello, $name!</div>";
}
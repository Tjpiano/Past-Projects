<?php
try {
    $dbh = new PDO('mysql:https://cpanel.kingty.dev.fast.sheridanc.on.ca/cpsess8184418553/3rdparty/phpMyAdmin/db_structure.php?db=kingty_data&token=f85225ef4116ccbace14b85aa4e68dd9#PMAURL-0:db_structure.php?db=kingty_data&table=&server=1&target=&token=f85225ef4116ccbace14b85aa4e68dd9;dbname=kingty_data',
                   'kingty','EY9SeKWG6r#');
} catch (Exception $e) {
    die('Could not connect to DB: ' . $e->getMessage());
}
?>
<html>
    <head>
        <title>Tyler King Assignment 7 (Book Store)</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <h1>What would you like to do</h1>
    <form action="create.php">
	 <input type='submit' value='Create a table'>
	 </form>
	 <form action="insert.php" method="GET">
	 <fieldset>
	 <p> Insert Record Here </p>
	 Book <input type="text" name="book" required><br>
	 Author <input type="text" name="aut" required><br>
	 Publisher <input type="text" name="pub" required><br>
	 Year Published<input type="number" name="date" min="0" required><br>
	 </fieldset>
	 <input type='submit' value='Insert rows'>
	 </form>
	 <form action="delete.php" method="GET">
	 <fieldset>
	 <p> What Book Do You want to delete from the record? </p>
	 Book <input type="text" name="book" required><br>
	 <input type='submit' value='Delete rows'>
	 </form>
	 <form action="update.php" method="GET" >
	 RecordID <input type="number" name="num" required><br>
	 Book <input type="text" name="book" required><br>
	 <input type='submit' value='Update rows'>
	 </form>
	 
	</body>
</html>
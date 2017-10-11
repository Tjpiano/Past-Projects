<?php
try {
    $dbh = new PDO('mysql:https://cpanel.kingty.dev.fast.sheridanc.on.ca/cpsess8184418553/3rdparty/phpMyAdmin/db_structure.php?db=kingty_data&token=f85225ef4116ccbace14b85aa4e68dd9#PMAURL-0:db_structure.php?db=kingty_data&table=&server=1&target=&token=f85225ef4116ccbace14b85aa4e68dd9;dbname=kingty_data',
                   'kingty','EY9SeKWG6r#');
} catch (Exception $e) {
    die('Could not connect to DB: ' . $e->getMessage());
}
$command = 'CREATE TABLE books (
    ID int NOT NULL,
    Book varchar(255),
    Author varchar(255),
    Publisher varchar(255),
    Date int, 
    PRIMARY KEY (ID)
);';
$stmt = $dbh->prepare($command);
$success = $stmt->execute();
if ($success) {
    echo "<p>Table Books Has Been Created</p>";
}
else{
   echo "<p>Did not succeed</>";
}
?>
<html>
    <head>
        <title>Create</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
	<body>
	<a href="main.php" >Go back</a>
	</body>
</html>
<?php
try {
    $dbh = new PDO('mysql:https://cpanel.kingty.dev.fast.sheridanc.on.ca/cpsess8184418553/3rdparty/phpMyAdmin/db_structure.php?db=kingty_data&token=f85225ef4116ccbace14b85aa4e68dd9#PMAURL-0:db_structure.php?db=kingty_data&table=&server=1&target=&token=f85225ef4116ccbace14b85aa4e68dd9;dbname=kingty_data',
                   'kingty','EY9SeKWG6r#');
} catch (Exception $e) {
    die('Could not connect to DB: ' . $e->getMessage());
}
$command = 'SELECT'.$_GET["check1"].'FROM syst10199 =? ';
$stmt = $dbh->prepare($command);
$success = $stmt->execute();
if($_Get["name"]=null){}
else{
	$params = ('where'.$_GET["text"].'='.$_GET["name"]);
	$success = $stmt->execute($params);
}
if ($success) {
    $row = $stmt->fetch();
	while($row = $stmt->fetch()) {
    echo "<p>{ $row['ID'] }<p>";
}	
}
else{
   echo "<p>Did not succeed</>";
}
?>
<html>
    <head>
        <title>Delete</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
	<body>
	<a href="main.php" >Go back</a>
	</body>
</html>
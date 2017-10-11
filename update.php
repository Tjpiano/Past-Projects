<?php
try {
    $dbh = new PDO('mysql:kingty.dev.fast.sheridnac.on.ca;dbname=kingty_data',
                   'kingty','EY9SeKWG6r#');
} catch (Exception $e) {
    die('Could not connect to DB: ' . $e->getMessage());
}
$command = '
';
$stmt = $dbh->prepare($command);
$success = $stmt->execute();
if ($success) {
    echo "<p>{$stmt->rowCount()} rows.</p>";
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
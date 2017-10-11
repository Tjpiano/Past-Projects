<?php
try {
    $dbh = new PDO('mysql:kingty.dev.fast.sheridnac.on.ca;dbname=kingty_data',
                   'kingty','EY9SeKWG6r#');
} catch (Exception $e) {
    die('Could not connect to DB: ' . $e->getMessage());
}
?>
<html>
</html>
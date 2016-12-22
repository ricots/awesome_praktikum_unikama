<?php
$query = mysql_query("select * from style");
$tampil = mysql_fetch_array($query);
?>
<h2><?php echo $tampil['title_contact'];?></h2>
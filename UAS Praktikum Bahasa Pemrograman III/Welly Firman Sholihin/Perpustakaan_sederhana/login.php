<html>
<head><title></title>
<link rel="stylesheet" type="text/css" href="style2.css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body class="twoColElsLtHdr">

<div id="container">
<?php
include "header.php";
?>
  <div id="sidebar1">
<?php
include "menu.php";
?>
</div>
</div>

  <div id="mainContent"><center>
  <br><br><br><br><br><br><h2>Silahkan login terlebih dahulu</h2>

<form method="post" action="proses.php"><table><tr><td>
User </td><td>:</td><td> <input type="text" name="user"><br/></td></tr>
<tr><td>Pass</td><td>:</td><td> <input type="password" name="pass"><br/></td></tr><br><br>
<tr><td></td><td></td><td><input type="submit" value="Login"></td></tr></table>
</form>
</center>
</div>
<br class="clearfloat" />
<?php
include "footer.php";
?>
</div>

</body>
</html>
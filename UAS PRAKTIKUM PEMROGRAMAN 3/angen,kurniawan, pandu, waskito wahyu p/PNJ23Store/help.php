<?php 
$tampil = mysql_fetch_array(mysql_query("select * from style"))or die(mysql_error());
?>
<h2><?php echo $tampil['title_help'];?></h2>
	<table border="1px" class="table" style="width:95%; height:auto; margin-bottom:10%; margin-top:3%;">
		<tr>
			<td align="center" style="text-align:justify;">
				<pre><?php echo $tampil['help'];?></pre>
			</td>
		</tr>
	</table>
<h2>Add Category</h2>
<?php 
if(isset($_POST['ok'])){
$nama = $_POST['name_category'];
$table = "category";
$value = "'','$nama'";
$db->insert($table, $value);
header('location :.?i=insert_item');
}
?>
	<a href=".?i=insert_item"><button class='btn btn-primary' align='center' style="margin-right:0%;">Add Product</button></a>
	<a href=".?i=product_list"><button class='btn btn-primary' align='center' style="margin-right:0%; margin-left:0%;">Product List</button></a>
	<a href=".?i=home&id=1"><button class='btn btn-primary' align='center' style="margin-right:0%; margin-left:0%;">Product preview</button></a><center>
<form action=".?i=add_kat" method="POST">
<table class="table-insert" style="width:40%;">
		<tr>
			<td>Name Category</td>
			<td><input type="text" class="form-control" name="name_category" required placeholder="Name Category" style="width:  100%;"/></td>
		</tr>
		<tr>
			<td colspan=2 align="right"><button type="submit" name="ok" class="btn btn-primary">Save</button></td>
		</tr>
</table>
</form>
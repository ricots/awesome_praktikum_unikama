<?php

        include 'koneksi.php';


        $sql    = "select * from tb_status order by id_status";
        $result = mysqli_query($koneksine, $sql) or die("Error in Selecting " . mysqli_error($koneksine));

        $temp_array = array();

                   while($row =mysqli_fetch_assoc($result))
                       {
                              $temp_array[] = $row;
                       }
                            echo json_encode($temp_array);

                      
                            mysqli_close($koneksine);
  

?>
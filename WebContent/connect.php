<?php
$host="localhost";
$user="root";
$db="login";
$conn=new mysqli($host,$user,$pass,$db);
if($conn->connect_error){
    echo "failed to conncect DB".$conn->connect_error;
}
?>

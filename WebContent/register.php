<?php
include 'connect.php';
if(isset($_post['signup'])){
$firstname=$_post['fname'];
$password=$_post['password'];
$email=$_post['email'];
$password=md5($password);

$checkEmail="SELECT *from users where email='$email';
$result=$conn->query($checkEmail);
if($result->num_row>0){
 echo "Email Address Already Exists !";
}
else{
$insertQuery="INSERT INTO users(firstname,password,email)"
           VALUES('$firstname','$password','$email','$password)";
           if($conn->query($insertQuery)==TRUE){
            header("location:index.php");
           }
           else{
            echo "Error:"$conn->error;
           }
        }
    if(isset($_post['signIn'])){
        $email=$_post['email'];
        $password=$_post['password'];
        $password=md5($password);
        $sql="SELECT * FROM users WHERE email='$email' and password='$password'"
        $result=$conn->query($sql);
        if($result->num_rows>0){
            session_start();
            $row=$result->fetch_assoc();
            $-SESSION['email']=$row['email'];
            header("location:homepage.php");
            exit();
        }
        else{
            echo "Not Found,Incorrect Email or Password";

        }

        }

    ?>





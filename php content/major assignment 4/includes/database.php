<?php

$db_host = "elvisdb.rowan.edu";
$db_name = "henryt19";
$db_user = "henryt19";
$db_pass = "11PurpleGrapes!9!";


$conn = mysqli_connect($db_host, $db_user, $db_pass, $db_name);

if (mysqli_connect_error()){
	echo mysqli_connect_error();
	exit;
}
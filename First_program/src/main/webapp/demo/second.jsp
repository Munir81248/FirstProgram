<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	body
	{
		margin: 0;
		padding: 0;
		font-family: sans-serif;
		background: url("G:/Wallpaper/Nature Wallpaper Set 100/ocean_waves.jpg");
		background-size: cover;
	
	}
	.box
	{
		position: absolute;
		top: 50%;
		left: 50%;
		transform: translate(-50%, -50%);
		width: 800px;
		padding: 40px;
		background: rgba(0,0,0,.7);
		box-sizing: border-box;
		box-shadow: 0 15px 25px rgba(0,0,0, .5);
		border-radius: 10px;
	}
	.box h1
	{
		margin: 0;
		padding: 0;
		color: #fff;
		text-align: center;
		letter-spacing: 1px;
	}
	.box h2
	{
		margin: 0;
		padding: 0;
		color: #fff;
		text-align: center;
		text-decoration:underline;
	}
</style>
</head>
<body>
<div class="box">
<h2>First Number : ${first}</h2><br>
<h2>Second Number: ${second}</h2><br>
<br>
<h1>Addition = ${calculate}</h1>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  <title>Sign Up</title>
  
  
  <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>
<meta name="viewport" content="width=device-width, initial-scale=1">

   <style type="text/css">
    	<%@include file="css/style.css"%>
    </style>

  
</head>

<body>
    <div class="login-form" align="center">
    <br><br><br>
    <h1>Sign Up</h1>
         <form action="efetuaRegistro" method="post" enctype="multipart/form-data">
     <div class="form-group ">
        <input type="file" name="file" id="foto_perfil" class="inputFile"/><br>
	</div>
     <div class="form-group ">
       <input type="text" class="form-control" placeholder="Name " id="nome"><br>
     </div>
     <div class="form-group ">
       <input type="text" class="form-control" placeholder="Username " id="username"><br>
     </div>
     <div class="form-group ">
       <input type="text" class="form-control" placeholder="E-mail " id="email"><br>
     </div>
     <div class="form-group log-status">
       <input type="password" class="form-control" placeholder="Password" id="password"><br>
     </div>
     <div class="form-group log-status">
       <input type="password" class="form-control" placeholder="Confirm Password" id="password"><br>
     </div>
     <div class="form-group ">
       <input type="text" class="form-control" placeholder="Bio " id="bio"><br>
     </div>
     <div class="form-group ">
     	<input type="text" class="form-control" placeholder="Link da sua playlist p�blica do Spotify " id="trilha"><br>
    </div>
     <input type="submit" class="log-btn" value="Cadastrar" >
     </form>
     </div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

       <script type="text/javascript">
    	<%@include file="js/index.js"%>
    </script>

</body>
</html>

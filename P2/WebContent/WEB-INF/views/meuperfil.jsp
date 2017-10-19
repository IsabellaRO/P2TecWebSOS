<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meu Perfil</title>
<meta charset="utf-8">
<meta name="format-detection" content="telephone=no">
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico">


    <style type="text/css">
        <%@include file="css/stuck.css"%>
        <%@include file="css/style2.css"%>
        <%@include file="css/ihover.css"%>
    </style>

    <script type="text/javascript">
    	<%@include file="js/jquery.js"%>
    	<%@include file="js/jquery-migrate-1.1.1.js"%>
    	<%@include file="js/script.js"%>
    	<%@include file="js/superfish.js"%>
    	<%@include file="js/jquery.equalheights.js"%>
    	<%@include file="js/jquery.mobilemenu.js"%>
    	<%@include file="js/jquery.easing.1.3.js"%>
    	<%@include file="js/tmStickUp.js"%>
    	<%@include file="js/jquery.ui.totop.js"%>
    </script>

<script>
 $(document).ready(function(){
  $().UItoTop({ easingType: 'easeOutQuart' });
  $('#stuck_container').tmStickUp({});
  });
</script>
</head>
<body class="page1" id="top">

<!--==============================
              header
=================================-->
<header>
<!--==============================
            Stuck menu
=================================-->
  <section id="stuck_container">
    <div class="container">
      <div class="row">
        <div class="grid_12">
        <h1>
          <a href="index.jsp">
            <img src="images/logo.png" alt="Logo alt">
          </a>
        </h1>
          <div class="navigation ">
            <nav>
              <ul class="sf-menu">
               <a href="index.jsp">
                 <img src="images/Sua_pag.png" alt="" height="50">
          	  <a href="login.jsp.html">
          		<img src="images/logout.png" alt="" height="50">
             </ul>
            </nav>
            <div class="clear"></div>
          </div>
        </div>
      </div>
    </div>
  </section>
</header>
<!--=====================
          Content
======================-->
<section class="content"><div class="ic">More Website Templates @ TemplateMonster.com - June 16, 2014!</div>
  <div class="container">
    <div class="row">
      <div class="grid_12">

        <div class="ta__center">
               <img src="" alt="" width=200>
        <div class="bio">       
		
       </div>
          <div class="banners">        
            <a href="post" class="banner2">
              <img src="images/quadradomais.jpg" alt="">
            </a>
                  
           <p class="post"> 
 </p>
             	
	
          </div>
      </div>
    </div>
  </div>
</section>
</body>
</html>
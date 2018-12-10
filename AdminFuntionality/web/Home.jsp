<%-- 
    Document   : Homepage
    Created on : 10-Dec-2018, 09:57:03
    Author     : K00215515 Evan Grimes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link href="css/layout.css" rel="stylesheet" type="text/css">
        <link href="css/font.css" rel="stylesheet" type="text/css">
        <link href="css/colour.css" rel="stylesheet" type="text/css">
        <style>
.mySlides {display:none}
.w3-left, .w3-right, .w3-badge {cursor:pointer}
.w3-badge {height:13px;width:13px;padding:0}
</style>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
<!--        <link href="fonts/OpenSans-Regular.ttf" rel="fonts" type="text/css">-->
        <title>Log In</title> 
    </head>
    <body>
        <div class="logIn-page">
            <header class="main-header">
                <div class="Logo">
                <img src="images/litGalleryLogo.png" alt="Logo"/ height="800px" width="300px">
                </div>
                <div class="nav">
                    <label for="toggle">&#9776;</label>
                    <input type="checkbox" id="toggle"/>
                    <div class="menu">

                        <a href="Home.jsp">Home</a>
<!--                        <a href="Gallery.html">Gallery</a>-->
                        <a href="Shows.jsp">Shows</a>
<!--                        <a href="Profile.html">Profile</a> -->
                        <a href="SignUp.jsp">SignIn</a> 
                        <a href="Logout.jsp">Logout</a> 
                    </div>
                </div>
            </header> 
            <body>
                <div class="BodyCol">
            
                
                
            
            
                
                
                
                <div class="w3-content w3-display-container">
                <img class="mySlides" src="img/Sample1.png" height="800px" width=90% class="center">
                <img class="mySlides" src="img/Sample2.jpg" height="800px" width=90% class="center">
                <img class="mySlides" src="img/Sample3.jpg" height="800px" width=90% class="center">
                <img class="mySlides" src="img/Sample5.jpg" height="800px" width=90% class="center"> 
                <div class="w3-center w3-display-bottommiddle" style="width:100%">
                <div class="wrapper">
                
                
                  <div class="w3-center w3-container w3-section w3-large w3-text-white w3-display-bottommiddle" style="width:100%">  
                    
                <div class="buttonCon">   
                <div class="w3-left" onclick="plusDivs(-1)">&#10094;</div>
                <div class="w3-right" onclick="plusDivs(1)">&#10095;</div>
                </div> 
                </div>    
                    
                <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(1)"></span>
                <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(2)"></span>
                <span class="w3-badge demo w3-border w3-transparent w3-hover-white" onclick="currentDiv(3)"></span>
                </div>
                </div></div>
                    
                    
                    
                <div class="HomeMessage">
                    
                <h1>
                    
                Home
                    
                </h1> 
                    
                <p>
                    
                    Welcome to the home of our gallery site.    
                    
                </p> 
                    
                <p>
                    
                   Here you can navigate to our gallery and shows pages.    
                    
                </p>   
                
                
                </div>
                
                
               
                
            
           
            <div class="titles"><h2>Gallery</h2></div>   
            
            <img src="img/Sample3.jpg" alt="Sample"/ height="550px" width=60% class="center">    
            
            <div class="titles2"><h2>Shows</h2></div>   
            <div class="ImgHoBot">
            <img src="img/Sample5.jpg" alt="Sample"/ height="450px" width=40%> 
            
            <img src="img/Sample5.jpg" alt="Sample"/ height="450px" width=40%> 
           </div>
                
                
                
                
                
                
            
            
            
            
            
            </div>
            </body>
        </div>
        <div class="footer">
            <footer></footer>
        </div>
    </body>
    
    <script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function currentDiv(n) {
  showDivs(slideIndex = n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("demo");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
     dots[i].className = dots[i].className.replace(" w3-white", "");
  }
  x[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " w3-white";
}
</script>

</html>

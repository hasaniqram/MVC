
<div class="container">
<%
Auth bean = (User)request.getAttribute("User");
String name = bean.getName();
// sends to method getCookie and assign the return value to value for printing.
String value = Cookies.getCookie(request, name);
%>
<h1 style="text-align: center"><% out.print("Welcome " + bean.getName()); %></h1><br><br><br>
<h3>What is Lorem Ipsum?</h3><br>
 <p style="text-align: left">

<h3 style="text-align: center"><% out.print("Cookie Value: " + value); %></h3>
 <br><br><a href="index.html">Return to login </a>
 </div>
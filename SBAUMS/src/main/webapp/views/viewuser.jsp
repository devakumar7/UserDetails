<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <body bgcolor="pink">
<h1>User Details</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    <th>Password</th>
    <th>Edit</th>
    <th>Delete</th></tr>  
   <c:forEach var="user" items="${users}">   
   <tr>  
   <td>${user.id}</td>  
   <td>${user.email}</td>  
   <td>${user.name}</td>  
   <td>${user.password}</td>  
   <td><a href="edituser/${user.id}">Edit</a></td>  
   <td><a href="deleteuser/${user.id}">Delete</a></td>  
   </tr>  
   
   </c:forEach>  
   </table>  
   <br/>  
   <a href="/">Add New User</a>  
   </body>

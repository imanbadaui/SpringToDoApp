  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="webjars\bootstrap\5.3.3\css\bootstrap.min.css">
    <title>My Website</title>
  </head>

  <body>
  <div class ="container" >
  <h1> Todos </h1>
   <table class = "table">
       <tr>
           <th>ID</th>
           <th>Description</th>
           <th>LocalDate</th>
           <th>isDone?</th>
           <th> </th>
           <th> </th>
       </tr>
       <c:forEach items="${allTodosList}" var="todo">
           <tr>
               <td>${todo.id}</td>
               <td>${todo.description}</td>
               <td>${todo.localDate}</td>
               <td>${todo.isDone} </td>
               <td> <a href="update-todo?id=${todo.id}" class="btn btn-success"> Update  </a> </td>
               <td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning"> Delete </a> </td>
           </tr>
       </c:forEach>
   </table>

   <a href="todo" class = "btn btn-success"> Add New Todo </a>
  </div>

   <script src="webjars\bootstrap\5.3.3\js\bootstrap.min.js">  </script>
      <script src="webjars\jquery\3.7.1\jquery.min.js">  </script>
  </body>

</html>
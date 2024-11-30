<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="webjars\bootstrap\5.3.3\css\bootstrap.min.css" rel="stylesheet">
    <link href="webjars\bootstrap-datepicker\1.10.0\css\bootstrap-datepicker.standalone.min.css" rel="stylesheet">
    <title>My Website</title>
  </head>

  <body>
  <div class ="container" >
  <form:form method="post" modelAttribute ="todo">

        <form:input type="text" path="description"  required="required" />
        <form:errors path="description" />
        <form:input type="text" path="localDate" id="localDate" required="required" />
        <form:input type="hidden" path="id" />
        <form:input type="hidden" path="isDone" />

        <input type="submit" value="submit" class="btn btn-success">
  </form:form>
  </div>

   <script src="webjars\bootstrap\5.3.3\js\bootstrap.min.js">  </script>
      <script src="webjars\jquery\3.7.1\jquery.min.js">  </script>
      <script src="webjars\bootstrap-datepicker\1.10.0\js\bootstrap-datepicker.min.js"> </script>

     <script type="text/javascript">
     	$(#localDate').datepicker({
     	    format: 'yyyy-mm-dd'
     	});
     </script>

  </body>

</html>
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
  <div class = "container">
   <h1> Login </h1>
   <div> ${ERROR_MESSAGE} </div>
        <form method="post">
              <input type="text" placeholder="Enter your username" name="username" required>
              <input type="password" placeholder="Enter your password" name="password" required>
              <input type="submit" value="Submit">
        </form>
  </div>

 <script src="webjars\bootstrap\5.3.3\js\bootstrap.min.js">  </script>
      <script src="webjars\jquery\3.7.1\jquery.min.js">  </script>
  </body>

</html>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
    <title>Arithmetic Calculator</title>
  </head>
  <body>
    <nav class="navbar navbar-light bg-dark">
      <a class="navbar-brand" style="margin: auto; font-size: 30px; color: white; font-weight: bold; text-transform: uppercase;"> Arithmetic Calculator </a>
    </nav>
	
    <div id="outputCard" class="card" style="width: 40%; margin: auto; margin-top: 50px">
      <div class="card-body">
          <div class="alert alert-info" id="input" style="margin-top: 10px;margin-bottom: 10px;" role="alert"> <strong>Given Expression: </strong> ${expression} </div>
          <div class="alert alert-success" id="output" style="margin-top: 10px;margin-bottom: 10px;" role="alert"> <strong>Result:</strong> ${result} </div>
          </form>
      </div>
    </div>
    
    <nav style="position: absolute; bottom: 0px; width: 100%" class="navbar navbar-light bg-dark">
      <a class="navbar-brand" style="margin: auto; font-size: 15px; color: white; font-weight: bold"> Design By Sudha | All Rights Reserved </a>
    </nav>
  </body>
</html>
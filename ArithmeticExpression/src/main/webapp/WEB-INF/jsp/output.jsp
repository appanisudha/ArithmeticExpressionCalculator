<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
    </br>
    <div style="text-align:center">
        <input type="submit" onclick="fetchAll()"  class="btn btn-primary" value="ViewAll"/>
    </div>
    </br>
    <div class="container" id="container">
  		<h2><center>Arithmetic Calculations Table<center></h2>        
  		<table class="table table-bordered" id="table"></table>
	</div>
    
          
    <nav style="position: absolute; bottom: 0px; width: 100%" class="navbar navbar-light bg-dark">
      <a class="navbar-brand" style="margin: auto; font-size: 15px; color: white; font-weight: bold"> Design By Sudha | All Rights Reserved </a>
    </nav>
  </body>
</html>

<script>
    document.getElementById("container").style.display='none';
    function fetchAll() {
    	document.getElementById("container").style.display='block';
 		const api_url = "http://localhost:8050/calculations";
 		getapi(api_url);
	}
	
	async function getapi(url) {
    
    	// Storing response
    	const response = await fetch(url);
	    
    	// Storing data in form of JSON
    	var data = await response.json();
    	console.log(data);
    	if (response) {
        	show(data);
    	}
	}
	
	function show(data) {
    	let tab = 
        	`<tr>
          	<th>Id</th>
          	<th>Expression</th>
          	<th>Result</th>
         	</tr>`;
    
    	// Loop to access all rows 
    	for (let r of data.list) {
        	tab += `<tr> 
    		<td>${r.id} </td>
    		<td>${r.expression}</td>
    		<td>${r.result}</td>          
			</tr>`;
    	}
    	// Setting innerHTML as tab variable
    	document.getElementById("table").innerHTML = tab;
	}
	
	
</script>

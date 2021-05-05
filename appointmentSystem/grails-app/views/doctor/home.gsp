<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title> Welcome to Sheffield Surgeries </title>
	<asset:stylesheet src="home.css"/>
</head>
<body>

	<div id="content" role="main">

</div> <g:doctorloginToggle/>

<div class ="row">

	<div class="first">

		<h3>Prescription Management</h3>
		<p> Add a new prescription to Sheff Surgeries system</p>
		<button type="button" class="btn btn-success">
		<g:link controller="prescription" action="create"> Add new prescription </g:link>
		</button>
		
	<div class ="second">

	
		<h3>Prescription List</h3>
		<p> Displays current active prescriptions </p>
		<button type="button" class="btn btn-success">
		<g:link controller="prescription" action="index">List Active Prescriptions</g:link>
		</button>

	</div>

	<div class ="first">

		<h3>Patient List</h3>
		<p> Displays current patients </p>
		<button type="button" class="btn btn-success">
		<g:link controller="patient" action="index">List patients</g:link>
		</button>

	</div>

	<div class ="second">

		<h3>Appointment List</h3>
		<p> List current appointments</p>
		<button type="button" class="btn btn-success">
		<g:link controller="appointment" action="index">List Appointments</g:link>
		</button>

	

	<div class="first">

		<h3>Search</h3>
		<p>Search Prescriptions Records</p>
		<button type="button" class="btn btn-success">
		<g:link controller="prescription" action="search"> Search Medicine </g:link>
		</button>


</div>
</div>
</div>
</body>
</html>

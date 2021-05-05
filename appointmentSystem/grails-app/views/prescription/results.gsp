<!doctype html>
<html>
   <head>
      <meta name="layout" content="main"/>
      <title> Welcome to Sheffield Surgeries </title>
      <asset:stylesheet src="home.css"/>
      <!-- placeholder for stylesheet -->
   </head>
   <body>
      <div class="row">
         <h3> Search results | Prescriptions </h3>
      </div>
      <div class="row">
         <p> Searched ${totalPrescriptions} records 
            for items matching <em>${term}</em>
            Found <strong>${prescriptions.size()}</strong> prescriptions.
         </p>
	</div>
	<div class="row">
         <ul>
            <g:each var="prescription" in="${prescriptions}">
               <li>
                  <g:link controller="patient" action="show"
                     id="${prescription.id}">${prescription.medicine}
                  </g:link>
               </li>
            </g:each>
         </ul>
      </div>
      <div class="row">
         <button type="button" class="btn btn-success">
            <g:link action='search'>Search again</g:link>
         </button>
      </div>
   </body>
</html>

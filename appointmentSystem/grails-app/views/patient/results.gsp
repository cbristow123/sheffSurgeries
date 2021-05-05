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
         <h3> Search results | Patients </h3>
      </div>
      <div class="row">
         <p> Searched ${totalPatients} records 
            for items matching <em>${term}</em>
            Found <strong>${patients.size()}</strong> patients.
         </p>
      </div>
      <div class="row">
         <ul>
            <g:each var="patient" in="${patients}">
               <li>
                  <g:link controller="patient" action="show"
                     id="${patient.id}">${patient.patientName}
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

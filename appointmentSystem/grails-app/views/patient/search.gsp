<!doctype html>
<html>
   <head>
      <meta name="layout" content="main"/>
      <title>Welcome to Sheffield Surgeries </title>
      <asset:stylesheet src="home.css"/>
      <!-- placeholder for when I eventually add stylesheet -->
   </head>
   <body>
      <div class="row">
         <h1> Sheffield Surgeries </h1>
      </div>
      <div class="row">
         <formset>
            <legend> Search Patients </legend>
            <g:form action="results">
               <label for ="name"> Patient Name, ID or Residence</label>
               <g:textField name="name"/>
               <g:submitButton name="search" value="Search" />
            </g:form>
         </formset>
      </div>
   </body>
</html>

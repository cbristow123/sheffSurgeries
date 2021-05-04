<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title> Secret Page </title>
</head>
<body>

<div class="svg" role="presentation">
    <div class="grails-logo-container">
        <asset:image src="sheffSurgeries.jpg" class="grails-logo"/>
    </div>
</div>

<div class="Second Header">
	<section class="row colset-2-its">
		<h3> PLACEHOLDER </h3>
</div>

<div id="content" role="main">
    <section class="row colset-2-its">
        <h1>Welcome to Sheffield Surgeries</h1>
        <div id="controllers" role="navigation">
            <h2>Available Controllers:</h2>
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                    </li>
                </g:each>
            </ul>
        </div>
    </section> 
</div>

</div><g:loginToggle/>
</div><g:doctorloginToggle/>

</body>
</html>

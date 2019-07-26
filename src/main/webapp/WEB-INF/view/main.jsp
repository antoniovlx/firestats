<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>

<!--Import Google Icon Font-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!--Import materialize.css-->

<!-- let's add tag srping:url -->
<spring:url value="/css/crunchify.css" var="crunchifyCSS" />
<spring:url value="/js/crunchify.js" var="crunchifyJS" />

<link href="${crunchifyCSS}" rel="stylesheet"/>



<!--Let browser know website is optimized for mobile-->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
	<h3>Form</h3>

	<form action="bye" method="get">
		Name: <input type="text" name="name" /> LastName: <input type="text"
			name="lastname" /> <input type="submit" />
	</form>
	<!--JavaScript at end of body for optimized loading-->
	<script src="${crunchifyJS}"></script>
</body>
</html>
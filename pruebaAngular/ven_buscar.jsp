<html ng-app="demo">
	<head>
		<title>VENDEDORES</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
		<script src="con_ven_buscar.js"></script>
	</head>
<body ng-controller="controlador as ctrl">
	<h1>Vendedor</h1>
	<table>
		<tr ng-repeat="x in ctrl.listarVendedoresPorID">
			<td>{{ x.k_vendedor }}</td>
			<td>{{ x.n_nom_pr_ven }}</td>
			<td>{{ x.n_nom_sg_ven }}</td>
			<td>{{ x.n_ape_pr_ven }}</td>
			<td>{{ x.n_ape_sg_ven }}</td>
		</tr>
	</table>

</body>
</html>
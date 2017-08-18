<html ng-app="demo">
	<head>
		<title>PRODUCTOS</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
		<script src="con_ven_buscar_pro.js"></script>
	</head>
<body ng-controller="controlador as ctrl">
	<h1>Listado de productos</h1>
	<table>
		<tr ng-repeat="x in ctrl.listarProductosPorVendedor">
			<td>{{ x.k_producto }}</td>
			<td>{{ x.n_producto }}</td>
			<td>{{ x.o_des_prod }}</td>
		</tr>
	</table>

</body>
</html>
'use strict';
angular.module('demo', []).controller(
		'controlador',
		function($scope, $http) {
			var ctrl = this;
			$http.get('http://localhost:8080/pruebaTecnica/vendedorProductoPorID/1').then(
					function(response) {
						ctrl.listarProductosPorID = response.data;
					});
		});
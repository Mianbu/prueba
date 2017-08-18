'use strict';
angular.module('demo', []).controller(
		'controlador',
		function($scope, $http) {
			var ctrl = this;
			$http.get('http://localhost:8080/pruebaTecnica/vendedorEliminar/1').then(
					function(response) {
						ctrl.eliminarVendedor = response.data;
					});
		});
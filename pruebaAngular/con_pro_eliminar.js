'use strict';
angular.module('demo', []).controller(
		'controlador',
		function($scope, $http) {
			var ctrl = this;
			$http.get('http://localhost:8080/pruebaTecnica/productoEliminar/1').then(
					function(response) {
						ctrl.eliminarProducto = response.data;
					});
		});
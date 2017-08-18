'use strict';
angular.module('demo', []).controller(
		'controlador',
		function($scope, $http) {
			var ctrl = this;
			$http.get('http://localhost:8080/pruebaTecnica/productos').then(
					function(response) {
						ctrl.listarProductos = response.data;
					});
		});
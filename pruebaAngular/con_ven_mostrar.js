'use strict';
angular.module('demo', []).controller(
		'controlador',
		function($scope, $http) {
			var ctrl = this;
			$http.get('http://localhost:8080/pruebaTecnica/vendedores').then(
					function(response) {
						ctrl.listarVendedores = response.data;
					});
		});
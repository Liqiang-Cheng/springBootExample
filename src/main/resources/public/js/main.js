"use strict"

var springBoot = angular.module('springBoot', ['ngRoute']);

springBoot.config(['$routeProvider', function($routeProvider) {
       $routeProvider.
            when('/', {
                templateUrl: '/partials/greeting.html',
                controller: 'greetingController'
            })
}]);
springBoot.controller('greetingController', function ($scope, $http) {
    var url = "/greeting";
    $http.get(url).success(function(data) {
        console.log(data);
        $scope.greeting = data;
    });
});
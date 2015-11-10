angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    
      
        
    .state('workSaavy', {
      url: '/page1',
      templateUrl: 'templates/workSaavy.html',
      controller: 'workSaavyCtrl'
    })
        
      
    
      
        
    .state('home', {
      url: '/page2',
      templateUrl: 'templates/home.html',
      controller: 'homeCtrl'
    })
        
      
    
      
        
    .state('tasks', {
      url: '/page3',
      templateUrl: 'templates/tasks.html',
      controller: 'tasksCtrl'
    })
        
      
    
      
        
    .state('task-1', {
      url: '/page4',
      templateUrl: 'templates/task-1.html',
      controller: 'task-1Ctrl'
    })
        
      
    ;

  // if none of the above states are matched, use this as the fallback
  $urlRouterProvider.otherwise('/page2');

});
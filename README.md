This is fork of lampaa's startapp Phonegap Plugin (https://github.com/lampaa/com.lampa.startapp)

Plugin to cordova 3.0 or above. Plugin to launch application in android device by Intent Action.

***
	Go to your project directory and run the commands below:

	- CORDOVA PROJECT
		To install plugin:
			cordova plugin add "git url"

		To remove plugin:
			cordova plugin remove com.android.startapp

	- IONIC PROJECT
	To install plugin:
			ionic plugin add "git url"

		To remove plugin:
			ionic plugin remove com.android.startapp

***
	SAMPLES TO USE PLUGIN

<<<<<<< HEAD
	Callback method that get "OK" message to sucess.
=======
	Callback method that get success message to sucess.
>>>>>>> edit readme

var _successCallback = function (message) {
	console.log(message);
};

	Callback method that get error message.

var _errorCallback = function (message) {
	console.log(message);
};

<<<<<<< HEAD
	"Action" valeu to launch the Gallery application

startApp._start(["android.intent.category.APP_GALLERY"], _successCallback, _errorCallback);

	"Action" valeu to launch CAMERA application

startApp._start(["android.media.action.IMAGE_CAPTURE"], _successCallback, _errorCallback);

	"Action" valeu to launch the SETTINGS application
=======
	Action valeu to launch the Gallery application

startApp._start(["android.intent.category.APP_GALLERY"], _successCallback, _errorCallback);

	Action valeu to launch CAMERA application

startApp._start(["android.media.action.IMAGE_CAPTURE"], _successCallback, _errorCallback);

	Action valeu to launch the SETTINGS application
>>>>>>> edit readme

startApp._start(["android.settings.SETTINGS"], _successCallback, _errorCallback);

	Sample to launch app with params (key: value).

var args = [["yourIntent"], [{"sessionId": "123"}, {"userId": "appadmin"}, {"userName": "admin"}]];
<<<<<<< HEAD
startApp._start(args, _successCallback, _errorCallback);

Ps: If you want starp app only values -> startApp._start([["yourIntent"], ["param1", "param2", "paramN"]], _successCallback, _errorCallback);
=======

startApp._start(args, _successCallback, _errorCallback);

	Ps: If you want start app only values
	-> startApp._start([["yourIntent"], ["param1", "param2", "paramN"]], _successCallback, _errorCallback);
>>>>>>> edit readme

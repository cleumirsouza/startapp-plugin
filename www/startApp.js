
var exec = cordova.require('cordova/exec');

	/**
	 * Start application from device (android)
	 *
	 * @param {Mixed} message				sample in README.md file.
	 * @param {Function} completeCallback   The callback that is called when open app
	 * @param {Function} errorCallback		The callback that is called when an error occurred when the program starts.
	 */
exports._start = function(message, completeCallback, errorCallback) {
		return exec(completeCallback, errorCallback, "startApp", "start", (typeof message === 'string') ? [message] : message);
	}

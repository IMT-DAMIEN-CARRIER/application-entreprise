"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports["default"] = void 0;

var _ApiClient = _interopRequireDefault(require("../ApiClient"));

var _Heure = _interopRequireDefault(require("../model/Heure"));

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { "default": obj }; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

/**
* HelloController service.
* @module api/HelloControllerApi
* @version 1.0
*/
var HelloControllerApi = /*#__PURE__*/function () {
  /**
  * Constructs a new HelloControllerApi. 
  * @alias module:api/HelloControllerApi
  * @class
  * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
  * default to {@link module:ApiClient#instance} if unspecified.
  */
  function HelloControllerApi(apiClient) {
    _classCallCheck(this, HelloControllerApi);

    this.apiClient = apiClient || _ApiClient["default"].instance;
  }
  /**
   * Callback function to receive the result of the helloUsingGET operation.
   * @callback module:api/HelloControllerApi~helloUsingGETCallback
   * @param {String} error Error message, if any.
   * @param {module:model/Heure} data The data returned by the service call.
   * @param {String} response The complete HTTP response.
   */

  /**
   * hello
   * @param {module:api/HelloControllerApi~helloUsingGETCallback} callback The callback function, accepting three arguments: error, data, response
   * data is of type: {@link module:model/Heure}
   */


  _createClass(HelloControllerApi, [{
    key: "helloUsingGET",
    value: function helloUsingGET(callback) {
      var postBody = null;
      var pathParams = {};
      var queryParams = {};
      var headerParams = {};
      var formParams = {};
      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = _Heure["default"];
      return this.apiClient.callApi('/heure', 'GET', pathParams, queryParams, headerParams, formParams, postBody, authNames, contentTypes, accepts, returnType, null, callback);
    }
  }]);

  return HelloControllerApi;
}();

exports["default"] = HelloControllerApi;
/**
 * Api Documentation
 * Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import Heure from './model/Heure';
import HelloControllerApi from './api/HelloControllerApi';


/**
* Api_Documentation.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var ApiDocumentation = require('index'); // See note below*.
* var xxxSvc = new ApiDocumentation.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new ApiDocumentation.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new ApiDocumentation.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new ApiDocumentation.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Heure model constructor.
     * @property {module:model/Heure}
     */
    Heure,

    /**
    * The HelloControllerApi service constructor.
    * @property {module:api/HelloControllerApi}
    */
    HelloControllerApi
};

let apiInstance = new HelloControllerApi();
window.apiInstance = apiInstance;
apiInstance.helloUsingGET((error, data, response) => {
    if (error) {
        console.error(error);
    } else {
        console.log('API called successfully. Returned data: ' + data);
    }
});

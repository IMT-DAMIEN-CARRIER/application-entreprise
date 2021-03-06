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

import ApiClient from '../ApiClient';

/**
 * The Heure model module.
 * @module model/Heure
 * @version 1.0
 */
class Heure {
    /**
     * Constructs a new <code>Heure</code>.
     * @alias module:model/Heure
     */
    constructor() { 
        
        Heure.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Heure</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Heure} obj Optional instance to populate.
     * @return {module:model/Heure} The populated <code>Heure</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Heure();

            if (data.hasOwnProperty('heure')) {
                obj['heure'] = ApiClient.convertToType(data['heure'], 'Number');
            }
            if (data.hasOwnProperty('minute')) {
                obj['minute'] = ApiClient.convertToType(data['minute'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} heure
 */
Heure.prototype['heure'] = undefined;

/**
 * @member {Number} minute
 */
Heure.prototype['minute'] = undefined;






export default Heure;


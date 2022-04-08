"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports["default"] = void 0;

var _ApiClient = _interopRequireDefault(require("../ApiClient"));

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { "default": obj }; }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

/**
 * The Heure model module.
 * @module model/Heure
 * @version 1.0
 */
var Heure = /*#__PURE__*/function () {
  /**
   * Constructs a new <code>Heure</code>.
   * @alias module:model/Heure
   */
  function Heure() {
    _classCallCheck(this, Heure);

    Heure.initialize(this);
  }
  /**
   * Initializes the fields of this object.
   * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
   * Only for internal use.
   */


  _createClass(Heure, null, [{
    key: "initialize",
    value: function initialize(obj) {}
    /**
     * Constructs a <code>Heure</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Heure} obj Optional instance to populate.
     * @return {module:model/Heure} The populated <code>Heure</code> instance.
     */

  }, {
    key: "constructFromObject",
    value: function constructFromObject(data, obj) {
      if (data) {
        obj = obj || new Heure();

        if (data.hasOwnProperty('heure')) {
          obj['heure'] = _ApiClient["default"].convertToType(data['heure'], 'Number');
        }

        if (data.hasOwnProperty('minute')) {
          obj['minute'] = _ApiClient["default"].convertToType(data['minute'], 'Number');
        }
      }

      return obj;
    }
  }]);

  return Heure;
}();
/**
 * @member {Number} heure
 */


Heure.prototype['heure'] = undefined;
/**
 * @member {Number} minute
 */

Heure.prototype['minute'] = undefined;
var _default = Heure;
exports["default"] = _default;
/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Heure;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-23T09:44:31.412608+01:00[Europe/Paris]")

@Validated
@Api(value = "heure", description = "the heure API")
public interface HeureApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /heure : hello
     *
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @ApiOperation(value = "hello", nickname = "helloUsingGET", notes = "", response = Heure.class, tags={ "hello-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Heure.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/heure",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Heure> helloUsingGET() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"heure\" : 0, \"minute\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

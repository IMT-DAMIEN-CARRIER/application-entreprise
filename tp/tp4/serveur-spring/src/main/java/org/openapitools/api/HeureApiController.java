package org.openapitools.api;

import org.openapitools.model.Heure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-23T09:44:31.412608+01:00[Europe/Paris]")

@Controller
@RequestMapping("${openapi.apiDocumentation.base-path:}")
public class HeureApiController implements HeureApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public HeureApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Heure> helloUsingGET()
    {
        Heure heure = new Heure();
        heure.setHeure(10);
        heure.setMinute(43);

        return new ResponseEntity<>(heure, HttpStatus.OK);
    }
}

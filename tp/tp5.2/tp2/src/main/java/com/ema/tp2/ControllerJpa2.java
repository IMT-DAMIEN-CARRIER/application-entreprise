package com.ema.tp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@RestController
public class ControllerJpa2 {
    @Autowired
    UserRepository repoUser;

    /*
     * Le client doit envoyer Accept: application/json pour que Spring boot renvoye
     * un objet json, sinon recoit du HTML.
     */
    @GetMapping("/users2/{id}")
    public User getUsers(@PathVariable final Integer id, final HttpServletResponse response) throws IOException {
        Optional<User> user = repoUser.findById(id);

        if(user.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                    "{\"error\":\"utilisateur inconnu\"}");
            return null;
        }

        return user.get();
    }

    @RequestMapping(value="/createUser2",method= RequestMethod.POST, produces="application/json")
    public Integer createUsers() {
        User jane=new User();
        jane.setNom("jane");
        jane.setPrenom("prenon jane");
        repoUser.save(jane);

        return jane.getId();
    }
}

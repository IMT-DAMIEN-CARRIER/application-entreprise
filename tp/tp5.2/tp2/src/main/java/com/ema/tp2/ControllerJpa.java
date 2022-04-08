package com.ema.tp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
public class ControllerJpa {
    @Autowired
    EntityManager em;

    /*
     * Le client doit envoyer Accept: application/json pour que Spring boot renvoye
     * un objet json, sinon recoit du HTML.
     */
    @GetMapping("/users/{id}")
    public User getUsers(@PathVariable final Integer id, final HttpServletResponse response) throws IOException {
        User user = em.find(User.class, id);
        if (user == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                    "{\"error\" 🙁 utilisateur inconnu\"}");
            return null;
        }
        return user;
    }

    @Transactional
    @RequestMapping(value = "/createUser", method = RequestMethod.POST, produces = "application/json")
    public Integer createUsers() {
        User jane = new User();
        jane.setNom("doe");
        jane.setPrenom("jane");
        em.persist(jane);

        return jane.getId();
    }

//    @Transactional
//    @RequestMapping(value = "/createUserCustom", method = RequestMethod.POST, produces = "application/json")
//    public Integer createUsersCustom(@RequestBody UserDTO user) {
//        User newUser = new User();
//        newUser.setNom(user.getNom());
//        newUser.setPrenom(user.getPrenom());
//        em.persist(newUser);
//        return newUser.getId();
//    }
}
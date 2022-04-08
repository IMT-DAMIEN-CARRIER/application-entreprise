package com.example.demo;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller // indique que HelloController est un web controller
@ResponseBody // la valeur retournée par la fonction est directement intégré dans le body
// @RestController // correspond a @Controller + @ResponseBody
public class HelloController {
    @RequestMapping(
            value = "/heure",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    // @GetMapping(path = "/heure", produces = "application/json")
    public String hello() {
        var date = new Date();

        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("templates/todo.template");

        return "{\"Hello\":\"eee\"}";
    }
}

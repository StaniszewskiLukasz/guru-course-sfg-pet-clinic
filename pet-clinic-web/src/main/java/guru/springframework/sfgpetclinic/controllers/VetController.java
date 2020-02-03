package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Łukasz Staniszewski on 2020-02-03
 * @project sfg-pet-clinic
 */
@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index","vets/index.html"})
    public String listVets(){

        return "vets/index";
    }

}

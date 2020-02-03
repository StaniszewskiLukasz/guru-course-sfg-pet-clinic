package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Łukasz Staniszewski on 2020-02-03
 * @project sfg-pet-clinic
 */
@Controller
public class OwnersController {

    @RequestMapping({"owners/index","/owners","owners/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}

package spc.guruspring5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spc.guruspring5.services.OwnerService;

/**
 * spc 27/08/20
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;
    
    /**
     * @param ownerService
     */
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwner(Model model){
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    
}

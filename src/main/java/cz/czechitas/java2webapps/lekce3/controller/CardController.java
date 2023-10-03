package cz.czechitas.java2webapps.lekce3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CardController {
   @GetMapping("/")
   public ModelAndView index (){
       ModelAndView result = new ModelAndView("card");
       return result;
   }

}

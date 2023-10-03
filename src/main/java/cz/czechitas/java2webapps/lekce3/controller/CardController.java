package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CardController {
   @GetMapping("/")
   public ModelAndView index (){
       ModelAndView result = new ModelAndView("card");

       Person person = new Person();
       Address address = new Address();
       person.setGivenName("Eliška");
       person.setSurname("Krásnohorská");
       person.setPhotoURL("https://thispersondoesnotexist.com/");
       person.setBirthDate(LocalDate.of(1947, 11,18));
       result.addObject("person", person);
       address.setStreetName("Vocelkova 155");
       address.setLocalityCode("500 00, Praha");
       result.addObject("address",address);
       return result;
   }

}

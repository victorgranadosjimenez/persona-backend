package mvc.controller;


import lombok.extern.slf4j.Slf4j;
import mvc.domain.Address;
import mvc.domain.Person;
import mvc.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;



@Slf4j
@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://127.0.0.1:4200"})
@RequestMapping("/personas")
public class PersonController {


    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }





    @GetMapping(value={"","/"})
    public List<Person> all() {
        return this.personService.all();
    }


    //para añadir address a Person
    @PostMapping("/{id}/add-address")
    public Person addAddress(@PathVariable Long id, @RequestBody Address address) {

        return personService.addAddressToPerson(id, address);
    }




    /*en postman podriamos añadir esto:
    {
        "houseNumber": "456",
            "street": "Calle Mayor",
            "city": "Barcelona",
            "postCode": "08001"
    }*/



}

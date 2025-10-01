package mvc.service;


import jakarta.transaction.Transactional;
import mvc.domain.Address;
import mvc.domain.Person;
import mvc.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonService {

    @Autowired
    private final PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {

        this.personRepository = personRepository;
    }

    public List<Person> all() {
        return this.personRepository.findAll();
    }



    @Transactional
    public Person addAddressToPerson(Long personId, Address address) {
        Person person = personRepository.findById(personId)
                .orElseThrow(() -> new RuntimeException("Persona no encontrada"));

        // Creamos nuevo address
        Address addr = Address.builder()
                .street(address.getStreet())
                .houseNumber(address.getHouseNumber())
                .city(address.getCity())
                .postCode(address.getPostCode())
                .build();

        person.getAddresses().add(addr);
        return personRepository.save(person);
    }


}

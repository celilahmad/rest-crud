package app.controller;

import app.model.Person;
import app.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/save")
    public String savePerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    @PostMapping("/saveAll")
    public List<Person> saveAll(@RequestBody List<Person> people){
        return personService.savePeople(people);
    }

    @GetMapping("/getAll")
    public List<Person> getAllPeople(){
        return personService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Person getById(@PathVariable int id){
        return personService.getPersonById(id);
    }

    @GetMapping("/getByName/{name}")
    public Person getByName(@PathVariable String name){
        return personService.getPersonByName(name);
    }

    @PutMapping("/update")
    public Person updatePerson(@RequestBody Person person){
        return personService.updatePerson(person);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id){
        return personService.deletePersonById(id);
    }
}

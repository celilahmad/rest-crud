package app.service;

import app.model.Person;
import app.repository.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public String savePerson(Person person){
        personRepo.save(person);
        return "success!!";
    }

    public List<Person> savePeople(List<Person> people){
        return personRepo.saveAll(people);
    }

    public List<Person> getAll(){
        return personRepo.findAll();
    }

    public Person getPersonById(int id){
        return personRepo.findById(id).orElse(null);
    }

    public Person getPersonByName(String name){
        return personRepo.findByName(name);
    }

    public Person updatePerson(Person person){
        Person updatePerson = personRepo.findById(person.getId()).orElse(null);
        updatePerson.setName(person.getName());
        updatePerson.setJob(person.getJob());
        return personRepo.save(updatePerson);
    }

    public String deletePersonById(int id){
        personRepo.deleteById(id);
        return "deleted!!";
    }
}

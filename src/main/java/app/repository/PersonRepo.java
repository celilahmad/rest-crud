package app.repository;

import app.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer> {
    Person findByName(String name);
}

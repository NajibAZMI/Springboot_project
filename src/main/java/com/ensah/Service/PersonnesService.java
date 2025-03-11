package com.ensah.Service;

import com.ensah.Model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonnesService implements IPersonnesService {
    private List<Person> persons = new ArrayList<>(); // Initialisation

    @Override
    public void add(Person person) {
        persons.add(person);
    }

    @Override
    public List<Person> getAll() {
        return persons;
    }

    @Override
    public void delete(long id) {
        boolean removed = persons.removeIf(person -> person.getId() == id);
        if (removed) {
            System.out.println("Person with ID " + id + " deleted successfully.");
        } else {
            System.out.println("Person with ID " + id + " not found.");
        }
    }
    @Override
    public Person findById(long id) {
        return persons.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
    @Override
    public void update(Person updatedPerson) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getId() == updatedPerson.getId()) {
                persons.set(i, updatedPerson);
                break;
            }
        }
    }

}

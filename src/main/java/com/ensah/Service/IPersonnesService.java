package com.ensah.Service;

import com.ensah.Model.Person;

import java.util.List;

public interface IPersonnesService {
    void add(Person person);
    List<Person> getAll();
    void delete(long id);
    public Person findById(long id);

    void update(Person updatedPerson);
}

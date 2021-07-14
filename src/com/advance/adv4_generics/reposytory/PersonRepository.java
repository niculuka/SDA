package com.advance.adv4_generics.reposytory;

import com.advance.adv4_generics.model.Person;

public class PersonRepository extends IdentifiableRepository <Person>{

    public Person getPersonByName(String name) {
        for (Person person : items) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

}

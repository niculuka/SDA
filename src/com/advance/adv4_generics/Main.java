package com.advance.adv4_generics;

import com.advance.adv4_generics.model.Person;
import com.advance.adv4_generics.reposytory.IdentifiableRepository;

/**     Create the Identifiable interface with the fallowing method:
 - getId: String
 Create the IdentifiableRepository class, which will be responsible for:
 - adding objects
 - searching for objects with the indicated id
 - removing objects based on the provided id
 Create 3 child classes for the Identifiable class:
 - Car
 - Person
 - MobilePhone
 Test the IdentifiableRepository in a main class.
 */

public class Main {
    public static void main(String[] args) {
        IdentifiableRepository<Person> personRepository = new IdentifiableRepository<>();
        Person person = new Person();
        person.setCNP("24556565462545");
        person.setName("Richard");
        personRepository.addItem(person);
        System.out.println(personRepository.getItemById("23"));
        System.out.println(personRepository.getItemById("24556565462545"));

        personRepository.removeItemById("24556565462545");
        System.out.println(personRepository.getItemById("24556565462545"));
    }
}

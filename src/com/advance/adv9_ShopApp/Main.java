package com.advance.adv9_ShopApp;
import com.advance.adv9_ShopApp.repository.GroceryProductRepository;
import com.advance.adv9_ShopApp.repository.GroceryProductRepositoryImpl;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        GroceryProductRepository groceryProductRepository = new GroceryProductRepositoryImpl();
        System.out.println(groceryProductRepository.findByName("Snapple - Mango Maddness"));
    }
}

/**
 * # **Write a java application that simulates an online shop .**
 *
 * **1. Encapsulation**
 *      - create the class Account that encapsulates the fallowing data:
 *      - id: String
 *      - billingAddress: String
 *      - isClosed: Boolean
 *      - creationDate: Date
 *      - closedDate: Date
 *      - The class Customer should have a constructor with all the files and getters for all the fields.
 *
 * **2. Composition**
 *      - create the class Customer that encapsulates the fallowing data:
 *      - id: String
 *      - address: String
 *      - phone: String
 *      - email: String
 *      - an Account instance
 *      - The class Customer should have a constructor with all the files and getters for all the fields.
 *
 * **3. Enums**
 *      - create the enum CustomerState with some values (New, Active, Closed, Banned).
 *      - Override the toString method to print the pretty name.
 *      - create a method that should return if the state permits shopping
 *
 * **4. Interface**
 *      - create the interface Sellable with the fallowing methods:
 *      - getPrice()
 *      - getCurrency()
 *      - getName()
 *      - getDescription()
 *      - getProductCategory()
 *
 * **5. Abstarct class**
 *      - create the abstract class FoodProduct  that implements Sellable and encapsulates the fallowing data:
 *      - expirationDate: date
 *      - isBio: boolean
 *      - countryOfOrigin: String
 *      - create a constructor that will accept all the fields as parameters
 *      - add getters for all the fields
 *      - (**OPTIONAL**) create the abstract SoftwareProduct that implements Sellable and encapsulates the fallowing data:
 *      - receivedOnMail: boolean
 *      - sentOnDvdDisk: boolean
 *      - licenseType: String
 *      - releasedBy: String
 *      - create a constructor that will accept all the fields as parameters
 *      - implement the method send on email
 *      - add getters for releasedBy and licenseType
 *
 * **6. Inheritance**
 *      - create new classes that will inherit the FoodProduct class
 *      - GroceryProduct
 *      - (**OPTIONAL**) PetsFoodProduct
 *      - (**OPTIONAL**) create new classes that will inherit the Software class:
 *      - OsProduct
 *      - AntivirusProduct
 *
 * **7. Exceptions**
 *      - Use exceptions to validate the data passes into constructors when
 *      - OsProduct,AntivirusProduct,GroceryProduct or PetsFoodProduct is called.
 *
 * **8. Generic types**
 *      - Create a generic interface for a repository that can hold items that are extending Sellable.
 *      - This repository should have the fallowing methods:
 *      - add(T)
 *      - search(Id)
 *      - remove(Id)
 *      - get(Id)
 *
 * **8. Collections (and Maps)**
 *      - Create the implementation for the generic repository. Optimize the collection that will store the elements for all the existing actions.
 *
 * **9. Input/Output**
 *      - When the application is starting all the product repositories all loaded with data from the provided files.
 *      - When a product is bought a new file should be created with the data about the order.
 *
 * **9. Lambda expressions,Optionals,Streams**
 *      - Use Lambda expressions,Optionals,Streams where the situation permit, for example:
 *      - replace regular "for" with foreach
 *      - use streams for sorting
 *      - use Optional where return result from methods may be null
 *      - use streams for sorting
 *      - use streams to parse the data received from IO
 */
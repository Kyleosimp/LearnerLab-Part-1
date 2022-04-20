package io.zipcoder.interfaces;

public class Person {
    //The class should declare a final field named id of type long.
    private final long id;
    //The class should declare a field named name of type String.
    private  String name;

    //Person constructor should have a parameter of type long and String which sets the id and name field to the respective values.
    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }
    //The class should define a getName() method which returns the Person object's name field.
    public String getName() {
        return name;
    }
    //The class should define a setName() method which sets the Person object's name field.
    public void setName(String name) {
        this.name = name;
    }
    //The class should define a getId() method which returns the Person object's id field.
    public long getId() {
        return id;
    }
}

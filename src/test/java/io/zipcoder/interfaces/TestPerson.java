package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    private Person person;
    //Create a testConstructor method which ensures that a Person object's id and name field are being set upon construction.
    @Test
    public void testConstructor(){
        //given
        person = new Person(42069, "Kyle");
        //when
        long actualID= person.getId();
        String actualName = person.getName();
        //then
        Assert.assertEquals(person.getId(), actualID);
        Assert.assertEquals(actualName, person.getName());
    }
    @Test
    public void testSetName(){
        //given
        long expectedID = 0;
        String expectedName = "Kyle";
        String actualName = "Kyle";
        //when
        person = new Person(expectedID, expectedName);
        //then
        Assert.assertEquals(expectedName, actualName);
    }

}

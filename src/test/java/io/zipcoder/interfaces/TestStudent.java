package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    private Student student;
    //Create a testImplementation method that asserts that a Student is an instanceof a Learner.
    @Test
    public void testImpementation(){
        student = new Student(412414214, "Kyle");
        Assert.assertTrue(student instanceof ILeaner);
    }
    //Create a testInheritance method that asserts that a Student is an instanceof a Person.
    @Test
    public void testInheritance(){
        student = new Student(412414214, "Kyle");
        Assert.assertTrue(student instanceof Person);
    }
    //Create a testLearn method that ensures a Student's totalStudyTime instance variable is incremented by the specified numberOfHours by invoking the .learn method.
    @Test
    public void testLearn(){
        double expectedHours = 6.0;
        double expectedStudyTime = 12.0;
        student = new Student(412414214, "Kyle");
        student.learn(expectedHours);
        double actualStudyTime = student.getTotalStudyTime();
        Assert.assertEquals(expectedStudyTime, actualStudyTime);
    }
}

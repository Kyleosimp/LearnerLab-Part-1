package io.zipcoder.interfaces;

public class Student extends Person implements ILeaner {
    //Student is a subclass of Person
    //Student is a subclass of Person
    //Student implements the Learner interface
    //Student should have an instance variable totalStudyTime of type double
    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
        this.totalStudyTime = getTotalStudyTime();
    }

    //Student should have a concrete implementation of the learn method which increments the totalStudyTime variable by the specified numberOfHours argument.
    @Override
    public void learn(double numberofHours) {
        totalStudyTime += numberofHours;
    }
    //Student should have a getTotalStudyTime() method which returns the totalStudyTime instance variable.
    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}

package io.zipcoder.interfaces;

//Instructor is a subclass of Person
//Instructor implements the Teacher interface
public class Instructor extends Person implements ITeacher{

    public Instructor(long id, String name) {
        super(id, name);
    }
//Instructor should have a concrete implementation of the teach method which invokes the learn method on the specified Learner object.
    @Override
    public void teach(ILeaner leaner, double numberOfHours) {
        leaner.learn(numberOfHours);
    }
//Instructor should have a concrete implementation of the lecture method which invokes the learn method on each of the elements in the specified array of Learner objects.
    @Override
    public void lecture(ILeaner[] learners, double numberOfHours) {
        //numberOfHours should be evenly split amongst the learners.
        //double numberOfHoursPerLearner = numberOfHours / learners.length;
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (ILeaner leaner : learners){
            leaner.learn(numberOfHoursPerLearner);
        }



    }
}

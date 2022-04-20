package io.zipcoder.interfaces;

public interface ITeacher {
/*
    Create a Teacher interface.

    Teacher should declare a teach method signature:
    Method name: teach
    Method parameters:
    Learner learner
    double numberOfHours
    Method return-type: void
*/
    void teach(ILeaner leaner, double numberOfHours);
/*
    Teacher should declare a lecture method signature:
    Method name: lecture
    Method parameters:
    Learner[] learners
    double numberOfHours
    Method return-type: void
*/
    void lecture(ILeaner[] learners, double numberOfHours);
}

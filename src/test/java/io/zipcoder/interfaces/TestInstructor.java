package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    private Instructor instructor;
    private Student student;
    private Student[] students;
    //Create a testImplementation method that asserts that an Instructor is an instanceof a Teacher.
    @Test
    public void testImplementation(){
        //given
        //when
        instructor = new Instructor(1, "Mikaila");
        //then
        Assert.assertTrue(instructor instanceof ITeacher);
    }
    //Create a testInheritance method that asserts that a Instructor is an instanceof a Person.
    @Test
    public void testInheritance(){
        //given
        //when
        instructor = new Instructor(1, "Mikaila");
        //then
        Assert.assertTrue(instructor instanceof Person);
    }
    //Create a testTeach method that ensures when an Instructor invokes the teach method, a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
    @Test
    public void testTeach(){
        //given
        Student student = new Student(2, "Kyle");
        Instructor instructor = new Instructor(1, "Mikaila");
        instructor.teach(student, 6.0);
        //when
        Double expectedHours = 18.0;
        Double actualHours = student.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedHours, actualHours);
    }
    //Create a testLecture method that ensures when an Instructor invokes the lecture method, a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.
    public void testLecture(){
        //given
        Instructor instructor = new Instructor(1, "Mikaila");
        Student student1 = new Student(2, "Kyle");
        Student student2 = new Student(3, "Luis");
        Student student3 = new Student(4, "John");
        Student[] students = {student1, student2, student3};
        //when
        instructor.lecture(students, 18.0);
        //then
        Assert.assertEquals(18.00, student1.getTotalStudyTime(), 0);
    }
}

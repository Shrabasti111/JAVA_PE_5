package com.stackroute.pe5;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void inputListOfStudentsReturnSortedList() {  //checks whether the result matches with the expected output
        ArrayList<StudentSorter> students=new ArrayList<StudentSorter>();
        StudentSorter student1=new StudentSorter("2","sandhya",21);
        StudentSorter student2=new StudentSorter("3","sheela",23);
        StudentSorter student3=new StudentSorter("5","sneha",22);
        StudentSorter student4=new StudentSorter("1","yash",23);
        StudentSorter student5=new StudentSorter("6","sapna",24);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        String result=Student.implementer(students);
        assertEquals("[Student{id='2', name='sandhya', age=21}, Student{id='5', name='sneha', age=22}, Student{id='3'," +
                " name='sheela', age=23}, Student{id='1', name='yash', age=23}, Student{id='6', name='sapna', age=24}]",result);
    }


}
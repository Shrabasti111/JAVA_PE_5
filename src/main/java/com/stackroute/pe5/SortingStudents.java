package com.stackroute.pe5;

import java.util.Comparator;

public class SortingStudents implements  Comparator<StudentSorter> {

    @Override
    public int compare(StudentSorter o1, StudentSorter o2) {
        if(o1.getAge() == o2.getAge())
        {
            if(o1.getName().compareTo(o2.getName())==0)
                return o1.getId().compareTo(o2.getId());
            else return o1.getName().compareTo(o2.getName());
        }
        else if(o1.getAge()>o2.getAge())
            return 1;
        else
            return -1;
    }

}

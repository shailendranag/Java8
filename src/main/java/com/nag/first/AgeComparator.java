package com.nag.first;

import java.util.Comparator;

public class AgeComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        StudentPOJO sp1 = (StudentPOJO) o1;
        StudentPOJO sp2 = (StudentPOJO) o2;

        if(sp1.age == sp2.age)
            return 0;
        else if(sp1.rollno > sp2.rollno)
            return 1;
        else
            return -1;
    }
}

package com.nag.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Start {
    public static void main (String args[]){
        List<StudentPOJO> ll = new ArrayList<StudentPOJO>();

        ll.add(new StudentPOJO(23,"shaym",13));
        ll.add(new StudentPOJO(11,"kayan",99));
        ll.add(new StudentPOJO(45,"tiru",56));

        Collections.sort(ll);

        for(StudentPOJO st : ll)
            System.out.println(st.age +" "+ st.Name +" "+ st.rollno );
    }
}

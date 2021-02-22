package com.nag.first;

public class StudentPOJO implements Comparable <StudentPOJO> {

    int rollno;
    String Name;
    int age;

    StudentPOJO(int rollno,String name,int age){
        this.rollno=rollno;
        this.Name=name;
        this.age=age;
    }

    public int compareTo(StudentPOJO st) {
        if(age== st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}

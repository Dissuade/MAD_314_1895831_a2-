
package com.example.mad314a2;

import java.util.ArrayList;
import java.util.List;

public class StudentDataSource {

    private static StudentDataSource instance = null;

    private List<Student> students = new ArrayList<Student>();

    private StudentDataSource() {
          Student s1 = new Student();
          s1.name= "joo";
          s1.id=123;
          s1.password="cat";
          this.students.add(s1);

        s1.name= "jooj";
        s1.id=1234;
        s1.password="cat4";
        this.students.add(s1);


        s1.name= "olive";
        s1.id=900;
        s1.password="web";
        this.students.add(s1);

        s1.name= "michel";
        s1.id=3333;
        s1.password="poof";
        this.students.add(s1);



        s1.name= "loo";
        s1.id=222;
        s1.password="kal";
        this.students.add(s1);

        s1.name= "ksala";
        s1.id=1111;
        s1.password="lkalk";
        this.students.add(s1);

        s1.name= "zoo";
        s1.id=122223;
        s1.password="caxxxxt";
        this.students.add(s1);

        s1.name= "live";
        s1.id=12934;
        s1.password="sign";
        this.students.add(s1);


        s1.name= "olivebb";
        s1.id=90011;
        s1.password="webqq";
        this.students.add(s1);

        s1.name= "micmmhel";
        s1.id=332233;
        s1.password="pmmoof";
        this.students.add(s1);


        s1.name= "zoo";
        s1.id=22222;
        s1.password="kbbal";
        this.students.add(s1);


        s1.name= "ala";
        s1.id=1101;
        s1.password="lk";
        this.students.add(s1);



    }
    public static StudentDataSource getInstance() {
        if (instance == null) {
            instance = new StudentDataSource();
        }
        return instance;
    }

    public void addStudent(Student s1)
    {

        this.students.add(s1);
    }

    public List<Student> getStudents()
    {

        return this.students;
    }
}

package arrayList;

import javax.swing.*;

public class Student {
    Design d = new Design();
    String name, course;

    Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    void introduceSelf() {
//        System.out.println("Name : " + name);
//        System.out.println("Course : " + course);
//        d.breakLine();
        JOptionPane.showMessageDialog(null, "Name : " + name + "\nCourse : " + course);
    }

    String getName() {
        return name;
    }
    String getCourse() {
        return course;
    }

}

package arrayList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Design d = new Design();
        ArrayList<Student> student = new ArrayList<Student>();

        String name, course;
        boolean hasSize = false;


        int ch;
        try {
            do {
                ch = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to Student Information System\n\n1. Add a Student\n2. Edit Student Credentials\n3. Display All Student\n4. Remove Student\n5. Exit"));

                switch (ch) {

                    case 1:
                        name = JOptionPane.showInputDialog(null, "Input your name");
                        course = JOptionPane.showInputDialog(null, "Input your course");

                        student.add(new Student(name, course));
                        hasSize = true;
                        break;

                    case 2:
                        if (!hasSize) {
                            JOptionPane.showMessageDialog(null, "You need to add student first.", "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        } else {
                            int index = Integer.parseInt(JOptionPane.showInputDialog(null, "Student you want to edit (type index)"));

                            student.get(index).introduceSelf();
                            name = JOptionPane.showInputDialog(null, "Input your name");
                            course = JOptionPane.showInputDialog(null, "Input your course");

                            if ((name != null) && (course != null)) {
                                student.set(index, new Student(name, course));
                            } else {
                                break;
                            }
                        }
                        break;
                    case 3:
                        StringBuilder output = new StringBuilder();
                        for (Student value : student) {
                            output.append("Name : ").append(value.getName()).append("\n").append(value.getCourse()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, output.toString(), "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 4:
                        int indexOne = Integer.parseInt(JOptionPane.showInputDialog(null, "Student you want to edit (type index)"));
                        student.remove(indexOne);

                        StringBuilder outputTwo = new StringBuilder();
                        for (Student value : student) {
                            outputTwo.append("Name : ").append(value.getName()).append("\n").append(value.getCourse()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, outputTwo.toString(), "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Thank you... See you soon....!!!", "Message Dialog", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } while (ch != 5);

        } catch (InputMismatchException e) {
            System.out.println("Wrong input..... Try again...!!!!");

        } catch (Exception e) {
            System.out.println("There's something wrong in you code");

        }
    }

}

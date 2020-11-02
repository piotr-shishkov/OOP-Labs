package com.company;

public class AdvancedLevel {
    public static void main(String[] args) {
        //Creating students with course marks
        Student ps = new Student("Piotr Shishkov", 18, new Course[]{
                new Course("OOP", 10),
                new Course("BD", 7),
                new Course("Math", 8)
        });
        Student mv = new Student("Vladislav Maslihov", 20, new Course[]{
                new Course("OOP", 9),
                new Course("BD", 9),
                new Course("Math", 9)
        });
        Student kt = new Student("Konstantin Tolici", 20, new Course[]{
                new Course("OOP", 8),
                new Course("BD", 9),
                new Course("Math", 8)
        });

        //Creating university
        University utm = new University("Technical University of Moldova", 1964, new Student[]{ps,mv,kt});

        //Output information about university and its students
        System.out.println("University: "+utm.Name+" was founded in "+ utm.FoundationYear);
        System.out.println("Students list");
        for (var st:utm.Students) {
            System.out.println("\nStudent: "+st.Name+"; Age: "+st.Age+";");
            System.out.println("\nMarks");
            for (var mark:st.Marks){
                System.out.println("Course: "+mark.Name+"; Mark: "+mark.Mark+";");
            }
            System.out.println("---------------------------------------------");
        }
    }
}


class University {
    public String Name;
    public int FoundationYear;
    public Student[] Students;

    public University(String name, int foundYear, Student[] students){
        Name = name;
        FoundationYear = foundYear;
        Students = students;
    }
}

class Student{
    public String Name;
    public int Age;
    public Course[] Marks;

    public Student(String name, int age, Course[] marks){
        Name = name;
        Age = age;
        Marks = marks;
    }
}

class Course{
    public String Name;
    public int Mark;

    public Course(String name, int mark){
        Name = name;
        Mark = mark;
    }
}
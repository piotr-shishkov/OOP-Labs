package com.company;

public class AdvancedLevel2 {
    public static void main(String[] args) {
        University[] Universities = new University[3];

        //UTM Students
        Student ps = new Student("Piotr Shishkov", 18, new Course[]{
                new Course("OOP", 10),
                new Course("BD", 7)
        });
        Student mv = new Student("Vladislav Maslihov", 20, new Course[]{
                new Course("OOP", 9),
                new Course("BD", 9)
        });
        Student kt = new Student("Konstantin Tolici", 20, new Course[]{
                new Course("OOP", 8),
                new Course("BD", 9)
        });

        University utm = new University("Technical University of Moldova", 1964, new Student[]{ps,mv,kt});
        Universities[0] = utm;

        //USMF Students
        Student vb = new Student("Valeria Blanar", 20, new Course[]{
                new Course("Anatomy", 8),
                new Course("Biochemistry", 6)
        });
        Student ns = new Student("Nadejda Shishkova", 20, new Course[]{
                new Course("Anatomy", 10),
                new Course("Biochemistry", 10)
        });
        Student ov = new Student("Olga Vasilovsky", 20, new Course[]{
                new Course("Anatomy", 8),
                new Course("Biochemistry", 8)
        });

        University usmf = new University("Universitatea de Stat de Medicină și Farmacie", 1945, new Student[]{vb,ns,ov});
        Universities[1] = usmf;

        //ASEM Students
        Student kp = new Student("Kate Prozorova", 20, new Course[]{
                new Course("Economics", 9),
                new Course("Analysis", 8)
        });
        Student vp = new Student("Vlada Pale", 22, new Course[]{
                new Course("Economics", 9),
                new Course("Analysis", 9)
        });
        Student hz = new Student("He Ze", 19, new Course[]{
                new Course("Economics", 7),
                new Course("Analysis", 6)
        });

        University asem = new University("ASEM", 1991, new Student[]{kp,vp,hz});
        Universities[2] = asem;

        for(var uni:Universities) {
            float studentsAverage = 0;
            int totalMarks = 0;
            System.out.println("University: " + uni.Name + " was founded in " + uni.FoundationYear);
            System.out.println("Students list");
            for (var st : uni.Students) {
                System.out.println("\nStudent: " + st.Name + "; Age: " + st.Age + ";");
                System.out.println("\nMarks");
                for (var mark : st.Marks) {
                    System.out.println("Course: " + mark.Name + "; Mark: " + mark.Mark + ";");
                    studentsAverage += mark.Mark;
                    totalMarks += 1;
                }
                System.out.println("---------------------------------------------");
            }
            System.out.println("\nAverage between " + uni.Name + " students is: "+studentsAverage/totalMarks+"\n");
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

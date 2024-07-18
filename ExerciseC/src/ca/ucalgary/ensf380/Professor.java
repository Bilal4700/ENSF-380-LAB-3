package ca.ucalgary.ensf380;

public class Professor extends Person {
    private String teacherNumber;
    private double salary;

    public Professor(String name, String teacherNumber) {
        super(name);
        this.teacherNumber = teacherNumber;
    }

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
<<<<<<< HEAD
}
=======
}
>>>>>>> bd62817dc95f4fabf0b55b36dfe2ddc9189e2872

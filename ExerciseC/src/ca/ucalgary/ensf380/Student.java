package ca.ucalgary.ensf380;

public class Student extends Person {
    private String studentNumber;
    private Professor supervisor;
    private double averageMark;

    public Student(String name, String studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    public boolean isEligibleToEnroll() {
        // Implement eligibility logic here
        return true;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public void setSupervisor(Professor supervisor) {
        this.supervisor = supervisor;
    }

    public Professor getSupervisor() {
        return supervisor;
    }

    @Override
    public boolean hasValidAddress() {
        Address address = super.address;
        if (address == null) {
            return false;
        }
        return address.validate();
    }
}
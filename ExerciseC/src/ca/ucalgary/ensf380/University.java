package ca.ucalgary.ensf380;

public class University {
    public static void main(String[] args) {
        // Scenario: Professor Sarah supervises two students, Randy and Baber.

        // Creating an address for the professor
        Address profAddress = new Address();
        profAddress.setStreet("23 royal mount");
        profAddress.setCity("Edmonton");
        profAddress.setState("AB");
        profAddress.setPostalCode("G4N 2K6");
        profAddress.setCountry("Canada");

        // Creating a professor
        Professor professorSarah = new Professor("Sarah", "T12345");
        professorSarah.setPhoneNumber("587-664-1222");
        professorSarah.setEmailAddress("Sarahhhh@ucalgary.ca");
        professorSarah.setSalary(80000);
        
        
        // Creating students
        Student studentRandy = new Student("Randy", "30124545");
        studentRandy.setPhoneNumber("587-665-5555");
        studentRandy.setEmailAddress("Randy.orton@ucalgary.ca");
        studentRandy.setAverageMark(74.3);
        studentRandy.setSupervisor(professorSarah);

        Student studentBaber = new Student("Baber", "30126767");
        studentBaber.setPhoneNumber("587-345-6789");
        studentBaber.setEmailAddress("Baber.Azam@ucalgary.ca");
        studentBaber.setAverageMark(88.0);
        studentBaber.setSupervisor(professorSarah);
        
        
        // Creating addresses for students
        Address studentAddressRandy = new Address();
        studentAddressRandy.setStreet("345 24 ave");
        studentAddressRandy.setCity("Vancouver");
        studentAddressRandy.setState("BC");
        studentAddressRandy.setPostalCode("B7J 8R5");
        studentAddressRandy.setCountry("Canada");

        Address studentAddressBaber = new Address();
        studentAddressBaber.setStreet("789 Uofc streat");
        studentAddressBaber.setCity("Calgary");
        studentAddressBaber.setState("AB");
        studentAddressBaber.setPostalCode("T3S 0N6");
        studentAddressBaber.setCountry("Canada");


        // Output details
        System.out.println("Professor: " + professorSarah.getName() + " --> Email: " + professorSarah.getPhoneNumber() );
        System.out.println(" ");
        System.out.println("Supervises Students: ");
        System.out.println("1. " + studentRandy.getName() + ": (" + studentRandy.getStudentNumber() + ")" +" Email: "+ studentRandy.getEmailAddress());
        System.out.println("     Address: " + studentAddressRandy.fullAddress() );
        System.out.println("     Ph: " + studentRandy.getPhoneNumber());
        System.out.println("     Is Eligible:  " + studentRandy.isEligibleToEnroll());
        System.out.println(" ");
        System.out.println("2. " + studentBaber.getName() + ": (" + studentBaber.getStudentNumber() + ")" +" Email: "+ studentBaber.getEmailAddress());
        System.out.println("     Address: " + studentAddressBaber.fullAddress() );
        System.out.println("     Ph: " + studentBaber.getPhoneNumber());
        System.out.println("     Is Eligible:  " + studentBaber.isEligibleToEnroll());
    }
}

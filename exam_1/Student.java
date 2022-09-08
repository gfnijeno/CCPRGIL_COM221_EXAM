public class Student {
    String surname;
    String firstName;
    String middleInitial;
    String dateofBirth;
    int studentNumber;
    String studentEmail;
    boolean amIawesome;
    
    public void sayMyname() {
        System.out.println("Hi! My name is " + firstName +  middleInitial +  surname);
    }

    public void sayMybday() {
        System.out.println("I was born on " + dateofBirth);
    }

    public void sayMystudent() {
        System.out.println("My student number is " + studentNumber + " My student email address is " + studentEmail);
    }

    public void sayMyawesomeness() {
        System.out.println("I'm awesome: " + amIawesome);
    }
    
}

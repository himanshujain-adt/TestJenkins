import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        // Print "Hello, World!"
        System.out.println("Hello, World!");
        
        // Get the current date and time
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        // Print the current date
        System.out.println("Current Date and Time: " + formatter.format(date));
System.out.println("2nd commit.....");

        Student student = new Student(); // This will call the non-parameterized constructor
        student.hello(); // Calling the hello method
 
    }
}

import java.util.*;

class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }}
public class IndiaException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Country name:");
            String inputString = sc.nextLine();
            if (!inputString.equals("India")) {
                throw new NoMatchException("Input string does not match India");
            }
            System.out.println("Input string is India.");
        } catch (NoMatchException e) {
            System.err.println(e.getMessage());
        } }
}

import java.util.Scanner;

public class DateConverterTester {
    
    public static void main(String[] args) 
    {
        String formattedDate;
        // Try with resources statements for Automatic Resource Deallocation
        try (Scanner input = new Scanner(System.in))
        {
            System.out.printf("Please Enter Date:%n");
            formattedDate = DateConverter.convert(input.next());
            System.out.printf("%n%s", formattedDate);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.printf("%nException: %s", e);
            System.out.println("Please enter a month value under 12.");
        } 
        catch (IllegalArgumentException e)
        {
            System.err.printf("%nException: %s%n", e);
            System.out.printf(
               "Incorrect Date Format. Please use DD/MM/YYYY or D/M/YYYY and try again.");
        }
        catch (Exception e)
        {
            System.err.println(e);
            System.out.println("Please re-enter the date.");
        }
    }
}

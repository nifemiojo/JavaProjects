public class DateConverter {

    private static Boolean validateDate(String date) throws IllegalArgumentException
    {
        // Throws exception if date does not match regular expression
        if (!date.matches("\\d{1,2}/\\d{1,2}/\\d{4}"))
            throw new IllegalArgumentException();
        return true;
    }

    public static String convert(String date) throws IllegalArgumentException, ArrayIndexOutOfBoundsException 
    {
        // Declares array to determine the month in String format
        final String[] monthsOfYear = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        // Check date is in the correct format
        DateConverter.validateDate(date);

        // Tokenize String - Separate String on '/' delimiter into elements of tokens array
        String[] tokens = date.split("/");

        // Convert month to int using auto-unboxing
        int month = Integer.parseInt(tokens[1]);

        // Create the new String in the new format
        String formattedDate = String.format("%s %s %s", DateConverter.dayFormat(tokens[0]), monthsOfYear[month - 1], tokens[2]);

        return formattedDate;

    }

    private static String dayFormat(String day)
    {
        char trailingDigit;

        // For the given day find the trailing digit i.e. for 23, 3 is the trailing digit
        if (day.length() == 2)
        {
            trailingDigit = day.charAt(1);
            if (day.charAt(0) == '0')
                day = day.substring(1);
        }
        trailingDigit = day.charAt(0);

        // Switch statement determines suffix for the day
        switch(trailingDigit)
        {
            case '1':
                day += "st";
                break;

            case '2':
                day += "nd";
                break;

            case '3':
                day += "rd";
                break;

            default:
                day += "th";
                break;
        }

        return day;
    }
    
}

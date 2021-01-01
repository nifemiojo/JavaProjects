import java.util.Calendar;

public class HeartRate {
    
    private String firstName;
    private String lastName;
    private Calendar dateOfBirth;

    public HeartRate(String firstName, String lastName, int year, int month, int day)
    {
        // To do
        this.firstName = firstName;
        this.lastName = lastName;

        this.dateOfBirth = Calendar.getInstance();
        this.dateOfBirth.clear();
        this.dateOfBirth.set(year, month, day);
    } 

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setDateOfBirth(int year, int month, int day)
    {
        this.dateOfBirth.clear();
        this.dateOfBirth.set(year, month, day);
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public Calendar getDateOfBirth()
    {
        return this.dateOfBirth;
    }

    protected int calculateAge()
    {
        long conversion = 31536000000L;       
        Calendar currentDate = Calendar.getInstance();
        long ageInYears = ((long) currentDate.getTimeInMillis() - (long) getDateOfBirth().getTimeInMillis()) / conversion;
        return (int) ageInYears;
    }

    protected int maxHeartRate(int age)
    {
        return (220 - age);
    }

    protected int[] targetHeartRate(int maxHeartRate)
    {
        int[] targetRange = new int[2];
        targetRange[0] = Math.round(0.5f * maxHeartRate);
        targetRange[1] = Math.round(0.85f * maxHeartRate);
        return targetRange;
    }

    public String toString()
    {
        return String.format("%s: %s%n%s: %d/%d/%d", "Name", getFirstName() + " " + getLastName(), 
        "Date of Birth", this.dateOfBirth.get(Calendar.DAY_OF_MONTH), this.dateOfBirth.get(Calendar.MONTH),
        this.dateOfBirth.get(Calendar.YEAR));
    }
}

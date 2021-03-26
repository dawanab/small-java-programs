/* Calculates if the provided year is a leap year, and returns true if it is, otherwise it returns false. */


public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        
        getDaysInMonth(2, 2021);
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12)) {
            return -1;
        } else if ((year < 1) || (year > 9999)) {
            return -1;
        }

        switch (month) {
            case 1:
                System.out.println("January " + year + " has 31 days.");
                break;
            case 2:
                if((month == 2) && LeapYearCalculator.isLeapYear(year)){
                    System.out.println("February " + year + " has 29 days.");
                } else
                System.out.println("February " + year + " has 28 days.");
                break;
            case 3:
                System.out.println(" March " + year + " has 31 days. ");
                break;
            case 4:
                System.out.println("April " + year + "has 30 days.");
                break;
            case 5:
                System.out.println("May " + year + " has 31 days.");
                break;
            case 6:
                System.out.println("June " + year + " has 30 days.");
                break;
            case 7:
                System.out.println("July " + year + " has 31 days.");
                break;
            case 8:
                System.out.println("August " + year + " has 31 days.");
                break;
            case 9:
                System.out.println("September " + year+ " has 30 days.");
                break;
            case 10:
                System.out.println("October " + year + " has 31 days.");
                break;
            case 11:
                System.out.println("November " + year + " has 30 days.");
                break;
            case 12:
                System.out.println("December " + year + " has 31 days.");
                break;
            default: 
                System.out.println("Invalid number. Please enter 0 - 12.");
                break;
        }

        return -1;
    }
}

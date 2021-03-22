/* Write a method isLeapYear with a parameter of type int named year. 

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false. 

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

​NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. 
You can use that solution if you wish. */

// Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

// If parameter month is < 1 or > 12 return -1. ​
// If parameter year is < 1 or > 9999 then return -1.

// This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

// You should check if the year is a leap year using the method isLeapYear described above.*/

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

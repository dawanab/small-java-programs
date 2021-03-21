/* Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.

The method should not return any value (hint: void)

Using a switch statement print Sunday, Monday, .... , Saturday if the int parameter "day" is 0, 1, 3, 4, 5 , 6 respectively, 
otherwise it should print "Invalid day".

Bonus: 
	Write a second solution using if then else, instead of using switch.
	Create a new project in IntelliJ with the  name DayOfTheWeekChallenge
 */

public class DayOfTheWeek {

    public static void main(String[] args) {
        
        printDayOfTheWeek(8);
    
    }
    

    public static void printDayOfTheWeek(int day) {
        
    switch(day) {
        case 0:
            System.out.println("Day of the week " + day + " is Sunday");
            break;
        case 1: 
            System.out.println("Day of the week " + day + " is Monday");
            break;
        case 2: 
            System.out.println("Day of the week " + day + " is Tuesday");
            break;
        case 3: 
            System.out.println("Day of the week " + day + " is Wednesday");
            break;
        case 4: 
            System.out.println("Day of the week " + day + " is Thursday");
            break;
        case 5: 
            System.out.println("Day of the week " + day + " is Friday");
            break;
        case 6: 
            System.out.println("Day of the week " + day + " is Saturday");
            break;
        default:
            System.out.println("Invalid Value. Please choose between 0 - 6.");
            break;
    }


    //If-else version of the above switch statement.

    // if (day == 0) {
    //     System.out.println("Sunday");
    // } else if (day == 1) {
    //     System.out.println("Monday");
    // } else if (day == 2) {
    //     System.out.println("Tuesday");
    // } else if (day == 3) {
    //     System.out.println("Wednesday");
    // } else if (day == 4) {
    //     System.out.println("Thursday");
    // } else if (day == 5) {
    //     System.out.println("Friday");
    // } else if (day == 6) {
    //     System.out.println("Saturday");
    // } else {
    //     System.out.println("Invalid value. Choose between 0-6.");
    // }
    }
}


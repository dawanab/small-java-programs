 

public class DayOfTheWeek {

    public static void main(String[] args) {
        
        printDayOfTheWeek(3);
    
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



    //<--------------If-else version of the above switch statement.------------->

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

/* 
<--------------A version with user-input!---------------->

    public static boolean DayOfTheWeek() {

    Scanner scan = new Scanner(System.in);

    System.out.println("Please choose between 0-6.");
    int day = scan.nextInt();

    if ((day < 0) || (day > 6)) {
        System.out.println("Invalid Number. Ender between 0-6.");
}   else if (day == 0) {
        System.out.println("Sunday");
}   else if (day == 1) {
        System.out.println("Monday");
}   else  if (day == 2) {
        System.out.println("Tuesday");
}   else if (day == 3) {
        System.out.println("Wednesday");
}   else if (day == 4) {
        System.out.println("Thursday");
}   else if (day == 5) {
        System.out.println("Friday");
}   else if (day == 6) {
        System.out.println("Saturday");
}   else {
        System.out.println("Invalid numnber. Enter between 0-6.");
        scan.close();
}
return true;
    }
} */

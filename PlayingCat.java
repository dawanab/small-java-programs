/* 
   Returns true if the cat is playing, otherwise it returns false. 
   The cats play if the temperature is between 25 and 35 (inclusive).
   Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
 */

public class PlayingCat {

    public static void main(String[] args) {
        PlayingCat.isCatPlaying(false, 20);
    }

    
    public static boolean isCatPlaying (boolean summer, int temperature){
        if((temperature > 24) && (temperature < 36)){
            System.out.println("The season is summer: " + summer + "\nThe temperature is " + temperature +
            " and the cat is playing.");
            return true;
        } else if((summer) && (temperature > 24) && (temperature < 46)){
            System.out.println("The season is summer: " + summer + "\nThe temperature is " + temperature +
            " and the cat is playing.");
            return true;
        } else
        System.out.println("The season is summer: " + summer + "\nThe temperature is " + temperature +
        " and the cat is not playing.");
        return false;
    }
}


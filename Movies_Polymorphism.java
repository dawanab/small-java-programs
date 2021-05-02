public class Movies_Polymorphism {
    
    private String name;

    public Movies_Polymorphism(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Leprechaun extends Movies_Polymorphism {

    public Leprechaun() {
        super("Leprechaun");
    }

    public String plot() {
        return "A Leprechaun terriorizes people to get his gold back";
    }
}

class PrincessAndTheFrog extends Movies_Polymorphism {

    public PrincessAndTheFrog() {
        super("Princess and the Frog");
    }

    @Override // @Override annotation informs the compiler that the element is meant to override an element declared in a superclass. 
    public String plot() {
        return "A prince/frog falls in love with an up and coming business owner";
    }
}

class HER extends Movies_Polymorphism {

    public HER() {
        super("HER");
    }

    @Override
    public String plot() {
        return "A man falls in love with AI";
    }
}

class Friday extends Movies_Polymorphism {

    public Friday() {
        super("Friday");
    }

    @Override
    public String plot() {
        return "Two friends go celebrate their Friday evening with shennanigans.";
    }
}

class Forgettable extends Movies_Polymorphism {

    public Forgettable() {
        super("Forgettable");
    }

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movies_Polymorphism movie = randomMovie();
            System.out.println("Movie # " + i +
                                " : " + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n");
        } 
    }

    public static Movies_Polymorphism randomMovie() {
        int randomNumber = (int)(Math.random()*5) + 1;
        System.out.println("Random number generated = " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Leprechaun();
            case 2: 
                return new PrincessAndTheFrog();
            case 3: 
                return new HER();
            case 4: 
                return new Friday();
            case 5: 
                return new Forgettable();   
        }
        return null;
    }
}


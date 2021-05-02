public class Ceiling {

    private int height;
    private String paintedColor;

    public Ceiling(int height, String paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public String getPaintedColor() {
        return paintedColor;
    }

/*  Make sure this class is working properly.

    public static void main(String[] args) {
        Ceiling myCeiling = new Ceiling(12, "Scarlet Red");
        System.out.println("Ceiling height = " + myCeiling.getHeight() + " ft.");
        System.out.println("Ceiling color = " + myCeiling.getPaintedColor());
    } */
    
}

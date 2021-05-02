public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private boolean quilt;

    public Bed(String style, int pillows, int height, int sheets, boolean quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("Now making the bed");
    }

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public boolean getQuilt() {
        return quilt;
    }

    public int getSheets() {
        return sheets;
    }

    public String getStyle() {
        return style;
    }

/*   Make sure the clas is working properly

    public static void main(String[] args) {
        Bed myBed = new Bed("California King", 6, 6, 1000, false);
        System.out.println("Bed style = " + myBed.getStyle());
        System.out.println("Bed height = " + myBed.getHeight());
        System.out.println("Bed number of pillows = " + myBed.getPillows());
        System.out.println("Bed sheets thread count = " + myBed.getSheets());
        System.out.println("Order Quilt? = " + myBed.getQuilt());
        
    } */
    
}

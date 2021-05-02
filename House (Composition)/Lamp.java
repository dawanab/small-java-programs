
public class Lamp {

    private String style;
    private boolean battery;
    private int wattage;

    public Lamp(String style, boolean battery, int wattage) {
        this.style = style;
        this.battery = battery;
        this.wattage = wattage;
    }

    public void turnOn() {
        System.out.println("Lamp is now turning on");
    }

    public boolean isBattery() {
        return battery;
    }

    public String getStyle() {
        return style;
    }

    public int getWattage() {
        return wattage;
    }

/*  Check to make sure this class is working properly

    public static void main(String[] args) {
        Lamp myLamp = new Lamp("Electric", true, 100);
        System.out.println("My lamp type = " + myLamp.getStyle());
        System.out.println("Is there a battery = " + myLamp.battery);
        System.out.println("Wattage = " + myLamp.getWattage());
    }
 */
}

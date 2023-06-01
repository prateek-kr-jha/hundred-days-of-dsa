public class ElonsToyCar {
    private int distance = 0;
    private int battery = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        return this.battery <= 0 ? "Battery empty" : "Battery at " +  battery  + "%";
    }

    public void drive() {
        if(battery <= 0 ){
            return;
        }
        this.distance += 20;
        this.battery -= 1;
    }
}

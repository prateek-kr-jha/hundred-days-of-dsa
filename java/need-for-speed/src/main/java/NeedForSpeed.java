class NeedForSpeed {
    // TODO: define the constructor for the 'NeedForSpeed' class
    public int speed;
    public int batteryDrain;
    private int distanceDriven = 0;
    public int battery = 100;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(batteryDrained()){
            return;
        }
        this.distanceDriven += this.speed;
        this.battery -= this.batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    private int distance;
    public RaceTrack(int distance){
        this.distance = distance;
    }
    public boolean tryFinishTrack(NeedForSpeed car) {
        return this.distance <= ((car.battery / car.batteryDrain) * car.speed);
    }
}

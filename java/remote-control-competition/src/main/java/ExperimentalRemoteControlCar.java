public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int totalDistanceTravelled = 0;
    private int unitDistanceTravelled = 20;

    public void drive() {
        totalDistanceTravelled += unitDistanceTravelled;
    }

    public int getDistanceTravelled() {
        return totalDistanceTravelled;
    }
}

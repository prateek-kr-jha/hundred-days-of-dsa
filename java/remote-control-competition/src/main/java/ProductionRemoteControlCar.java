class ProductionRemoteControlCar implements RemoteControlCar, Comparable<RemoteControlCar> {

    private int totalDistanceTravelled = 0;
    private int unitDistanceTravelled = 100;

    public void drive() {
        totalDistanceTravelled += unitDistanceTravelled;
    }

    public int getDistanceTravelled() {
        return totalDistanceTravelled;
    }

    public int getNumberOfVictories() {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
    }

    public void setNumberOfVictories(int numberOfVictories) {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.setNumberOfVictories() method");
    }
    public int compareTo(RemoteControlCar car){
        
        return 1;
    }
}

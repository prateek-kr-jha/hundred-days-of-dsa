public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carProduced = speed * 221;
        if(speed < 5){
            return carProduced ;
        } else if(speed < 9){
            return carProduced * 0.9;
        } else if(speed == 9){
            return carProduced * 0.8;
        } else {
            return carProduced * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return  (int)(productionRatePerHour(speed) / 60);
    }
}

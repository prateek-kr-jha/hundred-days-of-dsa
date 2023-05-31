
class BirdWatcher {
    private final int[] birdsPerDay;
    private int lastIndex;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.lastIndex = birdsPerDay.length;

    }

    public int[] getLastWeek() {
        int[] lastWeek = new int[] {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[lastIndex - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[lastIndex - 1] += 1;
        return;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasDayWithoutBirds = false;
        for(int bird:birdsPerDay){
            if(bird == 0){
                hasDayWithoutBirds = true;
            }
        }
        return hasDayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        numberOfDays = Math.min(lastIndex, numberOfDays);
        for(int i = 0; i < numberOfDays; i++){
            sum += birdsPerDay[i];
        }

        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int birds: birdsPerDay){
            if(birds > 4){
                busyDays +=1;
            }
        }
        return busyDays;
    }
}

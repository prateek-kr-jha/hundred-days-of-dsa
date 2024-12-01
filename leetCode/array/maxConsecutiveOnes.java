public class maxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                if (currentConsecutiveOnes >= maxConsecutiveOnes) {
                    maxConsecutiveOnes = currentConsecutiveOnes;
                }
                currentConsecutiveOnes = 0;
            } else {
                currentConsecutiveOnes++;
            }
        }
        maxConsecutiveOnes = currentConsecutiveOnes > maxConsecutiveOnes
            ? currentConsecutiveOnes
            : maxConsecutiveOnes;
        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 1, 0, 0, 1, 1, 1 };

        int consecutiveOnes = findMaxConsecutiveOnes(array1);

        System.out.println("Consecutive ones: " + consecutiveOnes);
    }
}

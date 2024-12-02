public class findEvenDigits {

    public static int numberOfDigits(int num) {
        int digits = 0;
        if (num == 0) {
            return digits;
        }
        while (num != 0) {
            digits++;
            num = (int) num / 10;
        }
        return digits;
    }

    public static int findNumbers(int[] nums) {
        int evenDigitsNumbers = 0;

        for (int i = 0; i < nums.length; i++) {
            int digits = numberOfDigits(nums[i]);
            if (digits % 2 == 0) {
                evenDigitsNumbers++;
            }
        }
        return evenDigitsNumbers;
    }

    public static void main(String args[]) {
        int[] array1 = { 12, 345, 2, 6, 7896 };

        int evenDigitNumbers = findNumbers(array1);
        System.out.println("Numbers that have even digits " + evenDigitNumbers);
    }
}

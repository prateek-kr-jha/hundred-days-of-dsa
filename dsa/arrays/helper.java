public class helper {

    public static int[] createArrayWithInput(int size, Scanner scn) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        return array;
    }
}

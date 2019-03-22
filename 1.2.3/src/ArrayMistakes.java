public class ArrayMistakes {
    public static void main(String[] args) {
        int[] nums = {6, 9, 14, 19};

        System.out.print("\nForwards");
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.print(": " + nums[i]);
        }

        System.out.print("\nBackward");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(": " + nums[i]);
        }
    }
}

public class Main {

    //Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
    public static int differenceMaxMin(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    // Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
    public static boolean twoZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("\nЗадача 1:");
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4})); // → 3
        System.out.println(countEvens(new int[]{2, 2, 0})); // → 3
        System.out.println(countEvens(new int[]{1, 3, 5})); // → 0

        System.out.println("\nЗадача 2:");
        System.out.println(differenceMaxMin(new int[]{2, 1, 2, 3, 4})); // → 3
        System.out.println(differenceMaxMin(new int[]{2, 2, 0})); // → 2
        System.out.println(differenceMaxMin(new int[]{1, 3, 5})); // → 4

        System.out.println("\nЗадача 3:");
        System.out.println(twoZeros(new int[]{2, 1, 2, 3, 4})); // → false
        System.out.println(twoZeros(new int[]{2, 2, 0})); // → false
        System.out.println(twoZeros(new int[]{1, 0, 0, 5})); // → true
    }
}

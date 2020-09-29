public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int order = arr[(arr.length - i - 1)];
            array[i] = order;
        }
        return array;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int max = arr[0];
        int max2 = arr[0];
        for (int item: arr) {
            if (item > max) {
                max2 = max;
                max = item;
            }
        }
        return max2;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double st1 = arr[0];
        double st2 = arr[1];
        double stratio = st1 / st2;
        for (int i = 1; i < arr.length; i++) {
            double num1 = arr[i];
            double num2 = arr[(i-1)];
            double ratio = num2 / num1;
            if (!(Math.abs(ratio - stratio) <= 0.001)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 4, 8, 16};

        for (int item: reverse(arr1)) {
            System.out.print(item + " ");
        }
        System.out.println(" ");
        System.out.println(secondLargest(arr1));
        System.out.println(isGeometric(arr1));

        for (int item: reverse(arr2)) {
            System.out.print(item + " ");
        }
        System.out.println(" ");
        System.out.println(secondLargest(arr2));
        System.out.println(isGeometric(arr2));
    }
}

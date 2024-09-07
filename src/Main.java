public class Main {

    // Task 1: Method to return the difference between the largest and smallest values in an array
    public static int maxDifference(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array length must be at least 1");
        }
        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    // Task 2: Method to find and print the smallest and second smallest elements
    public static void findTwoSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }

    // Task 3: Method to calculate the expression x^2 + (4y/5 - x)^2
    public static double calculateExpression(double x, double y) {
        double part1 = Math.pow(x, 2); // x^2
        double part2 = Math.pow((4 * y / 5 - x), 2); // (4y/5 - x)^2
        return part1 + part2;
    }

    public static void main(String[] args) {
        // Example usage for Task 1:
        int[] array1 = {4, 9, 1, 32, 12};
        System.out.println("Difference between max and min: " + maxDifference(array1));

        // Example usage for Task 2:
        int[] array2 = {7, 5, 9, 1, 6, 2};
        findTwoSmallest(array2);

        // Example usage for Task 3:
        double x = 3.0;
        double y = 2.0;
        System.out.println("Result of the expression: " + calculateExpression(x, y));
    }
}

public class DebuggingPractice {

    public static int findMax(int[] numbers) {
        int maxValue = numbers[0];

        for (int n : numbers) {
            if (n > maxValue) {
                maxValue = n;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] numbers = {-5, -2, -9};

        System.out.println(findMax(numbers));
    }
}
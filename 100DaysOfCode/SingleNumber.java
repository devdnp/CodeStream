import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length;
        int result = numbers[len - 1];
        int i = 0;
        while (i < len - 2) {
            if (numbers[i] == numbers[i+1]) {
                i = i + 2;
            } else {
                return numbers[i];
            }
        }
        return numbers[len - 1];
    }
}

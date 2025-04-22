import java.util.Arrays;
public class inbuilt {
    public static void main(String[] args) {
        int numbers [] = {1, 3, 8, 9, 3, 5,2};
        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
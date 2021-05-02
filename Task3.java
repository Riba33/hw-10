import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        System.out.println(sortIntString(arr));
    }
    public static String sortIntString(String[] arr){
        return Arrays.stream(arr).flatMap(e -> Arrays.stream(e.split(",")))
                .map(e -> e.trim())
                .sorted()
                .collect(Collectors.joining(","));
    }
}

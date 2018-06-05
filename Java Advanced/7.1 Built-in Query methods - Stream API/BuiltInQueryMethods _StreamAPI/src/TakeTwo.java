import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TakeTwo {
    public static void main(String[] args) throws IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
        Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .distinct()
                .filter(x -> (x >= 10 && x <= 20))
                .limit(2)
                .forEach(x -> sb.append(x).append(" "));
        System.out.println(sb.toString());
    }
}

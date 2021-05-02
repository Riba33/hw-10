import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
            Long a = 25214903917L;
            Long c = 11l;
            Long m = (long) Math.pow(2, 48);
            new MyRandom().getStream(a,c,m, 0L).limit(10).forEach(System.out::println);
        }
}

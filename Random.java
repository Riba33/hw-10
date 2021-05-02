import java.util.stream.Stream;

public interface Random {
    Stream<Long> getStream(Long a, Long c, Long m, Long seed);
}

import java.util.stream.Stream;

class MyRandom implements Random {
    @Override
    public Stream<Long> getStream(Long a, Long c, Long m, Long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}

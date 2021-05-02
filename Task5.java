import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> list1 = first.collect(Collectors.toList());
        List<T> list2 = second.collect(Collectors.toList());
        ListIterator<T> list1Iterator= list1.listIterator();
        ListIterator<T> list2Iterator= list2.listIterator();
        List<T> rezult = new ArrayList<>();
        while (list1Iterator.hasNext() & list2Iterator.hasNext()){
            rezult.add(list1Iterator.next());
            rezult.add(list2Iterator.next());
        }
    return rezult.stream();
    }

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1,2,3,4,5);
        Stream<Integer> second = Stream.of(6,7,8,9,0,10);
        zip(first,second).forEach(System.out::print);
    }
}

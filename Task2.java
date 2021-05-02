import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static String getString(String way) {
        String str = "";
        try (FileReader reader = new FileReader(way)) {
            int c;

            while ((c = reader.read()) != -1) {
                str += (char) c;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return str;
    }
    public static List<String> getList(String src) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(src);
        while (sc.hasNext()) {
            list.add(sc.next().trim());
        }
        return list;
    }
    public static List<String> sotrList(List<String> list){
        return list.stream().map(a -> a.toUpperCase())
                .sorted((a,b) -> b.compareTo(a))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String src = "C:\\Users\\riba3\\Documents\\hw10\\src\\Names.txt";
        List<String> list = getList(getString(src));
        System.out.println(list);
        System.out.println(sotrList(list));

    }
}


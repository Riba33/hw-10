import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
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
    public static List<String> getList(String src){
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(src);
        while (sc.hasNext()){
            list.add(sc.next().trim());
        }
        return list;
    }
    public static String getStrinList(List list){
        return (String) list.stream()
                .filter(name -> list.indexOf(name) % 2 == 1)
                .map(name -> list.indexOf(name) + ". " + name)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String src = "C:\\Users\\riba3\\Documents\\hw10\\src\\Names.txt";
        List<String> list = getList(getString(src));
        System.out.println(list);
        System.out.println(getStrinList(list));
    }
}

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList {
    
    public static void main(String[] args){
        
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "cek1");
        map.put(9, "cek2");
        map.put(8, "cek3");
        
        System.out.println("\n1. Export Map to List : ");
        
        List<Integer> result = map.keySet().stream()
                .collect(Collectors.toList());
        result.forEach(System.out::println);
        
        System.out.println("\n2. Export map value to list: ");
        
        List<String> result2 = map.values().stream()
                .collect(Collectors.toList());
        result2.forEach(System.out::println);
        
        System.out.println("\n3. Export map value to list..., say no to cek4 ");
        
        List<String> result3 = map.keySet().stream().filter(x -> !"cek2".equalsIgnoreCase(x))
                .collect(Collectors.toList());
        
        result3.forEach(System.out::println);
    }
        
}

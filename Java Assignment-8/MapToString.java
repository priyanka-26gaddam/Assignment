
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToString {
    public static void main(String[] cmd_lineParams) {
        Map<String, String> map = new HashMap<>(5);
        map.put("name1", "value1");
        map.put("name2", "value2");
        map.put("name3", "value3");
        map.put("name4", "value4");
        map.put("name5", "value5");
        String s = map.entrySet().stream().map((entry) ->
                        "" + entry.getKey() + " \"" + entry.getValue().replaceAll("\"", "\\\\\"") + "\"")
                .collect(Collectors.joining(" "));
        System.out.println(s);

    }
}
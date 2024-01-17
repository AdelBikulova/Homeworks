package homeWork.HW39;

import java.util.HashMap;
import java.util.Map;

 /* Дана Map<String, String> map, написать метод, который вернет Мап, такую, что если в исходной map
     есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b. Если нет, ничего не менять.
    Примеры:
    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    mapAB({"a": "Hi"}) → {"a": "Hi"}
    mapAB({"b": "There"}) → {"b": "There"}
    */


public class NewKey {

    public static void NewKeyCreate(Map<String, String> map){

        if (map.containsKey("a") && map.containsKey("b")) {
            String valueA = map.get("a");
            String valueB = map.get("b");
            map.put("ab", valueA + valueB);
        }
    }

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();

        map1.put("a", "Hi");
        map1.put("b", "There");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");

        NewKeyCreate(map1);
        NewKeyCreate(map2);
        NewKeyCreate(map3);

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
    }
}
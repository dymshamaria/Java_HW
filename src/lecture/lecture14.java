package lecture;

import hw.hw7.Person;

import java.util.*;

public class lecture14 {


    public static void main(String[] args) {

//        List<Person> list = new ArrayList<Person>();
//        list.add(new Person("Maria",25));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
//        list.contains(1);

        list.remove(1);
        System.out.println(list);


        Set<String> set = new HashSet<>();
        set.add("Maria");
        set.add("Sasha");
        System.out.println(set);
//        set.contains("Maria");


        Map<String, Integer> map = new HashMap<>();
        map.put("Maria", 25);
        map.put("Sasha", 28);
        System.out.println(map);
    }
}

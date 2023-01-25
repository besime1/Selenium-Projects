


import java.util.*;
public class Practice3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Geeks");

        set.add("For");

        set.add("Geeks");

        set.add("Example");

        set.add("Set");

        System.out.print("Set Output : ");

        System.out.println(set);

        List<String> list = new ArrayList<>();

        list.add("Geeks");

        list.add("For");

        list.add("Geeks");

        list.add("Example");

        list.add("List");

        System.out.print("List Output : ");

        System.out.println(list);

        Deque<String> deque = new ArrayDeque<>();

        deque.add("Geeks");

        deque.add("For");

        deque.add("Geeks");

        deque.add("Example");

        deque.add("Deque");

        System.out.print("Deque Output : ");

        System.out.println(deque);

    }
    }


package chapter3;
import java.util.*;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add('c');
        list1.add(true);
        list1.add("asdfa");
        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(11);
        list2.add(54);
        list2.add(4);
        System.out.println(list2.add(2));
        list2.add(0,10);
        System.out.println(list2);

    }
}

package C008;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _02IteratorDemo {
    public static void main(String[] args) {
        List randomlist = new ArrayList<>();
        randomlist.add("Apple");
        randomlist.add("Orange");
        randomlist.add(20);
        randomlist.add(97.78);
        randomlist.add(true);
        randomlist.add(10==5);
        randomlist.add('c');
        System.out.println("randomList="+randomlist);

        System.out.println("---For loop----");
        for(int i =0;i< randomlist.size();i++){
            System.out.println(randomlist.get(i)+"-");
        }
        System.out.println("---Enhanced loop--");
        for(Object item:randomlist){
            System.out.println(item+"-");
        }
        System.out.println("--Iterator--");
        Iterator iterator = randomlist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+"'-");
        }
    }
}

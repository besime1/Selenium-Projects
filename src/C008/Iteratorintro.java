package C008;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorintro {
    public static void main(String[] args) {
        List<Double> doubleList=new ArrayList<>();
        doubleList.add(10.99);
        doubleList.add(5.56);
        doubleList.add(1.99);
        doubleList.add(107.87);
        doubleList.add(1103.00);
        doubleList.add(99.99);
      //  doubleList.add("Str");//Does not Accept other data types except Double.

        System.out.println("doubleList="+doubleList);
        System.out.println("DoubleList.get(2)="+doubleList);

        System.out.println("---For Loop");
        for (int i=0;i<doubleList.size(); i++){
          //  System.out.println(doubleList.get(i));
            System.out.println(doubleList.get(i).doubleValue());
        }
        System.out.println("---Enhanced loop---");
        for(double dList:doubleList){
            System.out.println(dList);

        }
        System.out.println("---Iterator Loop---");
        Iterator<Double> doubleIterator=doubleList.iterator();
        while(doubleIterator.hasNext()){
            Double next = doubleIterator.next();
            System.out.println(next);
        }
    }
}

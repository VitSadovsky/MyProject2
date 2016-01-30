package myPackage;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by tony on 26.01.2016.
 */
public class MyStack extends Stack {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(8);

        System.out.println(arrayList);

        ArrayList arrayListNew = new ArrayList();

        int n=0;
        Stack stack = new Stack();
        while (n<arrayList.size())
        {stack.push(arrayList.get(n));
        n++;
        }

        System.out.println(stack);

while (!stack.isEmpty()){
    arrayListNew.add(stack.pop());
}
        System.out.println(arrayListNew);

    }


}

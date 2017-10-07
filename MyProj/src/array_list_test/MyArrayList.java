package array_list_test;

import java.lang.reflect.Array;

/**
 * Created by cb-vaibhav on 05/08/17.
 */
public class MyArrayList {

    int length;
    int size = 10;
    boolean flag = false;
    String a1[] = new String[size];

    public void add(String s) {
        length = a1.length;
        System.out.println("length of array = " + length);

        int i=0;
            a1[i] = s;
            i++;

            if (i== a1.length) {
                size = (int) (size + length * 0.75);
            }
            System.out.println(a1[i]);
    }

    public int size() {
        System.out.print("New Size of Array = ");
        return length;
    }

    public String get(int index) {
        return "";
    }

}

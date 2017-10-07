package set_test;

import java.util.Arrays;

/**
 * Created by cb-vaibhav on 05/08/17.
 */
public class MySet {

    private float loadFactor;

    private int length;
    private String arr[];

    private int nextIdx = 0;


    public MySet() {
        length = 10;
        loadFactor = 0.75f;
        arr = new String[length];
    }


    public void add(String s) {
        for (String s1 : arr) {
            if (s1.equalsIgnoreCase(s)) {
                return;
            }
        }

        arr[nextIdx] = s;
        nextIdx++;
        if (nextIdx == length) {
            copyNCreateNewArray(newLength());
        }
    }

    public int size() {
        return nextIdx;
    }

    public String get(int idx) {
        return arr[idx];
    }

    private int newLength() {
        return (int) (length + length * loadFactor);
    }

    private void copyNCreateNewArray(int newLength) {
        arr = Arrays.copyOf(arr, newLength);
    }


    private void copyNCreateNewArray1(int newLength) {
        String[] newArr = new String[newLength];
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        length = newLength;
    }
}



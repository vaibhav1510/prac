package array_list_test;

import java.util.Arrays;

/**
 * Created by cb-vaibhav on 05/08/17.
 */
public class CustomArrayList<T extends Object> {

//    private float loadFactor;
//
//    private int length;
//    private T arr[];
//
//    private int nextIdx = 0;
//
//
//    public CustomArrayList() {
//        length = 10;
//        loadFactor = 0.75f;
//        arr = new T[length];
//    }
//
//    public CustomArrayList(int initialCap) {
//        length = initialCap;
//        loadFactor = 0.75f;
//        arr = new T[length];
//    }
//
//    public CustomArrayList(int initialCap, float laodFac) {
//        length = initialCap;
//        loadFactor = laodFac;
//        arr = new T[length];
//    }
//
//    public void add(T s) {
//        arr[nextIdx] = s;
//        nextIdx++;
//        if (nextIdx == length) {
//            copyNCreateNewArray(newLength());
//        }
//    }
//
//    public int size() {
//        return nextIdx;
//    }
//
//    public T get(int idx) {
//        return arr[idx];
//    }
//
//    private int newLength() {
//        return (int) (length + length * loadFactor);
//    }
//
//    private void copyNCreateNewArray(int newLength) {
//        arr = Arrays.copyOf(arr, newLength);
//    }
//
//    private void copyNCreateNewArray1(int newLength) {
//        T[] newArr = new T[newLength];
//        for (int i = 0; i < length; i++) {
//            newArr[i] = arr[i];
//        }
//        arr = newArr;
//        length = newLength;
//    }
}

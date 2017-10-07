package set_test;


/**
 * Created by cb-vaibhav on 05/08/17.
 */
public class TestMain1 {

    public static void main(String[] args) {
        MySet mySet = new MySet();
        System.out.println(mySet.size()); // 0

        mySet.add("001");
        mySet.add("002");
        mySet.add("003");
        mySet.add("004");
        mySet.add("005");
        mySet.add("006");
        mySet.add("007");

        System.out.println(mySet.get(2)); // 003

        mySet.add("008");
        mySet.add("009");
        mySet.add("010");
        mySet.add("011");
        mySet.add("012");

        System.out.println(mySet.size()); // 12
        mySet.add("234");
        mySet.add("234");
        mySet.add("234");

        System.out.println(mySet.size()); // 13
        System.out.println(mySet.get(10)); // 011

        mySet.add("456");
        mySet.add("678");
        mySet.add("456");
        System.out.println(mySet.size()); // 15


    }
}

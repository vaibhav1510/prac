/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */

package Practice.lists;

import java.util.HashSet;
import java.util.Iterator;
    
/**
 *
 * @author vaibhav
 */
public class HashSetTest {

    // This function prints all distinct elements
    static HashSet<Integer> printDistinct(int arr[]) {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet();

        // Traverse the input array
        for (int i = 0; i < arr.length; i++) {
            // If not present, then put it in 
            // hashSet and print it
//            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                System.out.print(arr[i] + " ");
//            }
        }
        return set;
    }

    // Driver method to test above method
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6, 7, 1};
        HashSet<Integer> set =printDistinct(arr);    
        System.out.println("\nValues in Set");
        for(Iterator itr =set.iterator();itr.hasNext();){
            System.out.println(itr.next());
        }
        
    }
    
}

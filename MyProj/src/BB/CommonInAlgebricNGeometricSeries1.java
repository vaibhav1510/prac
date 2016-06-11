/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BB;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaibhav
 */
public class CommonInAlgebricNGeometricSeries1 {

    public static void main(String[] args) throws Exception {
        System.out.println(countSeriesTerms(1, 1, 1, 2, 4));
    }

    static int countSeriesTerms(int A, int D, int B, int R, int Lim) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        list1.add(A);
        list2.add(A);
        int val1 = A, val2 = B;
        while (val1 <= Lim && val2 <= Lim) {
            val1 += D;
            val2 *= R;
            if (val1 <= Lim) {
                list1.add(val1);
            }
            if (val2 <= Lim) {
                list2.add(val2);
            }
        }
        int count = 0;
        int l = list1.size() > list2.size() ? list2.size() : list1.size();
        List<Integer> list3 = list1.size() > list2.size() ? list2 : list1;
        List<Integer> list4 = list1.size() > list2.size() ? list1 : list2;
        for (int i : list3) {
            if(list4.contains(i)){
                count++;
            }
        }
        return count;
    }

}

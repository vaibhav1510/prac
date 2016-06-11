/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

import java.util.Stack;

/**
 *
 * @author vaibhav
 */
public class TestMain {

    static int calcWaterStored(int[] buildingBlocks) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> vols = new Stack<Integer>();
        int len = buildingBlocks.length;
        int lastMax = 0;
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < len; i++) {
            int curr = buildingBlocks[i];
            if (i == 0) {
                stack.push(curr);
                startIndex = i + 1;
                continue;
            }
            int poped = stack.peek();
            if (poped < curr) {
                stack.push(curr);
                startIndex = i + 1;
            }
            stack.push(curr);

            Integer val = findComp(stack, curr);
            if (val == null) {
                continue;
            }
            if (lastMax == val) {
                vols.pop();
                vols.push(calNew(stack, curr, lastMax));
            }
        }
        int tot = 0;
        for (Integer i : vols) {
            tot += i;
        }
        return tot;
    }

    public static int calNew(Stack<Integer> st, int curr, Integer range) {
        int vol = 0;
        for (Integer i : st) {
            if (i == range) {
                return vol;
            }
            vol += curr - i;
        }
        throw new RuntimeException("Not possible");
    }

    public static Integer findComp(Stack<Integer> st, int curr) {
        for (Integer i : st) {
            if (i > curr) {
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 7, 3, 4, 6, 9};
//        System.out.println(calcWaterStored(arr));
        
        System.out.println(Math.abs(-0));
    }
}

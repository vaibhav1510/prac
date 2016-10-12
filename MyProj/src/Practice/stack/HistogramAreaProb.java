/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.stack;

import java.util.Stack;

/**
 *
 * @author vaibhav
 */
public class HistogramAreaProb {

    public static void main(String[] args) {
        int[] histogram = {6, 2, 5, 4, 5, 1, 6};
//        int[] histogram = {5, 4, 4, 6, 6, 4, 2, 3};
        System.out.println("Largest Area: " + findMaxArea(histogram));
    }

    private static int findMaxArea(int[] hist) {
        MyStack stack = new MyStack(hist);

        int maxArea = 0;
        int topIdx;
        int areaWithTop;

        int i = 0;
        while (i < hist.length) {
            System.out.println("===================ITERATION LOOP-1===================");
            int val = hist[i];

            if (stack.isEmpty() || hist[stack.peek()] <= val) {
                stack.push(i++);
            } else {
                topIdx = stack.peek();
                stack.pop();
                areaWithTop = hist[topIdx] * (stack.empty() ? i : i - stack.peek() - 1);
                maxArea = setMax(areaWithTop, maxArea);
            }
        }

        while (!stack.isEmpty()) {
            System.out.println("===================ITERATION LOOP-2===================");
            topIdx = stack.peek();
            stack.pop();
            areaWithTop = hist[topIdx] * (stack.empty() ? i : i - stack.peek() - 1);
            maxArea = setMax(areaWithTop, maxArea);
        }
        return maxArea;
    }

    static int setMax(int ar, int max) {
        int val = max < ar ? ar : max;
        System.out.println("MAX: " + max + "<" + ar + "=" + val);
        return val;
    }
}

class MyStack extends Stack<Integer> {

    int[] arr;

    public MyStack(int[] arr) {
        this.arr = arr;
    }

    @Override
    public Integer push(Integer item) {
        int val = super.push(item);
        printStack();
        return val;
    }

    @Override
    public synchronized Integer pop() {
        Integer val = super.pop();
        printStack();
        return val;
    }

    @Override
    public synchronized Integer peek() {
        Integer val = super.peek();
        System.out.println("Peek: " + val);
        return val;
    }

    private void printStack() {
        System.out.print("\nMyStack : [ ");
        for (Integer i : this) {
            System.out.print(i + "=" + arr[i] + ", ");
        }
        System.out.println("]");
    }

}

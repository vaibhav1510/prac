package HR;

import java.io.*;
import java.util.*;

public class ProjectEuler {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int maxVal = scanner.nextInt();
        long val = (new Double(Math.pow(10, maxVal))).longValue();
        System.out.println(count(val));
    }

    public static int count(long maxVal) {
        int count = 0;
        HashMap<Long, Boolean> resPool = new HashMap();
        for (long i = 1; i <= maxVal; i++) {
            if (resPool.containsKey(i)) {
                if (resPool.get(i)) {
                    count++;
                    continue;
                }
            }
            long num = i;
            HashSet<Long> l = new HashSet();
            l.add(num);
            while (num != 1 && num != 89) {
                num = nextNum(num);
                l.add(num);
            }
            for (long v : l) {
                resPool.put(v, num == 89);
            }
            if (num == 89) {
                count++;
            }
        }
        return count;
    }

    public static long nextNum(long num) {
        long sum = 0;
        while (num > 0) {
            long dig = num % 10;
            sum = sum + dig * dig;
            num /= 10;
        }
        return sum;
    }
}

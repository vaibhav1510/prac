package Testing;

import java.io.*;
import java.util.*;


public class Equations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            String[] ss = br.readLine().trim().split(" ");
            long x = Long.parseLong(ss[0]);
            long y = Long.parseLong(ss[1]);
            long[] out_ = equationSol(y, x);
            wr.print(out_[0]);
            for (int i_out_ = 1; i_out_ < out_.length; i_out_++) {
                wr.print(" " + out_[i_out_]);
            }
            wr.println();
        }

        wr.close();
        br.close();
    }

    static long[] equationSol(long y, long x) {
        long a = y/2;
        long b = x-a;
        long temp = a ^ b;
        if(temp==y){
            return new long[]{a,b};
        }
        return new long[]{-1};
    }
}

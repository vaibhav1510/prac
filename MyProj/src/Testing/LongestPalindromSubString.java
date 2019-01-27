package Testing;

import java.io.*;
import java.util.*;


public class LongestPalindromSubString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String S = br.readLine();
        ArrayList<Integer> ans = solve(N, S);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
            if (i == (int) ans.size() - 1) System.out.println();
            else System.out.print(" ");
        }
        wr.close();
        br.close();
    }

    static ArrayList<Integer> solve(int N, String S) {
        ArrayList<Integer> toRet = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            String pref = S.substring(0, i);
            toRet.add(findMax(pref));
        }
        return toRet;
    }

    static int findMax(String pref) {
        int maxSize = 1;
        if (isPalindrom(pref)) {
            return pref.length();
        }
        for (int i = pref.length(); i > 1; i--) {
            int start = 0;
            while (pref.length() - start >= i) {
                String temp = pref.substring(start, start + i);
                if (isPalindrom(temp)) {
                    return temp.length();
                }
                start++;
            }
        }
        return maxSize;
    }

    static boolean isPalindrom(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
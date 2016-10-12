/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practo;

/**
 *
 * @author vaibhav
 */
public class LongestChain {

    public static void main(String[] args) {
        String[] w = {"a", "b", "ba", "bca", "bda", "bdca"};
        System.out.println(longest_chain(w));
    }

    static int longest_chain(String[] w) {
        Integer chain = 0;
        for (String s : w) {
            if (s.length() <= chain) {
                continue;
            }
            chain = 0;
            chain = findChain(w, s, chain, 0);
        }
        return chain;
    }

    static int findChain(String[] w, String s, int chain, int index) {
        Integer newInd = index;
        if (isPresent(w, s)) {
            chain++;
            newInd = 0;
        }
        if (s.length() == 1) {
            return chain;
        }
        if (newInd == 0) {
            s = s.substring(1);
        } else if (newInd == s.length() - 1) {
            s.substring(0, s.length() - 1);
        } else {
            String s1 = s;
            s = s.substring(0, newInd) + s1.substring(newInd + 1);
        }
        return findChain(w, s, chain, newInd);
    }

    static boolean isPresent(String[] w, String word) {
        for (String s : w) {
            if (s.equals(word)) {
                return true;
            }
        }
        return false;
    }

}

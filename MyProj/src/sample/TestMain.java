/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author vaibhav
 */
import java.lang.*;
import java.util.*;

public class TestMain {

    private static List<String> words = new ArrayList<String>();
    private static List<String> sentInDics = new ArrayList<String>();
    private static String input=null;

    public static void main(String args[]) {
        input = "howareyou";
        List<String> dics = new ArrayList<String>();
        dics.add("how");
        dics.add("are");
        dics.add("howare");
        dics.add("you");
        dics.add("areyou");
        dics.add("foo");
        findWords(input, dics);
        createSen();
        if (sentInDics.isEmpty()) {
            System.out.println("No valid sentence found.");
        }
    }

    public static void createSen() {
        int l = words.size();
        for (int i = 0; i < l; i++) {
            for(int k = 0; k < words.size(); k++) {
                String[] s1 = Arrays.copyOfRange(words.toArray(), 0, k+1, String[].class);
                for(String s: s1){
                    System.out.print(s + ",");
                }
                System.out.println("");
                if(concat(s1).equals(input)){
                    sentInDics.add(concat(s1));
                }
            }
            String[] s = Arrays.copyOfRange(words.toArray(), 1, words.size(), String[].class);
            words=new ArrayList<String>();
            Collections.addAll(words, s);
        }
    }

    public static Boolean findWords(String inputStr, List<String> dics) {
        if (inputStr == null || inputStr.isEmpty()) {
            return false;
        }
        int l = inputStr.length();
        for (int i = 0; i < l; i++) {
            for (int k = 0; k < inputStr.length(); k++) {
                String w = inputStr.substring(0, k + 1);
                if (dics.contains(w)) {
                    words.add(w);
                }
            }
            inputStr = inputStr.substring(1, inputStr.length());
        }
        System.out.println(words.toString());
        return inputStr.isEmpty();
    }

    public static String concat(String[] ss) {
        String s = "";
        for (String w : ss) {
            s += w;
        }
        return s;
    }

    public static String createSent(List<String> words) {
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author vaibhav
 */
public class FriendsCircle {

    public static void main(String[] args) {
//        String[] friends = {"YYNN", "YYYN", "NYYN", "NNNY"};
        String[] friends = {"YNNNN", "NYNNN", "NNYNN", "NNNYN", "NNNNNY"};
        System.out.println(friendCircles(friends));
    }

    static int friendCircles(String[] friends) {
        int count = 0;

        Set<Integer> position = new HashSet<Integer>();

        for (int i = 0; i < friends.length; i++) {
            String s = friends[i];
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'N') {
                    continue;
                }
                System.out.println(i + " " + j);
                if (position.contains(i) || position.contains(j)) {
                    position.add(i);
                    position.add(j);
                    continue;
                }
                position.add(i);
                position.add(j);
                count++;
            }
        }
        return count;
    }
}

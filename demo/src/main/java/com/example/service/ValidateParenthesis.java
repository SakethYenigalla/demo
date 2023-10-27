package com.example.service;


import java.util.HashMap;
import java.util.Stack;


public class ValidateParenthesis {
    public static boolean isvalid(String s){
        HashMap<Character,Character> hm= new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        Stack<Character> stack= new Stack<>();

        for(char c:s.toCharArray()){
            if(hm.containsKey(c)) {
                char top = stack.isEmpty() ? '#' : stack.pop();
                
                if (top != hm.get(c)) {
                    return false;
                }
            }else {
                stack.push(c);
               
            }
        }
        return  stack.isEmpty();
    }
}

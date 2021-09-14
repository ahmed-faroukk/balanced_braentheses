/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.balanced_braentheses;
import java.util.*;

/**
 *
 * @author farouk
 */
public class stack {
    // Java program for checking

// balanced brackets


 

public class BalancedBrackets {

 static boolean arebalancedBrackets(String expr)
 {
 Deque<Character> stack = new  ArrayDeque<Character>();
  

 for(int i=0 ; i <expr.length(); i++)
 {
       char x = expr.charAt(i);

 if(x=='('||x=='['||x=='{')
 {
 stack.push(x);
  continue;

 } 
 
 if(stack.isEmpty()) return false;
 
 char check;
 switch(x){
     
         case')': check = stack.pop();
         if(x==']' || x=='}') return false;
         break;
         
         case '}': check = stack.pop();
         if(x=='[' || x=='(') return false;
          break;
           
         case ']': check = stack.pop();
         if(x=='{'|| x=='(') return false;
         break;
 }
 
 

 }
return stack.isEmpty();
 
 


   
 }
}
    
    
}

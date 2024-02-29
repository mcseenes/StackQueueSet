package com.enes.stack;

import java.util.Stack;

public class StackOrnek {
    public static void main(String[] args) {
        int toplam=0;
        Stack<Integer>stack=new Stack<>();
        Stack<Integer>yuzdenBuyukler=new Stack<>();
        stack.add(200);
        stack.push(200);
        stack.push(50);
        stack.push(25);
        stack.push(125);
        stack.push(20);

//        for (Integer para:stack){
//
//            if (para>100){
//                yuzdenBuyukler.push(para);
//            }
//           else {
//               toplam += para;
//                System.out.println(toplam);
//            }
//            }
        while (!stack.isEmpty()){
            if (stack.peek()>100)
            {
                yuzdenBuyukler.push(stack.pop());
            }
            else {
                toplam+=stack.pop();

            }
        }
        System.out.println(toplam);
        System.out.println(yuzdenBuyukler);
        }
    }


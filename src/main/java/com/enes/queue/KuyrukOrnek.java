package com.enes.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class KuyrukOrnek {
    public static void main(String[] args) {
        Queue<Integer>kuyruk1=new LinkedList<>();
        kuyruk1.add(20);
        kuyruk1.add(30);
        kuyruk1.add(40);
        kuyruk1.add(50);
//        while (!kuyruk1.isEmpty()){
////            System.out.println(kuyruk1.peek());
////            System.out.println(kuyruk1.poll());
//        }
        Queue<Integer>kuyruk2=new ArrayBlockingQueue<>(5);
        kuyruk2.offer(60);
        kuyruk2.offer(70);
        kuyruk2.offer(80);
        kuyruk2.offer(90);
        kuyruk2.offer(100);
        kuyruk2.offer(110);
        System.out.println("/////////////");
        while (!kuyruk2.isEmpty()){
            System.out.println(kuyruk2.poll());
        }

        Queue<String>kuyruk3=new PriorityQueue<>();
        kuyruk3.offer("ABDULLAH");
        kuyruk3.offer("EMRAH");
        kuyruk3.offer("ESRA");
        kuyruk3.offer("ESIN");
        kuyruk3.offer("EMRE");
        System.out.println("/////////////");
        while (!kuyruk3.isEmpty()){
            System.out.println(kuyruk3.poll());
        }
        Queue<Integer>kuyruk4=new PriorityQueue<>();
        kuyruk4.offer(70);
        kuyruk4.offer(50);
        kuyruk4.offer(4);
        kuyruk4.offer(34);
        kuyruk4.offer(43);
        System.out.println("/////////////");
        while (!kuyruk4.isEmpty()){

                System.out.println(kuyruk4.poll());
            
        }


    }
}

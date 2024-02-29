package com.enes;

import java.util.Random;

public class TabakTest {
    public static void main(String[] args) throws InterruptedException {
        TabakManager manager=new TabakManager();
        manager.tabakOlustur();
        System.out.println(manager.kirli);
        System.out.println(manager.temiz);
        Random random=new Random();
        for (int i=1;i<=20;i++)
        {
            int secim= random.nextInt(1,3);
            manager.secimYap(secim);
            Thread.sleep(1000);
        }
    }

}

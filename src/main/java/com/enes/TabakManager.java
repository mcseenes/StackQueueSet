package com.enes;

import com.enes.stack.Tabak;

import java.util.Random;
import java.util.Stack;

public class TabakManager {
        Stack<Tabak>temiz=new Stack<>();
        Stack<Tabak>kirli=new Stack<>();
        public void tabakOlustur() {
            Random random=new Random();
            for (int i = 1; i <= 10; i++) {
                Tabak tabak = new Tabak(i, random.nextBoolean());
                if (random.nextBoolean()) {
                    temiz.push(tabak);
                } else {
                    kirli.push(tabak);
                }
            }
        }
        public void kullan()
        {
            if (temiz.isEmpty()){
                System.out.println("Temiz tabak kalmamistir");
                temizlendi();
            }
           Tabak tabak=temiz.pop();
            System.out.println(tabak.getId()+" li tabak kullanilmistir");
            tabak.setTemizMi(false);
            kirli.push(tabak);

        }
    public void temizlendi()
    {
        if (kirli.isEmpty()){
            System.out.println("Kirli tabak kalmamistir");
            kullan();
        }
        Tabak tabak=kirli.pop();
        System.out.println(tabak.getId()+" li tabak temizlendi");
        tabak.setTemizMi(true);
        temiz.push(tabak);

    }
    public void secimYap(int secim)
    {
       switch (secim){
           case 1:temizlendi();
           break;
           case 2:kullan();break;
           default:
               break;
       }

    }









}

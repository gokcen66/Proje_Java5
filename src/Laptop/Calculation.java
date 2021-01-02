package Laptop;

import java.util.ArrayList;

public class Calculation {


     /*
        Create method name is getRam

        Parameter is ArrayList<String>

        if ram is 32 gb add 300 to price
        if ram is 16 gb add 200 to price
        if ram is 8 gb add 100 to price
        if ram is 4 gb add 50 to price

        return the price.
     */


     /*
        getRam methodunu oluşturalım

        Parametresi  ArrayList<String> olsun


        Eğer ram 32 gb ise price 300 ekle
        Eğer ram 16 gb ise price 200 ekle
        Eğer ram 8 gb ise price 100 ekle
        Eğer ram 4 gb ise price 50 ekle


        return  price olmalı.

        Not price -- fiyat
     */
    int getRam(ArrayList<String >list){
        int price=0;

        if(list.get(2).equalsIgnoreCase("16 gb"))return price+200;
        if(list.get(2).equalsIgnoreCase("32 gb"))return price+300;
        if(list.get(2).equalsIgnoreCase("8 gb"))return price+100;
        if(list.get(2).equalsIgnoreCase("4 gb"))return price+50;
         return price;
    }



    /*
       Create method name is getCPU

        Parameter is ArrayList<String>

        if CPU is i3 add 200 to price
        if CPU is i5 add 300 to price
        if CPU is i7 add 500 to price

        return the price.
     */


      /*
        getCPU  methodunu oluşturalım

        Parametresi  ArrayList<String> olsun


        Eğer CPU i3 ise price 200 ekle
        Eğer CPU i5 ise price 300 ekle
        Eğer CPU i7 ise price 500 ekle


        return  price olmalı.
     */

    int getCpu(ArrayList<String >list){
        int price=0;

        if( list.get(3).equalsIgnoreCase("i3"))return price +=200;
        if( list.get(3).equalsIgnoreCase("i5"))return price +=300;
        if( list.get(3).equalsIgnoreCase("i7"))return price +=500;
        return price;
    }




    /*
      Create method name is getColor

      Parameter is ArrayList<String>

      return type is int

      if Color is Red add 400 to price
      if Color is Orange add 300 to price
      if Color is Silver add 200 to price
      if Color is Black add 150 to price

      return the price.
   */

     /*
        getColor methodunu oluşturalım

        Parametresi  ArrayList<String> olsun

        return türü int olmalı


        Eğer Color Red ise ise price 400 ekle
        Eğer Color Orange ise price 300 ekle
        Eğer Color Silver ise price 200 ekle
        Eğer Color Black ise price 150 ekle


        return  price olmalı.

     */
    int getColor(ArrayList<String >list){
        int price=0;

        if(list.get(4).equalsIgnoreCase("Red"))return price+=400;
        if(list.get(4).equalsIgnoreCase("Orange"))return price+=300;
        if(list.get(4).equalsIgnoreCase("Silver"))return price+=200;
        if(list.get(4).equalsIgnoreCase("Black"))return price+=150;
         return price;

    }



    /*
      Create method name is getSize

      return type is int

      Parameter is ArrayList<String>

      if Size contains "Mini" add 100 to price
      if Size contains "Middle" add 200 to price
      if Size contains "Max" add 300 to price

      return the price.
   */



    /*
        getSize  methodunu oluşturalım

        return türü int olmalı

        Parametresi  ArrayList<String> olsun


        Eğer Size "Mini" içeriyorsa price 100 ekle
        Eğer Size "Middle" içeriyorsa price 200 ekle
        Eğer Size "Max" içeriyorsa price 300 ekle


        return  price olmalı.
     */
    int getSize(ArrayList<String >list){
        int price=0;

        if(list.get(1).toLowerCase().contains("mini")) return price+=100;
        if(list.get(1).toLowerCase().contains("middle")) return price+=200;
        if(list.get(1).toLowerCase().contains("max")) return price+=300;
        return price;


    }



}

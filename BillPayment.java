package com.thoughtworks.assignments;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BillPayment {

    public static void main(String[] args) {
        //Linked List allows to the new items
        Scanner scr = new Scanner(System.in);
        List<Fruit>  frtList = new LinkedList<Fruit>() ;

        frtList.add(new Fruit("Apple",100.00,0.00));
        frtList.add(new Fruit("Orange",80.00,0.00));
        frtList.add(new Fruit("Banana",30.00,0.00));
        frtList.add(new Fruit("Kiwi",120.00,0.00));


        for (Fruit  frt : frtList)
        {
            System.out.println(frt.FrtName + " Enter Qty: ");
            frt.Qty = scr.nextDouble();

        }

        System.out.println("Customer Name is Praveena");;
        System.out.println("Fruit   Quantity   Amount");
        Double Tot=0.00;
        for (Fruit frt: frtList)
        {
            System.out.println(frt.FrtName + "   " + frt.Qty + "   " + frt.Qty* frt.AmtPerKG);
            Tot  = Tot+ frt.Qty*frt.AmtPerKG;

        }
        System.out.println("Total Amount = " + Tot);
        System.out.println("Thanks for your business!!! Visit again");
    }

}

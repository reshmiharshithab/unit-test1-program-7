/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int a[]=new int[5];
        int t, i=0;
        System.out.println("Enter1 the elements");
        for(i=0;i<5;i++)
           a[i]=obj.nextInt();
        System.out.println("The elements of the array are");
        for(i=0;i<5;i++)
            System.out.println(a[i]);
        System.out.println("The duplicate elements are");
        for(i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]);
                }
            }
        }
        System.out.println("Odd-Even details");
        
        for(i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println("It is even");
                
            }
            else
            {
                System.out.println("It is odd");
            }
        }
        System.out.println("Second largest");
        
        
        for(i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if (a[i]<a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                    
                }
            }
        }
        
        System.out.println(a[5-2]);
        
        
       
    }
}
    
    


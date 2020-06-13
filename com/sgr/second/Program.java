package com.sgr.second;
//import com.sgr.second.util.PriceCalculator;
import java.util.Scanner;

public class Program{

    private static void menu(){
        System.out.println("1.Shop Open");
        System.out.println("2.Print Report");
        System.out.println("3.Exit");
        System.out.println("Enter you choice");
    
    }

    private static void entry(Scanner input, String[] products,double[] price,int[] quantaty){
        for(int i=0; i<products.length; i++){
            System.out.printf("Enter the price for %s:",products[i]);
            price[i]=input.nextDouble(); 
            System.out.printf("Enter the quantaty for %s:",products[i]);
            quantaty[i]=input.nextInt();
        }

    }

    private static void report(String[] products,double[] price,int[] quantaty){
        System.out.println("product price table");
        System.out.println("-------------------------------------");
        System.out.println("product name\tQuantaty\t product Price\ttotal");

        double grandTotal=0;
        for(int i=0; i<products.length; i++){
            double total=quantaty[i] * price[i];
            System.out.printf("%s\t%d\t%f\t%f\r\n",products[i],quantaty[i],price[i],total);
            grandTotal += total; 

        }
            System.out.println("Grand Total:"+ grandTotal);


    }
    public static void main(String agrs[]){
        Scanner input=new Scanner(System.in);

        String[] products={"TV","Freeg","mob","Mackbo"};
        int size=products.length;
        double[] price=new double[size];
        int[] quantaty=new int[size];

        while(true){
            menu();
            int choice=input.nextInt();
            if(choice==1){
                entry(input, products, price, quantaty);
            }else if(choice==2){
                report(products, price, quantaty);
            }else{
                System.exit(0);
            }
        }

    }

} 
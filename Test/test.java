package Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class test {
    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter money");
        int money = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter number of toys");
        int n = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter prices");
        int[] prices = new int[n];
        for(int i=0; i<n; i++){
            prices[i] = sc3.nextInt();
        }
        System.out.println(getMaxToys(prices,money));
    }

    public static int getMaxToys(int[] prices, int money){
         
        int sum = 0;
        int count = 0;
        int maximun = 0;

        for(int i=0; i<prices.length; i++){
            sum=count=0;
            for(int j=i; j<prices.length; j++){
                if(sum+prices[j]<=money){
                    count=count+1;
                    sum=sum+prices[j];
                    maximun = Math.max(count, maximun);
                }
                else{
                    count=0;
                    sum=0;
                    break;
                }
            }
        }
        return maximun;
    }
    
}

/*
        THIS PROGRAM GIVES A USER AN OPTION
        TO EITHER HAVE A MACHINE RANDOMLY GENERATE ANY INTEGER OR
        INSERT FROM THE KEYBOARD AND CHECK
        WHETHER THE NUMBER IS PRIME OR NOT
        */
import java.util.*;
public class PrimeNumbers
{
    public static void main(String args[]) {

        int num = 9, random_num;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        do{
            System.out.println("\nPLEASE TYPE IN R-->FOR RANDOM NUMBER AND U-->FOR USER INPUT");
            String xx=scan.nextLine();
            if(xx.equalsIgnoreCase("U")){
                do {
                    System.out.println("Enter positive Integer greater than zero to check whether its prime or not ||-1 to exit:");
                    num = scan.nextInt();
                    if(num<=0){
                        System.out.println(num+" is neither prime nor composite Please enter only +ve integers.....");
                    }
                    else if (num==1||num ==2||num ==3||num == 5||num==7)
                    {
                        System.out.println(num + " is  a prime number");
                    } else if (num % 2 == 0 || num %3==0||num%5== 0||num%7==0)
                    {
                        System.out.println(num + " is not a prime number");
                    } else if(num%2!=0||num%3!=0||num%5!=0||num%7!=0) {
                        System.out.println(num+" is a prime number");
                    }else { }
                }
                while (num != -1);
            }else{
                if(xx.equalsIgnoreCase("R")){
                    System.out.println("Random number is generating....");
                    num=rand.nextInt(250);
                    if(num==0){
                        System.out.println(num+" is neither prime nor composite number ");
                    }
                    else if (num == 2 || num == 1 || num == 3 || num == 5 || num == 7) {
                        System.out.println(num + "-is  a prime number");
                    } else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
                        System.out.println(num + "-is not a prime number");
                    } else if(num%2!=0||num%3!=0||num%5!=0||num%7!=0){
                        System.out.println(num+" is a prime number");
                    }else{}
                }
            }
        }while(num!=-1);
    }
}
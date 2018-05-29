/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Banking {
    double bal;
    int Create(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Name :" );
        char name=in.next().charAt(0);
        return 0;               //count                                 
    }
    double Deposit(){
       Scanner in=new Scanner(System.in);
        System.out.println("Enter Amount : " ); 
        double damt=in.nextDouble();             //write if stmt for 500/-
        return 0;
    }
    double Withdraw(){
       Scanner in=new Scanner(System.in);
        System.out.println("Enter withdrawl Amount : " ); 
        double wamt=in.nextDouble();
        
        if((bal-wamt)<500){
        System.out.println("Insufficient Amount" );    
        return 0;
        }
        bal-=wamt;
        System.out.println("Current Balance : " +bal );
        return 0;
    }
    double Transfer(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1st acc no : " );
        int acc1=in.nextInt();
        System.out.println("Enter Transfer Amount : " );
        double tamt=in.nextDouble();
        
        if((bal-tamt)<500){
        System.out.println("Insufficient Amount \n Transfer fail" );    
        return 0;
        }
        System.out.println("Enter 2nd acc no : " );
        int acc2=in.nextInt();
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=0;
        System.out.println("Welcome");
        Scanner in=new Scanner(System.in);        
        System.out.println("Enter your choice: " );
        int ch=in.nextInt();
        switch(ch){
            case 1: Create();
                    break;
                    
            case 2: Deposit();
                    break;
                    
            case 3: Withdraw();
                    break;
                    
            case 4: Transfer();
                    break;
                    
            case 5: Total();
                    break;
                    
            case 6: Rich();
                    break;
        }
        }
    }
    

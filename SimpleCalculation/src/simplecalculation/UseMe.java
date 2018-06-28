/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculation;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class UseMe {

    public static double Addition(double x,double y){
        return x+y;
    }
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ist number");
        double num1=scanner.nextDouble();
        System.out.println("Enter 2nd number");
        double num2=scanner.nextDouble();
        double add=UseMe.Addition(num1, num2);
        System.out.println("Sum of "+num1+" and "+num2+" numbers is "+add);
    
        }catch(Exception e){
            System.out.println("Enter numbers only!!!!!!!!!!!!!!!!!");
        }
    }
    
}

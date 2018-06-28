/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculation;


import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class UseMe {

    public static double Addition(double x,double y){
        return x+y;
    }
    public static double Subtraction(double x,double y){
        return x-y;
    }
    public static void main(String[] args) {
        try{
       
        String s1=   JOptionPane.showInputDialog("Enter 1st number");
        double num1=Integer.parseInt(s1);
        String s2=   JOptionPane.showInputDialog("Enter 2nd number");
        double num2=Integer.parseInt(s2);
        double add=UseMe.Addition(num1, num2);
        System.out.println("Sum of "+num1+" and "+num2+" numbers is "+add);
        double subtraction=UseMe.Subtraction(num1,num2);
            System.out.println("Difference of "+num1+" and "+num2+" numbers is "+subtraction);
        }catch(Exception e){
            JOptionPane.showMessageDialog( null, "Enter number only", "Failure", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package typecasting;
import java.util.Scanner;

/**
 *
 * @author evrob0095
 */
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter integer");
        int iInput = input.nextInt();
        System.out.println((double)iInput);
        System.out.println("Enter Doube");
        double dInput = input.nextDouble();
        Math.round(dInput);
        System.out.println((int)dInput);
        System.out.println("Enter Char");
        char cInput = input.next().charAt(0);
        System.out.println(String.valueOf(cInput));
        System.out.println("Enter string");
        String sInput = input.nextLine();
        sInput = input.nextLine();
        char cInput2 = sInput.charAt(0);
        System.out.println(cInput2);
        System.out.println("Enter int");
        int iInput2 = input.nextInt();
        String sInput2 = Integer.toString(iInput2);
        System.out.println(Integer.valueOf(sInput2));
        System.out.println("Enter double");
        double dInput2 = input.nextDouble();
        String sInput3 = Double.toString(dInput2);
        System.out.println(Double.valueOf(sInput3));
    }
    
}

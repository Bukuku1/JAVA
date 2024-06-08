/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
package hello;

/**
 *
 * @author TIME MATTERS
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Number:");
        int num = scan.nextInt();
        System.out.print("Enter the Value of n:");
        int n = scan.nextInt();
        
        System.out.println("\nPrinting"+num+ "for" +n+ " times:");
                
    }
    
}

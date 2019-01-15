/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remedialoop;

/**
 *
 * @author EFFIE
 */
import java.util.Scanner;
public class RemedialOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter your name: ");
        while(input.hasNext()){
            name = input.nextLine();
            System.out.println("Enter your age: ");
            age = input.nextInt();
            
               System.out.print("My name is "+name+
                       ". I am "+age+" years old.\n");
        }
      
       
       
    }
    
}

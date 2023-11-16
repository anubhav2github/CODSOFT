/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codsoft.internship;

/**
 *
 * @author anubhav_pc
 */
import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.println("Total marks is: " +total);
        System.out.println("Average percentage is: " +avg);
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.println("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.println("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("D");
        }
    }
}
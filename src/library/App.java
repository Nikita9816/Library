/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("List of exercises");
            System.out.println("0. Close the App");
            System.out.println("1. Add a book");
            System.out.println("2. Add a reader");
            System.out.println("3. Give a book");
            System.out.println("4. Return book");
            System.out.println("5. List of books");
            System.out.print("Choose number of exercise:");
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("-----------------");
            switch(task){
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Add a book");
                    break;
                case 2:
                    System.out.println("2. Add a reader ");
                    break;
                case 3:
                    System.out.println("3. give a book");
                    break;
                case 4:
                    System.out.println("Return a book.");
                    break;
                case 5:
                    System.out.println("5. List of books");
                default:
                    System.out.println("Choose a Exercise from list");
            }
            System.out.println(" ======---------======= ");
        }while(repeat);
        System.out.println("Goodbye, guys !!!");
    }
}

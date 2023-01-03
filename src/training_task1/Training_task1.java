/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_task1;
import java.util.Scanner;
/**
 *
 * @author Microsoft
 */
public class Training_task1 {

    /**
     * @param args the command line arguments
     */
      static void myMethod() {
    System.out.println("I just got executed!");
  }
    public static void main(String[] args) {
        
       employee hmm =new employee("hmm","Asyut",23,Gender.female);
       department is =new department();
       is.addEmployee(hmm);
       is.print_basic_data();
       is.countEmployee();
//    System.out.println( hmm.toString());

 
    }
}

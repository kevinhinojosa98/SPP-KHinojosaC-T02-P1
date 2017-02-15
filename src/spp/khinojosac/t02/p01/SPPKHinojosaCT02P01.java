/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.khinojosac.t02.p01;
import java.util.Scanner;
/**
 *
 * @author Kevin Hinojosa
 */
public class SPPKHinojosaCT02P01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cate, he;
        double sue, op;
        
        System.out.println("Categoria 1 ($30.00)");
        System.out.println("Categoria 2 ($38.00)");
        System.out.println("Categoria 3 ($50.00)");
        System.out.println("Categoria 4 ($70.00)");
        
       
        System.out.println("Calculadora de Salario en base a horas extras trabajadas");
        
        cate=teclado.nextInt();
        
         if(cate>0) if(cate<=4){
        switch(cate){
            case 1: 
                System.out.println("Introduce el salario base");
                sue=teclado.nextDouble();
                System.out.println("Introduce las horas extras trabajadas");
                he=teclado.nextInt();
                op=(sue+(he*30));
                System.out.println("Tu salario sería de $" + op);
                
            case 2: 
                System.out.println("Introduce el salario base");
                sue=teclado.nextDouble();
                System.out.println("Introduce las horas extras trabajadas");
                he=teclado.nextInt();
                op=(sue+(he*38));
                System.out.println("Tu salario sería de $" + op);
                
            case 3:
                System.out.println("Introduce el salario base");
                sue=teclado.nextDouble();
                System.out.println("Introduce las horas extras trabajadas");
                he=teclado.nextInt();
                op=(sue+(he*50));
                System.out.println("Tu salario sería de $" + op);
                
            case 4: 
                 System.out.println("Introduce el salario base");
                sue=teclado.nextDouble();
                System.out.println("Introduce las horas extras trabajadas");
                he=teclado.nextInt();
                op=(sue+(he*70));
                System.out.println("Tu salario sería de $" + op);
                
            
        }
         }
               
        
        else{
                System.out.println("Los cálculos no pueden realizarse");
        }
         
         teclado.nextLine();
                
        }
        // TODO code application logic here
    }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluno_professor;

import java.util.Scanner;




public class Aluno extends Pessoa {
    String ra;
    double media;
    double soma = 0;
    double rsConta;
   
       Scanner ler = new Scanner(System.in);
    
    
    public void mediaN(double[] notas){

        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }
         media = soma / 5;

       if(media >= 7.0){
           System.out.println("Parabens " + nome + " voce passou de ano");
       }else if(media >= 5.0){
               System.out.println("Voce esta de recuperação \n");
               
               System.out.println("Para sair da recuperação faça esta conta 10x5-5");
                 rsConta = ler.nextDouble();
               
                 if(rsConta == 45){
                     System.out.println("Boaaa " + nome + " voce acertou a recupeção e passou de ano");
                 }else{
                     System.out.println("ERRADO " + nome + " infelismente voce está reprovado");
                     System.out.println(nome + " entraremos em contato no numero " + numero + " para fazer a rematricula");
               }
       }else{
           System.out.println(nome + " infelismente voce está reprovado");
           System.out.println(nome + " entraremos em contato no numero " + numero + " para fazer a rematricula");
               
       }
}


}



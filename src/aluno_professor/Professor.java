/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluno_professor;

/**
 *
 * @author Vitinho
 */
public class Professor extends Pessoa {
    String cpf;
     double salario;
     double horaExtra; 
     double qtdHE;
     double salarioFinal;
     
public void SLF (){
    
    qtdHE = horaExtra * 10;
    salarioFinal = salario + qtdHE;
    
    System.out.println("Olaa " + nome + " o valor de suas horas extras foram de R$" + qtdHE + " então seu salario final foi de R$" + salarioFinal);
    
}
    
}

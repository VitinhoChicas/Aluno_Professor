/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aluno_professor;

import java.util.Scanner;

/**
 *
 * @author Vitinho
 */
public class Aluno_Professor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double[] notas = new double[5];
        double rsConta;
        
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        Scanner leia = new Scanner(System.in);
        
        
        
        // a variavel (opvalida) é do tipo falso entao o while se inicia como fasta , quando ela é = true (verdade) ela sai do while
        boolean opValida = false; 
        
              
        while(! opValida){
        System.out.println("Ola! este é um sistema para calcular uma nota caso vc seja um aluno ou calcular as horas extras caso vc seja professor.");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Opções :");
        System.out.println("A - Aluno");
        System.out.println("P - Professor ");
        System.out.print("Informe uma opção : ");
       
        String op = leia.nextLine().toLowerCase();
        //.toLowerCase(); // Convertendo para minúsculas
        
        
        switch (op){
            
            case "a" :
            
                System.out.println("\n Olaa! Voce é um aluno, informe seus dados e as notas de suas provas");
                System.out.println("");
                System.out.print("Informe o seu nome: ");
                aluno.nome = leia.nextLine();
                
                System.out.print("Informe sua idade: ");
                aluno.idade = leia.nextLine();
                
                System.out.print("Inform seu telefone: ");
                aluno.numero = leia.nextLine();
                
                System.out.print("Informe seu RA: ");
                aluno.ra = leia.nextLine();
                
                
                System.out.println("\n Pronto, Agora informe suas notas para saber se voce passou de ano ou não \n");
                
                 for(int i = 0; i < 5; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = leia.nextDouble();
                 }                
                
                System.out.println("");   
                aluno.mediaN(notas);
                
                opValida = true;
                break;
                
            case "p" :
                
                System.out.println("\n Olaa! Voce é professor, informe seus dados e seu salario e suas horas extras");
                
                System.out.println("");
                System.out.print("Informe o seu nome: ");
                professor.nome = leia.nextLine();
                
                System.out.print("Informe sua idade: ");
                professor.idade = leia.nextLine();
                
                System.out.print("Inform seu telefone: ");
                professor.numero = leia.nextLine();
                
                System.out.print("Informe seu CPF : ");
                professor.cpf = leia.nextLine();
                
                System.out.println("\n Lembrando que as horas extras da sua escola é = R$10,00 \n");
                
                System.out.print("informe quantas horas extras vc tem : ");
                professor.horaExtra = leia.nextDouble();
                
                System.out.print("Informe seu salario : ");
                professor.salario = leia.nextDouble();
                
                System.out.println("");
                professor.SLF();
                
                 opValida = true;
                break;
            default:
                System.out.println("Opção invalida, informe 1 - Para aluno e 2 - Para Professor  ");
                System.out.println("");
                break;
        }
        }
        
       /*
        
O método close() da classe Scanner em Java é usado para fechar o recurso associado ao scanner, liberando
os recursos do sistema que o scanner estava utilizando. Isso é importante para evitar vazamentos de 
recursos e liberar memória quando você termina de usar o scanner.
        
Quando você utiliza o Scanner para ler entrada do usuário a partir do teclado ou de outros fluxos de
entrada, é boa prática fechar o scanner quando você termina de usá-lo, especialmente se você não vai 
mais precisar dele. Isso libera os recursos do sistema que estavam sendo utilizados pelo scanner 
e ajuda a evitar possíveis problemas de desempenho ou vazamentos de recursos.
        */
        leia.close();
        
    }
    
}

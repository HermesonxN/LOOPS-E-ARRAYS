package br.com.dio.execicios.loops;

import java.util.Scanner;

/**
 * <h1>Exercício 6 - Loops </h1>
 * Esse programa mostrara o fatorial de um numero inserido pelo usuário.
 * 
 * @author Hermeson Oliveira
 * @version 1.0
 * @since 14/03/23
  */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, fatorial, multiplicacao = 1;

        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();

        System.out.print(fatorial + "! = ");
        for(i = fatorial; i >= 1; i--){
            multiplicacao *= i;
        }
        System.out.println(multiplicacao);
    }
}

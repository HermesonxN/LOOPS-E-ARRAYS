package br.com.dio.execicios.loops;

import java.util.Scanner;

/**
 * <h1>Exercício 1 - Loops </h1>
 * Esse programa ficara em laço(loop) pedindo nome e idade do usuário
 * até que seja dado o valor 0 a variável nome.
 * 
 * @author Hermeson Oliveira
 * @version 1.0
 * @since 14/03/23
 */
public class NomeEIdade{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();

            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }
    }
}
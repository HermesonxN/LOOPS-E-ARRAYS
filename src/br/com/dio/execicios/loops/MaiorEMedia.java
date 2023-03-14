package br.com.dio.execicios.loops;

import java.util.Scanner;

/**
 * <h1>Exercício 3</h1>
 * O programa abaixo ira pedir 5 numeros ao usuário, dizer qual foi o maior
 * e calcular a media desses numeros.
 * 
 * @author Hermeson Oliveira
 * @version 1.0
 * @since 14/03/23
  */
public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, media = 0, maior = 0, contador = 0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero > maior)
                maior = numero;

            media += numero;

            contador++;
        }while(contador<5);

        System.out.println("Maior numero: " + maior);
        System.out.println("Media dos numeros: " + (media/5));
    }
}

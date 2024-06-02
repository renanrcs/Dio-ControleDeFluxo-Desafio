package io.github.renanrcs;

import io.github.renanrcs.exception.InvalidParametersException;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int firstParameter = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int secondParameter = scan.nextInt();

        try {
            InvalidParametersException.validateParameters(firstParameter, secondParameter);
            count(firstParameter, secondParameter);
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());;
        }

    }

    private static void count(Integer firstParameter, Integer secondParameter)  {
        int score = secondParameter - firstParameter;
        for (int i = 1; i <= score; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
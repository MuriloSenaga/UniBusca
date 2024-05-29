package com.myuniversityapp;

import com.myuniversityapp.Boundary.RealizaSimulado;
import com.myuniversityapp.Boundary.TesteVocacional;
import com.myuniversityapp.Boundary.BolsasOportunidades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao = "";
        
        while (!opcao.equals("4")) {
            System.out.println("************** Menu Principal **************");
            System.out.println("1. Realiza Simulado");
            System.out.println("2. Teste Vocacional");
            System.out.println("3. Bolsas e Oportunidades de Eventos e Emprego");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    RealizaSimulado.realizaSimulado();
                    break;
                case "2":
                    TesteVocacional.testeVocacional();
                    break;
                case "3":
                    BolsasOportunidades.bolsasOportunidades();
                    break;
                case "4":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

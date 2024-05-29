package com.myuniversityapp.Boundary;

import com.myuniversityapp.Control.RealizaSimuladoCtrl;
import com.myuniversityapp.Entity.Simulado;

import java.util.Scanner;

public class RealizaSimulado {
    public static void realizaSimulado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("************** Realiza Simulado **************");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        Simulado simulado = new Simulado(nome);
        RealizaSimuladoCtrl.realizaSimulado(simulado);
    }
}

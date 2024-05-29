package com.myuniversityapp.Boundary;

import com.myuniversityapp.Control.BolsasOportunidadesCtrl;
import com.myuniversityapp.Entity.BolsaOportunidade;

import java.util.Scanner;

public class BolsasOportunidades {
    public static void bolsasOportunidades() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("************** Bolsas e Oportunidades de Eventos e Emprego **************");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        BolsaOportunidade bolsaOportunidade = new BolsaOportunidade(nome);
        BolsasOportunidadesCtrl.bolsasOportunidades(bolsaOportunidade);
    }
}

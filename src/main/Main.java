/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bean.Pessoa;
import controller.PessoaController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author junior
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String controle = null;
        List<Pessoa> listaPessoas = new ArrayList<>();
        PessoaController pessoaController = new PessoaController();
        do {    
            Pessoa pessoa = new Pessoa();
            System.out.println("Digite seu nome: \n");
            pessoa.setNome(input.nextLine());
            pessoa.setNome(input.nextLine());
            System.out.println("Digite seu sexo M-Masculino F-Feminino: \n");
            pessoa.setSexo(input.nextLine());
            controle = pessoa.getNome();
            System.out.println("Digite sua idade: \n");
            pessoa.setIdade(input.nextInt());
            System.out.println("Digite seu peso: \n");
            pessoa.setPeso(input.nextDouble());
            System.out.println("Digite sua altura: \n");
            pessoa.setAltura(input.nextDouble());
            listaPessoas.add(pessoa);
        } while (!controle.contains(" fim"));
       
        pessoaController.getRelatorio(listaPessoas);
    }
    
}

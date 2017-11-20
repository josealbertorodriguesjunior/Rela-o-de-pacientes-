/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Pessoa;
import java.util.List;

/**
 *
 * @author junior
 */
public class PessoaController {
    
    public int getAll(List<Pessoa> listaPessoas){
        int total = 0;
        for (int i = 0; i < listaPessoas.size(); i++) {
            total++;
        }
        return total;
    }
    
    public Double getIdadeMediaHomens(List<Pessoa> listaPessoas){
        Double somaIdades = 0.0;
        Double media = 0.0;
        int iterator = 0;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getSexo().toUpperCase().equals("M")) {
                somaIdades += listaPessoas.get(i).getIdade();
                iterator++;
            }
        }
        media = somaIdades/iterator;
        return media;
    }
    
    public int getMulheres(List<Pessoa> listaPessoas){
        int iterator = 0;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getAltura() > 1.60 && listaPessoas.get(i).getAltura() < 1.70 && listaPessoas.get(i).getPeso() > 70.0) {
                if (listaPessoas.get(i).getSexo().toUpperCase().equals("F")) {
                    iterator++;
                }
                
            }
        }
        return iterator;
    }
    
    public int getPessoasIdade(List<Pessoa> listaPessoas){
        int iterator = 0;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getIdade() > 17 && listaPessoas.get(i).getIdade() < 26) {
                iterator++;
            }
        }
        return iterator;
    }
    
    public String getPacienteMaisVelho(List<Pessoa> listaPessoas){
        String nome = null;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if(listaPessoas.get(i).getIdade()>listaPessoas.get(i-1).getIdade()){
                nome = listaPessoas.get(i).getNome();
            }
        }
        return nome;
    }
    
    public String getNomeMulherBaixa(List<Pessoa> listaPessoas){
        String nome = null;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if(listaPessoas.get(i).getSexo().toUpperCase().equals("F")){
                if (listaPessoas.get(i).getAltura()<listaPessoas.get(i-1).getAltura()) {
                    nome = listaPessoas.get(i).getNome();
                }
            }
        }
        return nome;
    }
    
    public void getRelatorio(List<Pessoa> listaPessoas){
        System.out.println("Numero total de Pessoas "
                            +"\n"+this.getAll(listaPessoas)
                            +"\nIdade media dos homens "
                            +"\n"+this.getIdadeMediaHomens(listaPessoas)
                            +"\nMulheres com altura entre 1,60 e 1,70 e peso superior a 70kg\n"
                            +"\n"+this.getMulheres(listaPessoas)
                            +"\nPessoas com idades entre 18 e 25 anos"
                            +"\n"+this.getPessoasIdade(listaPessoas)
                            +"\nNome do paciente mais velho"
                            +"\n"+this.getPacienteMaisVelho(listaPessoas)
                            +"\nNome do paciente mais velho"
                            +"\n"+this.getNomeMulherBaixa(listaPessoas));
    }
}

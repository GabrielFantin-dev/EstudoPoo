package aula03;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args){
        Arrays.sort(new int[]{5, 2, 8, 1, 3});
        Produtos produto1 = new Produtos("Notebook", 3000.0, 10);
        Produtos produto2 = new Produtos("Mouse", 50.0, 50);
        System.out.println("Informações do Produto 1:");
        produto1.exibirInformacoes();
        System.out.println("Informações do Produto 2:");
        produto2.exibirInformacoes();
        
    }

}

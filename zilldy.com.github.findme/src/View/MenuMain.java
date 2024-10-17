package View;

import Control.ConsultaCEP;
import Control.GeradorDeArquivo;
import Model.Endereco;

import java.io.IOException;
import java.util.Scanner;

public class MenuMain {

    public void menuMain() {
        Scanner tc = new Scanner(System.in);
        String cep;
        ConsultaCEP consultaCep = new ConsultaCEP();

        System.out.print("Digite um CEP para consulta: ");
        cep = tc.nextLine();

        try {

            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo geraArquivo = new GeradorDeArquivo();
            geraArquivo.geraJson(novoEndereco);
            System.out.println("Arquivo gerado com sucesso!");

        } catch (RuntimeException | IOException e) {

            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");

        }

        tc.close();
    }

}

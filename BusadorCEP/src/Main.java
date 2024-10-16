public class Main {
    public static void main(String[] args) {
        ConsultaCEP consultaCep = new ConsultaCEP();

        Endereco novoEndereco = consultaCep.buscaEndereco("06010170");

        System.out.println(novoEndereco);
        
    }
}

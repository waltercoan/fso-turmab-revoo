import javax.swing.plaf.synth.SynthSeparatorUI;

import entidades.Cidade;
import entidades.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        float peso = 100;
        int idade = 20;
        var nome = "zezinho";
        //variavel
        Cliente umCliente;
        //instanciação de um objeto
        umCliente = new Cliente("Zezinho");
        System.out.println(umCliente);
        System.out.println(umCliente.getNome());

        var umaCidade = new Cidade("Joinville");
        umCliente.setCidade(umaCidade);
        System.out.println(umCliente.getCidade().getNome());
    }
}

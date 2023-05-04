import br.com.benezinhobank.model.Agencia;
import br.com.benezinhobank.model.Banco;
import br.com.benezinhobank.model.ContaCorrente;
import br.com.benezinhobank.model.ContaPoupanca;
import br.com.benezinhobank.pessoa.model.PessoaFisica;
import br.com.benezinhobank.pessoa.model.PessoaJuridica;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Banco benezinho = new Banco("Benezinho Bank");


        Agencia osasco = new Agencia();
        osasco.setBanco(benezinho);
        osasco.setNome("Osasco");
        osasco.setNumero("1-9");

        PessoaFisica bene = new PessoaFisica();
        bene.setCPF("123.123.123-12");
        bene.setNome("Benefrancias do Nascimento");
        bene.setNascimento(LocalDate.of(1977,3,8));


        PessoaFisica mae = new PessoaFisica();
        mae.setCPF("234.234.234-23");
        mae.setNome("Maria Raquel");
        mae.setNascimento(LocalDate.of(1946,10,9));
        bene.setMae(mae);
        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(osasco);
        cc.setTitular(bene);
        cc.setSaldo(1-000-000.99);
        cc.setLimite(5-000);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero("2-8");
        cp.setAniversario(4);
        cp.setAgencia(osasco);
        cp.setSaldo(500_000);
        cp.setTitular(mae);

        PessoaJuridica holding = new PessoaJuridica();
        holding.setCNPJ("12312312/0001-98");
        holding.setNascimento(LocalDate.of(1988,10,5));
        holding.setNome("Benezinho Holding");
        holding.setRazaoSocial("Benezinho Holding");

        ContaCorrente ccH = new ContaCorrente();
        ccH.setNumero("3-7");
        ccH.setLimite(800_000);
        ccH.setSaldo(80_000_000);
        ccH.setTitular(bene);
        ccH.setAgencia(osasco);

        System.out.println(ccH);


    }
}
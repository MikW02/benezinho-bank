package br.com.benezinhobank.pessoa.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class PessoaJuridica extends  Pessoa{

    private String CNPJ;

    private String razaoSocial;

    private ArrayList<PessoaFisica> Socios= new ArrayList<PessoaFisica>();


    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, LocalDate nascimento, String CNPJ, String razaoSocial) {
        super(nome, nascimento);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public ArrayList<PessoaFisica> getSocios() {
        return Socios;
    }

    public void setSocios(ArrayList<PessoaFisica> socios) {
        Socios = socios;


    }

    @Override
    public String toString() {
        return "\nPessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", Socios=" + Socios +
                "} " + super.toString();
    }
}

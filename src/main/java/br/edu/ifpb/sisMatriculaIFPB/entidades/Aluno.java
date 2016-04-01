package br.edu.ifpb.sisMatriculaIFPB.entidades;

import java.time.LocalDate;

/**
 * Para construir um objeto de Aluno, utilize {@link AlunoBeilder}
 * @author Aluísio
 */
   public final class Aluno {

    private int id;
    private final String nome;
    private final String sobreNome;
    private final LocalDate dataNascimento;
    private final String nacionalidade;
    private final String rg;
    private final String cpf;
    private final String docMilitar;
    private final String sexo;

    protected Aluno(int id, String nome, String sobreNome, LocalDate dataNascimento,String sexo, String nacionalidade, String rg, String cpf, String docMilitar) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.rg = rg;
        this.cpf = cpf;
        this.docMilitar = docMilitar;
        this.sexo = sexo;
    }


    public String getSobreNome() {
        return sobreNome;
    }

   

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDocMilitar() {
        return docMilitar;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", dataNascimento=" + dataNascimento + ", nacionalidade=" + nacionalidade + ", rg=" + rg + ", cpf=" + cpf + ", docMilitar=" + docMilitar + ", sexo=" + sexo + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisMatriculaIFPB.entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author José
 */
public class AlunoBeilder {

    private int id;
    private final String nome;
    private final String sobreNome;
    private final  LocalDate dataNascimento;
    private final String nacionalidade;
    private final String rg;
    private final String cpf;
    private  String docMilitar ;
    private  String sexo;

   

    public AlunoBeilder(String nome, String sobreNome, LocalDate dataNascimento, String nacionalidade, String rg, String cpf) {
          this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.rg = rg;
        this.cpf = cpf;
        

    }

    public AlunoBeilder comDocMilitar(String docMilidat) {
         long idade = this.dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS);
            if(idade >= 18 && this.sexo.equalsIgnoreCase(Sexo.MASCULINO.name()) ){
                this.docMilitar = docMilidat;
                 return this;
            }
                
       
        return this;

    }
     public AlunoBeilder comId(int id) {
        this.id = id;
        return this;

    }
       public AlunoBeilder comSexo(String sexo) {
        this.sexo = sexo;
        return this;
       }

    public Aluno BeilderAluno() {
      return  new Aluno(this.id, this.nome, this.sobreNome, this.dataNascimento,this.sexo, this.nacionalidade, this.rg, this.cpf, this.docMilitar);
    }
     

}

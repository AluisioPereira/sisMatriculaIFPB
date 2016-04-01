/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisMatriculaIFPB.excecao;

import java.time.LocalDate;

/**
 *
 * @author Aluísio
 */
public class DocMilitarExcecao extends Exception{

    public DocMilitarExcecao() {
        super("Informe o documento militar para: \n"
                + "> aluno(s) do sexo masculino; \n"
                + "> aluno(s) maiores de 18 anos.");
    }
    
}

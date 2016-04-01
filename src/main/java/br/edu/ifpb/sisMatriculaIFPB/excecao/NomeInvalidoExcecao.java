
package br.edu.ifpb.sisMatriculaIFPB.excecao;

import java.lang.reflect.Executable;

/**
 *
 * @author Aluísio
 */
public class NomeInvalidoExcecao extends Exception{

    public NomeInvalidoExcecao() {
        super("O nome está inválido! \n"
                + "> Não pode conter números; \n"
                + "> Tem que ter o sobrenome do(a) aluno(a).");
    }
    
}

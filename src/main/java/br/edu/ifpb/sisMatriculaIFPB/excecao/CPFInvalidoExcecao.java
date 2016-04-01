
package br.edu.ifpb.sisMatriculaIFPB.excecao;

/**
 *
 * @author Aluísio
 */
public class CPFInvalidoExcecao extends Exception{

    public CPFInvalidoExcecao() {
        super("CPF inválido ou inexistente!");
    }
    
}

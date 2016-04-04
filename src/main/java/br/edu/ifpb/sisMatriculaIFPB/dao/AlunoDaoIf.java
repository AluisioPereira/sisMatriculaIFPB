package br.edu.ifpb.sisMatriculaIFPB.dao;

import br.edu.ifpb.sisMatriculaIFPB.entidades.Aluno;
import java.util.List;

/**
 *
 * @author Aluísio
 */
public interface AlunoDaoIf {

    public boolean add(Aluno aluno);

    public boolean buscaPorCPF(String cpf);

    public boolean buscaPorDocMilitar(String docMilitar);

}

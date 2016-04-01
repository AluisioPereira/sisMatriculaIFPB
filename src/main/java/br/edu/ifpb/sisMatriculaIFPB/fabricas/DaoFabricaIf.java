
package br.edu.ifpb.sisMatriculaIFPB.fabricas;

import br.edu.ifpb.sisMatriculaIFPB.dao.MatriculaDaoIf;
import br.edu.ifpb.sisMatriculaIFPB.dao.AlunoDaoIf;

/**
 *
 * @author Aluísio
 */
public interface DaoFabricaIf {

    public AlunoDaoIf criaAlunoDao();

    public MatriculaDaoIf criaMatriculaDao();

}

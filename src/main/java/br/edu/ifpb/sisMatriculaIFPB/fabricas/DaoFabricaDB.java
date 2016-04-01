
package br.edu.ifpb.sisMatriculaIFPB.fabricas;

import br.edu.ifpb.sisMatriculaIFPB.dao.AlunoDao;
import br.edu.ifpb.sisMatriculaIFPB.dao.AlunoDaoIf;
import br.edu.ifpb.sisMatriculaIFPB.dao.MatriculaDao;
import br.edu.ifpb.sisMatriculaIFPB.dao.MatriculaDaoIf;

/**
 *
 * @author Aluísio
 */
public class DaoFabricaDB implements DaoFabricaIf {

    public AlunoDaoIf criaAlunoDao(){
        return new AlunoDao();
    }

    @Override
    public MatriculaDaoIf criaMatriculaDao(){
        return new MatriculaDao();
    }

}

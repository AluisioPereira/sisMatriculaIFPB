package br.edu.ifpb.sisMatriculaIFPB.fabricas;

import br.edu.ifpb.sisMatriculaIFPB.dao.AlunoDao;
import br.edu.ifpb.sisMatriculaIFPB.dao.AlunoDaoIf;

/**
 *
 * @author Aluísio
 */
public class DaoFabricaDB implements DaoFabricaIf {

    public AlunoDaoIf criaAlunoDao() {
        return new AlunoDao();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisMatriculaIFPB.model;

import br.edu.ifpb.sisMatriculaIFPB.dao.AlunoDaoIf;
import br.edu.ifpb.sisMatriculaIFPB.fabricas.DaoFabrica;

/**
 *
 * @author José
 */
public class BuscaPorDocumentos {

    public BuscaPorDocumentos() {
    }
    

    private AlunoDaoIf alunoDao = DaoFabrica.crearFabrica(DaoFabrica.DAO_BD).criaAlunoDao();

    public boolean buscaPorCPF(String cpf) {
        return alunoDao.buscaPorCPF(cpf);

    }

    public boolean buscaPorDocMilitar(String docMilitar) {
        return alunoDao.buscaPorDocMilitar(docMilitar);

    }

}

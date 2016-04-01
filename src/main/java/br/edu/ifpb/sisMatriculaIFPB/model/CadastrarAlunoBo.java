/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisMatriculaIFPB.model;

import br.edu.ifpb.sisMatriculaIFPB.entidades.Aluno;
import br.edu.ifpb.sisMatriculaIFPB.fabricas.DaoFabrica;
import java.util.Map;

/**
 *
 * @author José
 */
public class CadastrarAlunoBo {

    public CadastrarAlunoBo() {
    }

    public Map<String, String> cadastrarAluno(Aluno aluno) {
        Map<String, String> result = ValidarAluno.ValidarAluno(aluno);
        if (result.get("passou").equalsIgnoreCase("true")) {
            if (DaoFabrica.crearFabrica(DaoFabrica.DAO_BD).criaAlunoDao().add(aluno)) {
                result.put("passou", "true");
            } else {
                result.put("passou", "false");
            }
        }
        return result;
    }
}

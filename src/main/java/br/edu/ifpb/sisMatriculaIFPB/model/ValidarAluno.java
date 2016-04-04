/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisMatriculaIFPB.model;

import br.edu.ifpb.sisMatriculaIFPB.entidades.Aluno;
import br.edu.ifpb.sisMatriculaIFPB.Enum.Sexo;
import br.edu.ifpb.sisMatriculaIFPB.dao.AlunoDaoIf;
import br.edu.ifpb.sisMatriculaIFPB.fabricas.DaoFabrica;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author José
 */
public class ValidarAluno {

    public ValidarAluno() {
    }

    public static Map<String, String> ValidarAluno(Aluno aluno) {
        Map<String, String> resultado = new HashMap<>();
        ValidaCPF validaCPF = ValidaCPF.getInstancia();
        long idade = aluno.getDataNascimento().until(LocalDate.now(), ChronoUnit.YEARS);
        if (!validaCPF.validaCPF(aluno.getCpf())) {
            resultado.put("cpf", "informe o cpf");
        }
        if (aluno.getNome().trim().isEmpty()) {
            if (!aluno.getNome().matches("[A-Za-zÀ-ú0-9 ]+")) {
                resultado.put("nome", "infome o nome");
            }
        }
        if (aluno.getSobreNome().trim().isEmpty()) {
            resultado.put("sobreNome", "infome sobreNome");
        }
        if (aluno.getDataNascimento() == null) {
            resultado.put("dataNascimento ", "data de nascimento");
        }
        if (aluno.getSexo().equalsIgnoreCase(Sexo.MASCULINO.name()) && idade > 17) {
            if (aluno.getDocMilitar() == null || aluno.getDocMilitar().trim().isEmpty()) {
                resultado.put("docMilitar", "infome o documento militar correto ");
            }
        }

        if (aluno.getRg().trim().isEmpty()) {
            resultado.put("RG", "infome o RG ");
        }
        if (aluno.getSexo().trim().isEmpty()) {
            resultado.put("sexo", "infome o sexo");
        }
        BuscaPorDocumentos buscaDoc = new BuscaPorDocumentos();
        if (buscaDoc.buscaPorCPF(aluno.getCpf())) {
            resultado.put("CPF", "CPF já cadastrado ");
        }
        if (buscaDoc.buscaPorDocMilitar(aluno.getDocMilitar())) {
            resultado.put("docMilitar", "documento militar já cadastrado");
        }
        if (resultado.isEmpty()) {
            resultado.put("passou", "true");
        } else {
            resultado.put("passou", "false");
        }

        return resultado;
    }

}

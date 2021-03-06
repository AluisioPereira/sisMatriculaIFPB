/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.sisMatriculaIFPB.action;

import br.edu.ifpb.sisMatriculaIFPB.control.Control;
import br.edu.ifpb.sisMatriculaIFPB.entidades.Aluno;
import br.edu.ifpb.sisMatriculaIFPB.entidades.AlunoBeilder;
import br.edu.ifpb.sisMatriculaIFPB.model.CadastrarAlunoBo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author José
 */
public class AlunoCadastrar implements Action {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {
        try {
           
            Aluno aluno = montarAluno(req);
            CadastrarAlunoBo cadastrarAlunoBo = new CadastrarAlunoBo();
            Map<String, String> result = cadastrarAlunoBo.cadastrarAluno(aluno);
            req.setAttribute("result", result);
            if (result.get("passou").equalsIgnoreCase("true")) {
                req.getRequestDispatcher("AlertSucesso.jsp").forward(req, resp);
            } else {
                req.getRequestDispatcher("Erro.jsp").forward(req, resp);
            }
        }catch(Exception ex){
             Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Aluno montarAluno(HttpServletRequest req) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = req.getParameter("dataNascimento");
        LocalDate dataNacimento = null;
        String nome = req.getParameter("Nome");
        String sobreNome = req.getParameter("sobreNome");
        String sexo = req.getParameter("sexo");
        String nacionalidade = req.getParameter("nacionalidade");
        String rg = req.getParameter("rg");
        String cpf = req.getParameter("cpf");
         String reservista = req.getParameter("reservista");
        if (data != null && data != "") {
            dataNacimento = LocalDate.parse(data, dtf);
        }

        return new AlunoBeilder(nome, sobreNome, dataNacimento, nacionalidade, rg, cpf).comSexo(sexo).comDocMilitar(reservista).BeilderAluno();

    }

}

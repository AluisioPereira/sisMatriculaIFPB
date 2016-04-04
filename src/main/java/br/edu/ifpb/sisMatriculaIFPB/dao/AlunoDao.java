package br.edu.ifpb.sisMatriculaIFPB.dao;

import br.edu.ifpb.sisMatriculaIFPB.conexao.ConexaoIF;
import br.edu.ifpb.sisMatriculaIFPB.conexao.DataBaseException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.edu.ifpb.sisMatriculaIFPB.conexao.Conexao;
import br.edu.ifpb.sisMatriculaIFPB.entidades.Aluno;
import java.net.URISyntaxException;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author Aluísio
 */
public class AlunoDao implements AlunoDaoIf {

    private ConexaoIF conn;

    @Override
    public boolean add(Aluno aluno) {
        // certo
        boolean result = false;
        PreparedStatement stat = null;

        String sql = "INSERT INTO ALUNO (nome,sobreNome, dataNascimento, nacionalidade, rg, cpf, docMilitar,sexo)"
                + "VALUES(?, ?, ?, ?, ?, ?,?,?)";
        try {

            conn = new Conexao();
            stat = conn.getConnection().prepareStatement(sql);
            stat.setString(1, aluno.getNome());
            stat.setString(2, aluno.getSobreNome());
            stat.setDate(3, Date.valueOf(aluno.getDataNascimento()));
            stat.setString(4, aluno.getNacionalidade());
            stat.setString(5, aluno.getRg());
            stat.setString(6, aluno.getCpf());
            stat.setString(7, aluno.getDocMilitar());
            stat.setString(8, aluno.getSexo());
            if (stat.executeUpdate() > 0) {

                result = true;
            }

        } catch (SQLException | ClassNotFoundException | IOException | URISyntaxException ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                conn.closeAll(stat);
            } catch (DataBaseException ex) {
                Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return result;
    }

    @Override
    public boolean buscaPorCPF(String cpf) {

        String consulta = "SELECT cpf FROM aluno WHERE cpf = '" + cpf + "'";
        if (buscaDocExitente(consulta)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean buscaPorDocMilitar(String docMilitar) {
         String consulta = "SELECT docmilitar FROM aluno WHERE docmilitar = '" + docMilitar + "'";
        if (buscaDocExitente(consulta)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * método privado utilizado para verificar de se determinado documento esta
     * cadastrado
     *
     * @param sql
     * @return true se na base de dados
     */
    private boolean buscaDocExitente(String sql) {
        PreparedStatement pst;

        try {
            conn = new Conexao();
            pst = conn.getConnection().prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }

            conn.closeAll(pst);
        } catch (SQLException | IOException | ClassNotFoundException | URISyntaxException ex) {
            Logger.getLogger(AlunoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}

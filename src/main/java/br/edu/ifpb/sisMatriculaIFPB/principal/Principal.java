package br.edu.ifpb.sisMatriculaIFPB.principal;
import br.edu.ifpb.sisMatriculaIFPB.dao.AlunoDao;
import br.edu.ifpb.sisMatriculaIFPB.entidades.Aluno;
import br.edu.ifpb.sisMatriculaIFPB.entidades.AlunoBeilder;
import br.edu.ifpb.sisMatriculaIFPB.Enum.Sexo;
import br.edu.ifpb.sisMatriculaIFPB.model.CadastrarAlunoBo;
import br.edu.ifpb.sisMatriculaIFPB.model.ValidaCPF;
import br.edu.ifpb.sisMatriculaIFPB.model.ValidarAluno;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.Random;
/**
 *
 * @author Aluísio
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("deeee");
    LocalDate id = LocalDate.of(1991, Month.OCTOBER, 16);
    AlunoDao d = new AlunoDao();
       Aluno a ;
       String cpf ="444.565.901-06";
       
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         a= new  AlunoBeilder("jose", "ferreira", LocalDate.parse("31/03/1998", dtf), "br", "wessa", cpf).comSexo(Sexo.MASCULINO.name()).comDocMilitar("222").BeilderAluno();
        Map<String, String> rr = ValidarAluno.ValidarAluno(a);
       // System.err.println(" ===="+rr.toString());
        System.err.println(a.toString());
        CadastrarAlunoBo ca = new CadastrarAlunoBo();
       Map<String, String> dd = ca.cadastrarAluno(a);
       dd.remove("passou");
        System.err.println("cadas "+dd.values());
      //  Random f = new Random(22L);
       // System.err.println("dd "+f.nextInt(1000000));
        
            }          
}

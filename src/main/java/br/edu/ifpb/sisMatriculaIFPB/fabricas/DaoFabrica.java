package br.edu.ifpb.sisMatriculaIFPB.fabricas;

/**
 *
 * @author Aluísio
 */
public class DaoFabrica {

    public static final int DAO_BD = 0;

    public static final int LOCACAO = 0;

    public static DaoFabricaIf crearFabrica(int fabricaTipo) {
        if (fabricaTipo == DAO_BD) {
            return new DaoFabricaDB();

        }
        return null;
    }
}

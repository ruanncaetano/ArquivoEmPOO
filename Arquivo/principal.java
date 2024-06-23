package Arquivo;

import java.util.List;

public class principal {
    public static void main(String[] arg)
    {
        String local = "ruas.txt"; // poderia ser uma entrada do usuario com o caminho do tipo D:\\

        Leitura ler= new Leitura();
        List<CEPs> ListaDeCEPs = ler.LerArq(local);
        // aqui esta criando uma lista com <diamante> do tipo CEPs e armazenando os dados do .TXT

        for(CEPs dados : ListaDeCEPs)
        {
            dados.mostra();
        }
    }
}

package Arquivo;

import POO.CodigoPostal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Leitura
{
    public List<CEPs> LerArq(String Caminho)
    {
        List<CEPs> Lista = new ArrayList<>();
        BufferedReader ler=null;
        try {
            FileReader fr = new FileReader("ruas.txt");
            ler= new BufferedReader(fr);
            String Linha;

            while ((Linha = ler.readLine()) != null)
            {
                String[] partes= Linha.split(";");
                if(partes.length==3)
                {
                    // aqui ele esta convertendo os numeros que estão como String em INT, olha que legal
                    int i = Integer.parseInt(partes[0]);
                    int e = Integer.parseInt(partes[1]);
                    String r= partes[2]; // coloquei só pra deixar mais padrão

                    // chamando contrutor da classe CEPs
                    CEPs cod = new CEPs(i,e,r);
                    // add dados na lista
                    Lista.add(cod);
                }
            }
            if (ler != null) {ler.close();}

        } catch (IOException e)
        {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return Lista;
    }
}

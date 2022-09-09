package PaftPucPR.Aulas.Java.Aula_5.Sistema_Loja;

import java.io.*;
import java.util.*;

public class Login {

    Scanner in = new Scanner(System.in);

    public void adicionarUsuário(){
        System.out.println("Digite o CPF:");
        String cpf = in.next();
        System.out.println("Digite a senha:");
        String senha = in.next();

        try{
            FileWriter FW = new FileWriter("PaftPucPR\\Aulas\\Java\\Aula_5\\Sistema_Loja\\dados.txt", true);

            FW.write("Login: " + cpf + " | Senha: " + senha + "\n");
            System.out.println("Ok");
            FW.close();
        } catch (Exception e) {System.out.println("Erro");}
    }


    public void excluirUsuário(String cpf){
        try {
            List<String> manter = new ArrayList<>();

            File dados = new File("PaftPucPR\\Aulas\\Java\\Aula_5\\Sistema_Loja\\dados.txt");

            FileWriter FW1 = new FileWriter(dados, true);
            BufferedWriter BW = new 
            FileReader FR = new FileReader(dados);
            BufferedReader BR = new BufferedReader(FR);

            String linha = BR.readLine();
            while(linha != null){
                if(linha.contains(" " + cpf + " ")){System.out.println("Tem");}
                else{
                    manter.add(linha);
                }
                linha = BR.readLine();
            }
            BR.close();
            FR.close();

            FW1.close();

            FileWriter FW2 = new FileWriter(dados, true);
            for(int i = 0; i < manter.size(); i++){
                FW2.write(manter.get(i) + "\n");
            }
            FW2.close();

        } catch (Exception e) {System.out.println("Erro");}
    }


    public void lerUsuários(){
        try {
            FileReader FR = new FileReader("PaftPucPR\\Aulas\\Java\\Aula_5\\Sistema_Loja\\dados.txt");
            BufferedReader BR = new BufferedReader(FR);

            String linha = BR.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = BR.readLine();
            }
            BR.close();

        } catch (Exception e) {System.out.println("Erro");}
    }
}

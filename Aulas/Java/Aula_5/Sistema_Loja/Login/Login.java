package PaftPucPR.Aulas.Java.Aula_5.Sistema_Loja.Login;

import java.io.*;
import java.util.*;

public class Login {
    Scanner in = new Scanner(System.in);

    public void adicionarUsuário(String NOME, String CPF, String SENHA){

        try{
            FileWriter FW = new FileWriter("PaftPucPR\\Aulas\\Java\\Aula_5\\Sistema_Loja\\Login\\dados.txt", true);

            FW.write("Login: " + CPF + " | Senha: " + SENHA + " | Nome: " + NOME + " \n");
            FW.close();
        } catch (Exception e) {System.out.println("Erro");}
    }


    public void excluirUsuário(String cpf){
        try {
            List<String> manter = new ArrayList<>();

            File dados = new File("PaftPucPR\\Aulas\\Java\\Aula_5\\Sistema_Loja\\Login\\dados.txt");

            FileReader FR = new FileReader(dados);
            BufferedReader BR = new BufferedReader(FR);

            String linha = BR.readLine();
            while(linha != null){
                if(linha.contains("Login: " + cpf)){System.out.println("Tem");}
                else{
                    manter.add(linha);
                }
                linha = BR.readLine();
            }
            BR.close();
            FR.close();

            FileWriter FW1 = new FileWriter(dados);
            BufferedWriter BW1 = new BufferedWriter(FW1);
            BW1.close();
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

    public boolean verificarUsuário(String CPF){
        try {
            FileReader FR = new FileReader("PaftPucPR\\Aulas\\Java\\Aula_5\\Sistema_Loja\\Login\\dados.txt");
            BufferedReader BR = new BufferedReader(FR);

            String linha = BR.readLine();
            while(linha != null){
                if(linha.contains(String.format("Login: %s ", CPF))){
                    BR.close();
                    return true;
                }
                linha = BR.readLine();
            }
            BR.close();
        } catch (Exception e) {System.out.println("Erro");}
        return false;
    }

    public boolean verificarSenha(String CPF, String Senha){
        try {
            FileReader FR = new FileReader("PaftPucPR\\Aulas\\Java\\Aula_5\\Sistema_Loja\\Login\\dados.txt");
            BufferedReader BR = new BufferedReader(FR);

            String linha = BR.readLine();
            while(linha != null){
                if(linha.contains(String.format("Login: %s | Senha: %s ", CPF, Senha))){
                    BR.close();
                    return true;
                }
                linha = BR.readLine();
            }
            BR.close();

        } catch (Exception e) {System.out.println("Erro");}
        return false;
    }
}

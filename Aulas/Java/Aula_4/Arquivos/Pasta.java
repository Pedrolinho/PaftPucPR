package PaftPucPR.Aulas.Java.Aula_4.Arquivos;

import java.util.ArrayList;
import java.util.List;

public class Pasta {
    // Atributos
    private String nome;
    private int tamanho;
    private List<Pasta> pastas = new ArrayList<>();
    private List<Arquivo> arquivos = new ArrayList<>();

    // Construtor
    public Pasta(String nome){
        this.nome = nome;
        this.pastas = getPastas();
        this.arquivos = getArquivos();
        this.tamanho = 0;
    }

    // Getters
    public String getNome() {
        return nome;
    }
    public int getTamanho() {
        return tamanho;
    }
    public List<Arquivo> getArquivos() {
        return arquivos;
    }
    public List<Pasta> getPastas() {
        return pastas;
    }

    // Métodos
    public void adicionarArquivo(String nome, String extensão, int tamanho){
        Arquivo x = new Arquivo(nome, extensão, tamanho);
        arquivos.add(x);
    }
    
    public void adicionarPasta(Pasta x, String nome){
        if(nome != null){
            Pasta z = new Pasta(nome);
            pastas.add(z);
            return;
        }
        pastas.add(x);
    }

    public void excluir(String nome, Boolean subpastas){ // Exclui arquivos
        int y = 0;
        for(Arquivo x : getArquivos()){
            if(x.getNome() == nome){
                getArquivos().remove(y);
            }
            y++;
        }

        if(subpastas == true){
            int pastaIndex = 0;
            for(Pasta x: getPastas()){
                int arquivoIndex = 0;
                for(Arquivo z : x.getArquivos()){
                    if(z.getNome() == nome){
                        this.getPastas().get(pastaIndex).getArquivos().remove(arquivoIndex);
                        return;
                    }
                    arquivoIndex++;
                }
                pastaIndex++;
            }
        }
    }

    public void tamanho(){ // Mostra tamanho dos arquivos presentes na pasta, excluindo subpastas
        int tamanho = 0;
        for(Arquivo x: arquivos){
            tamanho += x.getTamanho();
        }
        System.out.println("Tamanho Total: " + tamanho + "B");
    }
    
    public void tamanhoTotal(){ // Mostra tamanho dos arquivos presentes na pasta, incluindo subpastas
        int tamanhoTotal = 0;
        for(Arquivo x: arquivos){
            tamanhoTotal += x.getTamanho();
        }
        for(Pasta x: pastas){
            for(Arquivo y: x.getArquivos()){
                tamanhoTotal += y.getTamanho(); 
            }
        }
        System.out.println("Tamanho Total: " + tamanhoTotal + "B");
    }

    public String toString() {
        return nome;
    }
}

package PaftPucPR.Aulas.Java.Aula_4.Arquivos;

public class Sistema {
    public static void main(String[] args) {
        // Pasta 1 - fotos
        Pasta pasta1 = new Pasta("fotos");

        pasta1.adicionarArquivo("Sir Gallahad", "png", 1024);
        pasta1.adicionarArquivo("Goblin", "png", 1024);
        pasta1.adicionarArquivo("Battle Interface", "jpeg", 1024);

        System.out.println(pasta1.getNome());
        for(Arquivo x : pasta1.getArquivos()){
            System.out.println(x);
        }
        System.out.println();
        pasta1.tamanho();
        System.out.println("=================================================");


        // Pasta 2 - códigos
        Pasta pasta2 = new Pasta("códigos");

        pasta2.adicionarArquivo("LifePotion", "java", 4096);
        pasta2.adicionarArquivo("DiceRoll", "java", 4096);
        pasta2.adicionarArquivo("Char", "java", 4096);

        System.out.println(pasta2.getNome());
        for(Arquivo x : pasta2.getArquivos()){
            System.out.println(x);
        }
        System.out.println();
        pasta2.tamanho();
        System.out.println("=================================================");


        // Pasta 3 - contém as pastas fotos, códigos e músicas
        Pasta pasta3 = new Pasta("RPG");
        pasta3.adicionarPasta(pasta1, null);    
        pasta3.adicionarPasta(pasta2, null);        

        pasta3.adicionarPasta(null, "Músicas");
        pasta3.getPastas().get(2).adicionarArquivo("Attack", "mp3", 10240);

        pasta3.adicionarArquivo("RPG", "java", 8192);
        pasta3.adicionarArquivo("Batalha", "java", 8192);

        System.out.println(pasta3.getNome());
        for(Arquivo x : pasta3.getArquivos()){
            System.out.println(x);
        }
        for(Pasta x : pasta3.getPastas()){
            System.out.println("> " + x);
            for(Arquivo y : x.getArquivos()){
                System.out.println(y);
            }
        }
        System.out.println();
        pasta3.tamanhoTotal();

        // Pasta 3 - remove arquivo RPG
        System.out.println("=================================================");

        System.out.println(pasta3 + " - Arquivos");
        pasta3.excluir("RPG", false);
        for(Arquivo x : pasta3.getArquivos()){
            System.out.println(x);
        }
        System.out.println();
        pasta3.tamanho();

        // Pasta 3 - remove arquivo LifePotion (subpasta)
        System.out.println("=================================================");
        pasta3.excluir("Char", true);

        System.out.println(pasta3.getPastas().get(1));
        for(Arquivo x : pasta3.getPastas().get(1).getArquivos()){
            System.out.println(x);
        }
        System.out.println();
        pasta3.getPastas().get(1).tamanho();
    }
}

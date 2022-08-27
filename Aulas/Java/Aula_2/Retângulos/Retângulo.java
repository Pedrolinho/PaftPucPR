package PaftPucPR.Aulas.Java.Aula_2.Retângulos;

public class Retângulo {
    double altura;
    double largura;
    double área;

    double perímetro(){
        return (largura + altura) * 2;
    }
    
    double área(){
        return largura * altura;
    }
}

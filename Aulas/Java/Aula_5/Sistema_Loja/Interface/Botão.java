package PaftPucPR.Aulas.Java.Aula_5.Sistema_Loja.Interface;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Botão {
    private JButton botão;
    private String imagepath;
    private int posx;
    private int posy;
    private int scalex;
    private int scaley;

    public Botão(String imagePath, int posX, int posY, int scaleX, int scaleY) {
        this.botão = new JButton();
        this.imagepath = imagePath;
        this.posx = posX;
        this.posy = posY;
        this.scalex = scaleX;
        this.scaley = scaleY;

        // Muda o cursor do mouse
        botão.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        // Configurações para deixar o botão representado apenas pela imagem definida 
        botão.setOpaque(false);
        botão.setFocusPainted(false);
        botão.setBorderPainted(false);
        botão.setContentAreaFilled(false);
        
        // Define a imagem do botão
        botão.setIcon(new ImageIcon(this.imagepath)); 

        // Configura a posição e escala do botão
        botão.setBounds(posx, posy, scalex, scaley);
    }

    public JButton getBotão() {
        return botão;
    }
}

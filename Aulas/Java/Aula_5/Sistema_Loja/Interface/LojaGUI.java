package PaftPucPR.Aulas.Java.Aula_5.Sistema_Loja.Interface;

import PaftPucPR.Aulas.Java.Aula_5.Sistema_Loja.Interface.Images.Images;
import PaftPucPR.Aulas.Java.Aula_5.Sistema_Loja.Login.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;

public class LojaGUI extends JFrame {

    Images imagens = new Images();

    public LojaGUI() {
        // Título da janela
        setTitle("Sistema Loja");

        // Tamanho da janela e config. não redimensionável
        setSize(390, 720);
        setResizable(false);
        setUndecorated(true);

        // Inicia a janela ao centro da tela
        setLocationRelativeTo(null);

        // Torna a janela visível
        setVisible(true);     

        // Inicializa os componentes
        splashScreen();
        iniciar();
    }

    // Telas
    private void splashScreen() {
        JLabel splashscreen = new JLabel();

        splashscreen.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface/Images/Splashscreen.png"));
        add(splashscreen);
        splashscreen.setBounds(0, 0, 390, 720);

        try { Thread.sleep (2000); } catch (InterruptedException ex) {}

        splashscreen.setVisible(false);
    }

    public void iniciar() {
        // Label principal
        JLabel iniciar = new JLabel();

        // Botões atribuitos ao label principal
        JButton fechar = new JButton();

        // Botão Iniciar Sessão
        Botão iniciarsessão = new Botão(imagens.getIniciarSessão(), 31, 472, 328, 60);

        iniciarsessão.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iniciarSessãoMouseReleased(evt, iniciar);
            }
        });
        iniciar.add(iniciarsessão.getBotão());

        // Botão Criar Conta
        Botão criarconta = new Botão(imagens.getCriarConta(), 31, 545, 328, 60);
        criarconta.getBotão().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                criarConta1MouseReleased(evt, iniciar);
            }
        });
        iniciar.add(criarconta.getBotão());

        // Botão Fechar Sistema
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fecharMouseReleased(evt);
            }
        });
        fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fechar.setBackground(new java.awt.Color(253, 178, 146));
        fechar.setFocusPainted(false);
        fechar.setBorderPainted(false);
        fechar.setContentAreaFilled(false);
        fechar.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Fechar.png"));
        fechar.setBorder(null);
        iniciar.add(fechar);
        fechar.setBounds(345, 30, 17, 17);

        iniciar.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Iniciar.png"));
        add(iniciar);
        iniciar.setBounds(0, 0, 390, 720);


        pack();
    }

    public void iniciarSessão(JLabel iniciar) {
        iniciar.setVisible(false);

        JLabel iniciarsessão = new JLabel();

        JTextField CPF = new JTextField("CPF");
        JTextField SENHA = new JTextField("Senha");
        JTextField menssagem = new JTextField("");

        JButton fechar = new JButton();
        JButton voltar = new JButton();
        JButton logar = new JButton();
        JButton criarconta = new JButton();

        // Campo de texto CPF
        iniciarsessão.add(CPF);
        CPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMouseReleased(evt, CPF);
            }
        });
        CPF.setBounds(54, 267, 282, 17);      
        CPF.setFont(new Font("Roboto", 0, 14));
        CPF.setForeground(new Color(126,126,126));
        CPF.setBackground(new Color(210,210,210));
        CPF.setBorder(null);

        // Campo de texto Senha
        iniciarsessão.add(SENHA);
        SENHA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMouseReleased(evt, SENHA);
            }
        });
        SENHA.setBounds(54, 348, 282, 17);      
        SENHA.setFont(new Font("Roboto", 0, 14));
        SENHA.setForeground(new Color(126,126,126));
        SENHA.setBackground(new Color(210,210,210));
        SENHA.setBorder(null);

        // Campo de texto login
        iniciarsessão.add(menssagem);
        menssagem.setBounds(129, 427, 133, 13);      
        menssagem.setFont(new Font("Roboto", 0, 10));
        menssagem.setForeground(new Color(126,126,126));
        menssagem.setBackground(new Color(168,188,189));
        menssagem.setBorder(null);

        // Botão fechar
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fecharMouseReleased(evt);
            }
        });
        fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fechar.setBackground(new java.awt.Color(253, 178, 146));
        fechar.setFocusPainted(false);
        fechar.setBorderPainted(false);
        fechar.setContentAreaFilled(false);
        fechar.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Fechar.png"));
        fechar.setBorder(null);
        iniciarsessão.add(fechar);
        fechar.setBounds(345, 30, 17, 17);

        // Botão voltar
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                voltarMouseReleased(evt, iniciarsessão, iniciar);
            }
        });
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.setBackground(new java.awt.Color(253, 178, 146));
        voltar.setFocusPainted(false);
        voltar.setBorderPainted(false);
        voltar.setContentAreaFilled(false);
        voltar.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Voltar.png"));
        voltar.setBorder(null);
        iniciarsessão.add(voltar);
        voltar.setBounds(30, 30, 8, 15);

        // Botão logar
        logar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logarMouseReleased(evt, iniciarsessão, CPF, SENHA, menssagem);
            }
        });
        logar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logar.setBackground(new java.awt.Color(253, 178, 146));
        logar.setFocusPainted(false);
        logar.setBorderPainted(false);
        logar.setContentAreaFilled(false);
        logar.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Seguir.png"));
        logar.setBorder(null);
        iniciarsessão.add(logar);
        logar.setBounds(145, 482, 100, 100);

        // Botão criar conta
        criarconta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                criarConta1MouseReleased(evt, iniciarsessão);
            }
        });
        criarconta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        criarconta.setBackground(new java.awt.Color(253, 178, 146));
        criarconta.setFocusPainted(false);
        criarconta.setBorderPainted(false);
        criarconta.setContentAreaFilled(false);
        criarconta.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Criar Conta String.png"));
        criarconta.setBorder(null);
        iniciarsessão.add(criarconta);
        criarconta.setBounds(154, 631, 82, 15);

        iniciarsessão.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Iniciar Sessão.png"));
        add(iniciarsessão);
        iniciarsessão.setBounds(0, 0, 390, 720);

        pack();
    }

    public void criarConta1(JLabel iniciar) {
        iniciar.setVisible(false);

        JLabel criarConta1 = new JLabel();

        JTextField NOME = new JTextField("NOME");
        JTextField CPF = new JTextField("CPF");

        JButton fechar = new JButton();
        JButton voltar = new JButton();
        JButton seguir = new JButton();

        // Campo de texto Nome
        criarConta1.add(NOME);
        NOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMouseReleased(evt, NOME);
            }
        });
        NOME.setBounds(54, 267, 282, 17);      
        NOME.setFont(new Font("Roboto", 0, 14));
        NOME.setForeground(new Color(126,126,126));
        NOME.setBackground(new Color(210,210,210));
        NOME.setBorder(null);

        // Campo de texto CPF
        criarConta1.add(CPF);
        CPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMouseReleased(evt, CPF);
            }
        });
        CPF.setBounds(54, 348, 282, 17);      
        CPF.setFont(new Font("Roboto", 0, 14));
        CPF.setForeground(new Color(126,126,126));
        CPF.setBackground(new Color(210,210,210));
        CPF.setBorder(null);

        // Botão fechar
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fecharMouseReleased(evt);
            }
        });
        fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fechar.setBackground(new java.awt.Color(253, 178, 146));
        fechar.setFocusPainted(false);
        fechar.setBorderPainted(false);
        fechar.setContentAreaFilled(false);
        fechar.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Fechar.png"));
        fechar.setBorder(null);
        criarConta1.add(fechar);
        fechar.setBounds(345, 30, 17, 17);

        // Botão voltar
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                voltarMouseReleased(evt, criarConta1, iniciar);
            }
        });
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.setBackground(new java.awt.Color(253, 178, 146));
        voltar.setFocusPainted(false);
        voltar.setBorderPainted(false);
        voltar.setContentAreaFilled(false);
        voltar.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Voltar.png"));
        voltar.setBorder(null);
        criarConta1.add(voltar);
        voltar.setBounds(30, 30, 8, 15);

        // Botão seguir
        seguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                criarConta2MouseReleased(evt, criarConta1, NOME.getText(), CPF.getText());
            }
        });
        seguir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seguir.setBackground(new java.awt.Color(253, 178, 146));
        seguir.setFocusPainted(false);
        seguir.setBorderPainted(false);
        seguir.setContentAreaFilled(false);
        seguir.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Seguir.png"));
        seguir.setBorder(null);
        criarConta1.add(seguir);
        seguir.setBounds(145, 482, 100, 100);

        criarConta1.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Cadastro1.png"));
        add(criarConta1);
        criarConta1.setBounds(0, 0, 390, 720);

        pack();
    }

    public void criarConta2(JLabel criarConta1, String NOME, String CPF) {
        criarConta1.setVisible(false);

        JLabel criarConta2 = new JLabel();

        JPasswordField Senha1 = new JPasswordField("DIGITE A SENHA");
        JPasswordField Senha2 = new JPasswordField("CONFIRME A SENHA");

        JButton fechar = new JButton();
        JButton voltar = new JButton();
        JButton mostrar1 = new JButton();
        JButton mostrar2 = new JButton();
        JButton seguir = new JButton();

        // Campo de texto digitar senha
        criarConta2.add(Senha1);
        Senha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordMouseReleased(evt, Senha1);
            }
        });
        Senha1.setBounds(54, 267, 232, 17);      
        Senha1.setFont(new Font("Roboto", 0, 14));
        Senha1.setForeground(new Color(126,126,126));
        Senha1.setBackground(new Color(210,210,210));
        Senha1.setBorder(null);
        Senha1.setEchoChar((char) 0);

        // Campo de texto confirmar senha
        criarConta2.add(Senha2);
        Senha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordMouseReleased(evt, Senha2);
            }
        });
        Senha2.setBounds(54, 348, 232, 17);      
        Senha2.setFont(new Font("Roboto", 0, 14));
        Senha2.setForeground(new Color(126,126,126));
        Senha2.setBackground(new Color(210,210,210));
        Senha2.setBorder(null);
        Senha2.setEchoChar((char) 0);

        // Botão fechar
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fecharMouseReleased(evt);
            }
        });
        fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fechar.setBackground(new java.awt.Color(253, 178, 146));
        fechar.setFocusPainted(false);
        fechar.setBorderPainted(false);
        fechar.setContentAreaFilled(false);
        fechar.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Fechar.png"));
        fechar.setBorder(null);
        criarConta2.add(fechar);
        fechar.setBounds(345, 30, 17, 17);

        // Botão voltar
        voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                voltarMouseReleased(evt, criarConta2, criarConta1);
            }
        });
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.setBackground(new java.awt.Color(253, 178, 146));
        voltar.setFocusPainted(false);
        voltar.setBorderPainted(false);
        voltar.setContentAreaFilled(false);
        voltar.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Voltar.png"));
        voltar.setBorder(null);
        criarConta2.add(voltar);
        voltar.setBounds(30, 30, 8, 15);

        mostrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarSenhaMouseEntered(evt, Senha1);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                esconderSenhaMouseExited(evt, Senha1);
            }
        });

        // Mostrar senha
        mostrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        mostrar1.setOpaque(false);
        //mostrar1.setBackground(new java.awt.Color(253, 178, 146));
        mostrar1.setFocusPainted(false);
        mostrar1.setBorderPainted(false);
        mostrar1.setContentAreaFilled(false);
        mostrar1.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Mostrar Senha.png"));
        mostrar1.setBorder(null);
        criarConta2.add(mostrar1);
        mostrar1.setBounds(304, 264, 36, 20);

        mostrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarSenhaMouseEntered(evt, Senha2);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                esconderSenhaMouseExited(evt, Senha2);
            }
        });
        
        mostrar2.setOpaque(false);
        //mostrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrar2.setBackground(new java.awt.Color(253, 178, 146));
        mostrar2.setFocusPainted(false);
        mostrar2.setBorderPainted(false);
        mostrar2.setContentAreaFilled(false);
        mostrar2.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Mostrar Senha.png"));
        mostrar2.setBorder(null);
        criarConta2.add(mostrar2);
        mostrar2.setBounds(304, 345, 36, 20);

        // Botão seguir
        seguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cadastrarMouseReleased(evt, NOME, CPF, String.valueOf(Senha1.getPassword()));
            }
        });
        seguir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seguir.setBackground(new java.awt.Color(253, 178, 146));
        seguir.setFocusPainted(false);
        seguir.setBorderPainted(false);
        seguir.setContentAreaFilled(false);
        seguir.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Button Seguir.png"));
        seguir.setBorder(null);
        criarConta2.add(seguir);
        seguir.setBounds(145, 482, 100, 100);

        criarConta2.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Cadastro2.png"));
        add(criarConta2);
        criarConta2.setBounds(0, 0, 390, 720);

        pack();
    }
    
    public void menuPrincipal(JLabel iniciarsessão){
        iniciarsessão.setVisible(false);

        JLabel menuprincipal = new JLabel();
        menuprincipal.setIcon(new ImageIcon("PaftPucPR/Aulas/Java/Aula_5/Sistema_Loja/Interface//Images/Menu Principal.png"));
        add(menuprincipal);
        menuprincipal.setBounds(0, 0, 390, 720);

        pack();
        
    }
    
    // Ações
    private void iniciarSessãoMouseReleased(java.awt.event.MouseEvent evt, JLabel iniciar) {
        iniciarSessão(iniciar);
    } 

    private void criarConta1MouseReleased(java.awt.event.MouseEvent evt, JLabel iniciar) {
        criarConta1(iniciar);
    } 

    private void criarConta2MouseReleased(java.awt.event.MouseEvent evt, JLabel iniciar, String NOME, String CPF) { 
        Verificador verificador = new Verificador(NOME, CPF);
        if(verificador.verificarNome()){
            if(verificador.verificarCPF()){
                criarConta2(iniciar, NOME, CPF);     
            }
            else{
                System.out.println("Nome inválido");
            }
               
        }
        else{
            System.out.println("CPF inválido");
        }
        
    } 

    private void fecharMouseReleased(java.awt.event.MouseEvent evt) {                                     
        System.exit(0);
    }

    private void logarMouseReleased(java.awt.event.MouseEvent evt, JLabel iniciarsessão, JTextField CPF, JTextField SENHA, JTextField menssagem) {   
        Login login = new Login();

        String cpf = CPF.getText();
        String senha = SENHA.getText();
        String login_menssagem = "";

        if(login.verificarUsuário(cpf) == false){
            login_menssagem += "USUÁRIO NÃO ENCONTRADO";
            
            menssagem.setBounds(122, 427, 147, 13);  
            menssagem.setText(login_menssagem);
            menssagem.setForeground(new Color(255,51,51));
            return;
        }
        if(login.verificarSenha(cpf, senha) == false){
            login_menssagem += "SENHA INCORRETA";
            menssagem.setText(login_menssagem);
            menssagem.setBounds(146, 427, 102, 13);
            menssagem.setForeground(new Color(255,51,51));
            return;
        }
        if(login_menssagem == ""){
            try { Thread.sleep (1500); } catch (InterruptedException ex) {}
            menuPrincipal(iniciarsessão);
        }
    }

    private void textMouseReleased(java.awt.event.MouseEvent evt, JTextField x) { 
        x.setText("");     
    }

    private void passwordMouseReleased(java.awt.event.MouseEvent evt, JPasswordField x) {
        x.setEchoChar('*');
        x.setText("");
    }

    private void mostrarSenhaMouseEntered(java.awt.event.MouseEvent evt, JPasswordField x) {
        x.setEchoChar((char) 0);
    }

    private void esconderSenhaMouseExited(java.awt.event.MouseEvent evt, JPasswordField x) {
        x.setEchoChar('*');
    }

    private void cadastrarMouseReleased(java.awt.event.MouseEvent evt, String NOME, String CPF, String SENHA) {
        Login login = new Login();
        login.adicionarUsuário(NOME, CPF, SENHA);
    }

    private void voltarMouseReleased(java.awt.event.MouseEvent evt, JLabel current, JLabel back) {                                     
        current.setVisible(false);
        back.setVisible(true);
    }

    public static void main(String[] args) {
        new LojaGUI();
    }
}

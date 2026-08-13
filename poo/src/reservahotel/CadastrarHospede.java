package reservahotel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastrarHospede extends JFrame{
    private JTextField txtNome;
    private JTextField txtEmail;
    private JLabel jlNome;
    private JLabel jlEmail;
    private JButton btnCadastro;
    private JPanel painelPrincipal;
    private JPanel painelCadastro;

    public CadastrarHospede(){
        //inicilizar Janela
        setTitle("Cadastrar Hóspede");
        setSize(550,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //definir o painel principal
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout(10,10));

        //area de cadastro
        painelCadastro = new JPanel();
        painelCadastro.setLayout(new GridLayout(3, 2,10,10));

        jlNome = new JLabel("Nome");
        txtNome = new JTextField();
        jlEmail = new JLabel("Email");
        txtEmail = new JTextField();

        btnCadastro = new JButton("Cadastrar");
        painelCadastro.add(jlNome);
        painelCadastro.add(txtNome);
        painelCadastro.add(jlEmail);
        painelCadastro.add(txtEmail);
        painelCadastro.add(btnCadastro);

        painelPrincipal.add(painelCadastro);

        //adicionando no JFrame
        add(painelPrincipal);

        //adiciona evento ao botao
        btnCadastro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
            
        });



        setVisible(true);
    }

    
    public void cadastrar(){
        Hospede hospede = new Hospede();
        hospede.setNome(txtNome.getText());
        hospede.setEmail(txtEmail.getText());
        
    }



}

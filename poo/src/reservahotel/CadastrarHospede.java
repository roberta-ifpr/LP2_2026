package reservahotel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
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
    private JPanel painelTopo;

    public CadastrarHospede(){
        //inicilizar Janela
        setTitle("Cadastrar Hóspede");
        setSize(550,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //definir o painel principal
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BorderLayout(10,10));

        painelTopo = new JPanel();
        painelTopo.setLayout(new FlowLayout(FlowLayout.LEFT));


        //area de cadastro
        painelCadastro = new JPanel();
        painelCadastro.setLayout(new GridLayout(3, 2,10,10));

        painelCadastro.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

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

        painelTopo.add(painelCadastro);
        painelPrincipal.add(painelTopo,BorderLayout.NORTH);

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

        limparTela();
    }

    public void limparTela(){
        txtNome.setText("");
        txtEmail.setText("");
    }



}

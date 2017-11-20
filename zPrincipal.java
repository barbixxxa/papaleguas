package p;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JToolBar;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import org.omg.PortableServer.IdAssignmentPolicy;

import java.awt.Component;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

import java.util.Scanner;
import p.Cpf;
import p.Cliente;
import p.IdentificadorConta;
import p.MovimentoConta;
import p.ContaMilhagem;
import p.RepositorioContaMilhagem;
import p.RepositorioMovimentoConta;
import p.RepositorioCliente;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Principal extends JFrame {

	
	int x;
	RepositorioCliente r = new RepositorioCliente();
	
	Cpf cPf,novoCPf;
	String cpf,nome,novoNome,novoCpf;
	int idade,sexo,novaIdade,novoSexo;
	float renda,novaRenda;
	Cliente c,k;
	
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCpf;
	private JTextField textFieldIdade;
	private JTextField textFieldRenda;
	private JTextField textFieldStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, "name_16075812194851");
		
		JPanel Cliente = new JPanel();
		tabbedPane.addTab("Cliente", null, Cliente, null);
		Cliente.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 649, 23);
		Cliente.add(menuBar);
		
		JMenu mnGerenciarCliente = new JMenu("Gerenciar");
		menuBar.add(mnGerenciarCliente);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				}
		});
		mnGerenciarCliente.add(mntmCadastrar);
		
		JMenuItem mntmDescadastrar = new JMenuItem("Descadastrar");
		mnGerenciarCliente.add(mntmDescadastrar);
		
		JMenuItem mntmAtualizar = new JMenuItem("Atualizar");
		mnGerenciarCliente.add(mntmAtualizar);
		
		JMenu mnRelatorios = new JMenu("Relatorios");
		menuBar.add(mnRelatorios);
		
		JMenuItem mntmListarTodos = new JMenuItem("Listar Todos");
		mnRelatorios.add(mntmListarTodos);
		
		JPanel panelCliente = new JPanel();
		panelCliente.setBounds(0, 23, 649, 374);
		Cliente.add(panelCliente);
		panelCliente.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 83, 46, 14);
		panelCliente.add(lblNome);
		
		JLabel lblCpf = new JLabel("Cpf");
		lblCpf.setBounds(10, 11, 46, 14);
		panelCliente.add(lblCpf);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 115, 46, 14);
		panelCliente.add(lblIdade);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(10, 147, 46, 14);
		panelCliente.add(lblSexo);
		
		textFieldNome = new JTextField();
		textFieldNome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				
				nome = textFieldNome.getText();
				
			}
		});
		textFieldNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
								
			}
		});
		textFieldNome.setBounds(84, 80, 86, 20);
		panelCliente.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldCpf = new JTextField();
		textFieldCpf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				
			}
		});
		textFieldCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		textFieldCpf.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent arg0) {
			}
			public void inputMethodTextChanged(InputMethodEvent arg0) {
					
					
			}
		});
		textFieldCpf.setBounds(84, 8, 86, 20);
		panelCliente.add(textFieldCpf);
		textFieldCpf.setColumns(10);
		
		textFieldIdade = new JTextField();
		textFieldIdade.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				
				idade = Integer.parseInt(textFieldIdade.getText());
				
			}
		});
		textFieldIdade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		textFieldIdade.setBounds(84, 112, 86, 20);
		panelCliente.add(textFieldIdade);
		textFieldIdade.setColumns(10);
		
		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sexo = comboBoxSexo.getSelectedIndex();
			}
		});
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"", "Masculino", "Feminino"}));
		comboBoxSexo.setBounds(84, 143, 86, 22);
		panelCliente.add(comboBoxSexo);
		
		JLabel lblRenda = new JLabel("Renda");
		lblRenda.setBounds(10, 179, 46, 14);
		panelCliente.add(lblRenda);
		
		textFieldRenda = new JTextField();
		textFieldRenda.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				
				renda = Integer.parseInt(textFieldRenda.getText());
				
			}
		});
		textFieldRenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
								
			}
		});
		textFieldRenda.setBounds(84, 176, 86, 20);
		panelCliente.add(textFieldRenda);
		textFieldRenda.setColumns(10);
		
		textFieldStatus = new JTextField();
		textFieldStatus.setEditable(false);
		textFieldStatus.setBounds(287, 39, 91, 20);
		panelCliente.add(textFieldStatus);
		textFieldStatus.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (textFieldCpf.getText().length() == 11) {
					cPf = new Cpf(textFieldCpf.getText());	
					c = r.buscar(cPf);
					if (c == null) {
						textFieldStatus.setText("Nao Cadastrado");
					}else {
						textFieldStatus.setText("Cliente Ativo");							//TODO fazer verificação se cliente ativo ou inativo
						textFieldNome.setText(r.buscar(cPf).getNome()); 					//preenche o componente do nome
						textFieldIdade.setText(String.valueOf(r.buscar(cPf).getIdade()));	//preenche o componente da idade
						textFieldRenda.setText(String.valueOf(r.buscar(cPf).getRenda()));	//preenche o componente da renda
						comboBoxSexo.setSelectedIndex(r.buscar(cPf).getSexo());				//preenche o componente do sexo
						
					}
				}
				
			}
		});
		btnBuscar.setBounds(287, 7, 91, 23);
		panelCliente.add(btnBuscar);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				k = new Cliente(cPf, nome, renda, idade, sexo);
				r.incluir(k);
				textFieldStatus.setText("OK");
				textFieldCpf.setText(null);
				textFieldIdade.setText(null);
				textFieldNome.setText(null);
				textFieldRenda.setText(null);
				comboBoxSexo.setSelectedIndex(-1);
				
			}
		});
		btnIncluir.setBounds(10, 313, 91, 23);
		panelCliente.add(btnIncluir);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				r.excluir(cPf);
			}
		});
		btnExcluir.setBounds(287, 313, 91, 23);
		panelCliente.add(btnExcluir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(154, 313, 91, 23);
		panelCliente.add(btnAlterar);
		
		JPanel Contas = new JPanel();
		tabbedPane.addTab("Contas", null, Contas, null);
		Contas.setLayout(null);
		
		JPanel Movimentações = new JPanel();
		tabbedPane.addTab("Movimenta\u00E7\u00F5es", null, Movimentações, null);
		Movimentações.setLayout(null);
	}
}

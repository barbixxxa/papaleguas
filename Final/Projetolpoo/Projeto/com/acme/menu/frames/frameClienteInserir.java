package com.acme.menu.frames;

import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;

/**
 *
 * @author Theeam
 */
public class frameClienteInserir extends javax.swing.JFrame {

	public frameClienteInserir() {
		initComponents();
	}

	/**
	 * Declaracao dos atributos
	 */
	private int sexo, renda, idade;
	private String cpff, nome;
	private Cliente cliente;
	private Cpf cpf;

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		botaoGrupoSexo = new javax.swing.ButtonGroup();
		panelCliente = new javax.swing.JPanel();
		this.setLocation(400, 350);
		botaoMenu = new javax.swing.JButton();
		botaoOK = new javax.swing.JButton();
		labelCpf = new javax.swing.JLabel();
		labelNome = new javax.swing.JLabel();
		labelRenda = new javax.swing.JLabel();
		labelIdade = new javax.swing.JLabel();
		labelSexo = new javax.swing.JLabel();
		fieldCpf = new javax.swing.JTextField();
		fieldNome = new javax.swing.JTextField();
		fieldRenda = new javax.swing.JTextField();
		fieldIdade = new javax.swing.JTextField();
		rbuttonFeminino = new javax.swing.JRadioButton();
		rbuttonMasculino = new javax.swing.JRadioButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		textPaneMsg = new javax.swing.JTextPane();
		textPaneMsg.setEditable(false);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		panelCliente.setBackground(new java.awt.Color(51, 153, 255));
		panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Papaleguas Airlines",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 0, 12))); // NOI18N

		botaoMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		botaoMenu.setText("Menu");
		botaoMenu.setToolTipText("Menu");
		botaoMenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoMenuActionPerformed(evt);
			}
		});

		botaoOK.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		botaoOK.setText("OK");
		botaoOK.setToolTipText("Menu");
		botaoOK.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					botaoOKActionPerformed(evt);
				} catch (Exception e) {
					e.getMessage();
					textPaneMsg.setText("Dados Invalidos\n" + e);
					/**
					 * Joga o exception na caixa de msg
					 */

				}
			}
		});

		labelCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelCpf.setText("Cpf");

		labelNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelNome.setText("Nome");

		labelRenda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelRenda.setText("Renda");

		labelIdade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelIdade.setText("Idade");

		labelSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelSexo.setText("Sexo");

		botaoGrupoSexo.add(rbuttonFeminino);
		rbuttonFeminino.setText("Feminino");
		rbuttonFeminino.setActionCommand("feminino");
		rbuttonFeminino.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				rbuttonFemininoItemStateChanged(evt);
			}
		});

		botaoGrupoSexo.add(rbuttonMasculino);
		rbuttonMasculino.setText("Masculino");
		rbuttonMasculino.setActionCommand("masculino");
		rbuttonMasculino.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				rbuttonMasculinoItemStateChanged(evt);
			}
		});

		textPaneMsg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jScrollPane1.setViewportView(textPaneMsg);

		javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
		panelCliente.setLayout(panelClienteLayout);
		panelClienteLayout.setHorizontalGroup(panelClienteLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panelClienteLayout.createSequentialGroup().addGroup(panelClienteLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panelClienteLayout.createSequentialGroup().addGap(123, 123, 123)
										.addComponent(botaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 71,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(botaoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 71,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(panelClienteLayout.createSequentialGroup().addGap(82, 82, 82)
										.addComponent(labelIdade).addGap(18, 18, 18).addComponent(fieldIdade,
												javax.swing.GroupLayout.PREFERRED_SIZE, 140,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(panelClienteLayout.createSequentialGroup().addGap(76, 76, 76)
										.addGroup(panelClienteLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(labelNome).addComponent(labelCpf)
												.addComponent(labelRenda))
										.addGap(18, 18, 18)
										.addGroup(panelClienteLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(fieldCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 139,
														Short.MAX_VALUE)
												.addComponent(fieldNome).addComponent(fieldRenda)))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										panelClienteLayout.createSequentialGroup().addGap(86, 86, 86)
												.addComponent(labelSexo).addGap(18, 18, 18)
												.addComponent(rbuttonFeminino)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(rbuttonMasculino, javax.swing.GroupLayout.PREFERRED_SIZE,
														81, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(panelClienteLayout.createSequentialGroup().addGap(86, 86, 86).addComponent(
								jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250,
								javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(76, Short.MAX_VALUE)));
		panelClienteLayout.setVerticalGroup(panelClienteLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panelClienteLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelCpf).addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelNome).addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelRenda).addComponent(fieldRenda,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelIdade).addComponent(fieldIdade,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelSexo).addComponent(rbuttonFeminino).addComponent(rbuttonMasculino))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(botaoMenu).addComponent(botaoOK))
						.addGap(26, 26, 26)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panelCliente,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				panelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}

	/**
	 * Fecha a janela
	 * 
	 * @param evt
	 */
	private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {
		fieldCpf.setText("");
		fieldIdade.setText("");
		fieldNome.setText("");
		fieldRenda.setText("");
		rbuttonFeminino.setSelected(false);
		rbuttonMasculino.setSelected(false);
		textPaneMsg.setText("");
		
		this.dispose();
		
	}

	/**
	 * Inicializa as variaveis com os dados recebidos
	 * 
	 * Invoca o metodo incluir do Controlador
	 * 
	 * Imprimi mensagem de sucesso ou joga exception
	 * 
	 * @param evt
	 * @throws Exception
	 */
	private void botaoOKActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		idade = Integer.parseInt(fieldIdade.getText());
		cpff = fieldCpf.getText();
		nome = fieldNome.getText();
		renda = Integer.parseInt(fieldRenda.getText());
		cpf = new Cpf(cpff);
		cliente = new Cliente(cpf, nome, renda, idade, sexo);
		ControladorCliente.incluir(cliente);
		
		
		fieldCpf.setText("");
		fieldIdade.setText("");
		fieldNome.setText("");
		fieldRenda.setText("");
		rbuttonFeminino.setSelected(false);
		rbuttonMasculino.setSelected(false);
		
		textPaneMsg.setText("Cliente e Conta Inseridos com Sucesso!");
	}

	/**
	 * Caso esta opcao esteja selecionada inicializara o atributo sexo
	 * 
	 * @param evt
	 */
	private void rbuttonFemininoItemStateChanged(java.awt.event.ItemEvent evt) {
		if (rbuttonFeminino.isSelected()) {
			sexo = 2;
		}
	}

	private void rbuttonMasculinoItemStateChanged(java.awt.event.ItemEvent evt) {
		if (rbuttonMasculino.isSelected()) {
			sexo = 1;
		}
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(frameClienteInserir.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frameClienteInserir.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frameClienteInserir.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frameClienteInserir.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frameClienteInserir().setVisible(true);
			}
		});
	}

	private javax.swing.ButtonGroup botaoGrupoSexo;
	private javax.swing.JButton botaoMenu;
	private javax.swing.JButton botaoOK;
	private javax.swing.JTextField fieldCpf;
	private javax.swing.JTextField fieldIdade;
	private javax.swing.JTextField fieldNome;
	private javax.swing.JTextField fieldRenda;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel labelCpf;
	private javax.swing.JLabel labelIdade;
	private javax.swing.JLabel labelNome;
	private javax.swing.JLabel labelRenda;
	private javax.swing.JLabel labelSexo;
	private javax.swing.JPanel panelCliente;
	private javax.swing.JRadioButton rbuttonFeminino;
	private javax.swing.JRadioButton rbuttonMasculino;
	private javax.swing.JTextPane textPaneMsg;

}

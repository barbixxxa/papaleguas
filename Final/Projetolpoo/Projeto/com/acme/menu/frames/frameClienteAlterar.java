package com.acme.menu.frames;

import java.io.IOException;

import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;

/**
 *
 * @author Theeam
 */
public class frameClienteAlterar extends javax.swing.JFrame {

	public frameClienteAlterar() {
		initComponents();
	}

	private String cpff, cpffAntigo, nome;
	private Cpf cpf, cpfAntigo;
	private Cliente cliente;
	private double renda;
	private int sexo, idade;

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		panelCliente = new javax.swing.JPanel();
		this.setLocation(400, 350);
		jScrollPane1 = new javax.swing.JScrollPane();
		textPaneMsg = new javax.swing.JTextPane();
		textPaneMsg.setEditable(false);
		botaoMenu = new javax.swing.JButton();
		botaoOK = new javax.swing.JButton();
		labelCpfAntigo = new javax.swing.JLabel();
		labelCpf = new javax.swing.JLabel();
		labelCpfNovo = new javax.swing.JLabel();
		labelRenda = new javax.swing.JLabel();
		labelIdade = new javax.swing.JLabel();
		labelSexo = new javax.swing.JLabel();
		fieldIdade = new javax.swing.JTextField();
		fieldCpfNovo = new javax.swing.JTextField();
		fieldNome = new javax.swing.JTextField();
		fieldRenda = new javax.swing.JTextField();
		rbuttonFeminino = new javax.swing.JRadioButton();
		rbuttonMasculino = new javax.swing.JRadioButton();
		fieldCpfAntigo = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		panelCliente.setBackground(new java.awt.Color(51, 153, 255));
		panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Papaleguas Airlines",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 0, 12))); // NOI18N
		panelCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		panelCliente.setMaximumSize(new java.awt.Dimension(400, 300));
		panelCliente.setMinimumSize(new java.awt.Dimension(400, 300));
		panelCliente.setPreferredSize(new java.awt.Dimension(400, 300));

		textPaneMsg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jScrollPane1.setViewportView(textPaneMsg);

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

		labelCpfAntigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelCpfAntigo.setText("Cpf Antigo:");

		labelCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelCpf.setText("Idade:");

		labelCpfNovo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelCpfNovo.setText("Cpf Novo:");

		labelRenda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelRenda.setText("Nome:");

		labelIdade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelIdade.setText("Renda:");

		labelSexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelSexo.setText("Sexo:");

		rbuttonFeminino.setText("Feminino");
		rbuttonFeminino.setActionCommand("feminino");
		rbuttonFeminino.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				rbuttonFemininoItemStateChanged(evt);
			}
		});

		rbuttonMasculino.setText("Masculino");
		rbuttonMasculino.setActionCommand("masculino");
		rbuttonMasculino.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				rbuttonMasculinoItemStateChanged(evt);
			}
		});

		javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
		panelCliente.setLayout(panelClienteLayout);
		panelClienteLayout
				.setHorizontalGroup(
						panelClienteLayout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panelClienteLayout.createSequentialGroup().addGap(86, 86, 86)
										.addGroup(panelClienteLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(labelCpf).addComponent(labelSexo))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(fieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 0, Short.MAX_VALUE))
				.addGroup(panelClienteLayout.createSequentialGroup()
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panelClienteLayout.createSequentialGroup().addGap(123, 123, 123)
										.addGroup(panelClienteLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160,
														javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(panelClienteLayout.createSequentialGroup()
												.addComponent(botaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 71,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(botaoMenu,
														javax.swing.GroupLayout.PREFERRED_SIZE, 71,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(
										panelClienteLayout.createSequentialGroup().addGap(52, 52, 52)
												.addGroup(
														panelClienteLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(labelCpfNovo).addComponent(labelRenda)
																.addComponent(labelCpfAntigo))
										.addGap(18, 18, 18)
										.addGroup(panelClienteLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(fieldCpfNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 140,
														Short.MAX_VALUE)
										.addComponent(fieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 140,
												Short.MAX_VALUE).addComponent(fieldCpfAntigo,
														javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
						.addGroup(
								panelClienteLayout.createSequentialGroup().addGap(74, 74, 74).addComponent(labelIdade)
										.addGap(18, 18, 18)
										.addGroup(panelClienteLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(panelClienteLayout.createSequentialGroup()
														.addComponent(rbuttonFeminino)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(rbuttonMasculino, javax.swing.GroupLayout.PREFERRED_SIZE,
														81, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(fieldRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGap(99, 102, Short.MAX_VALUE)));
		panelClienteLayout.setVerticalGroup(panelClienteLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panelClienteLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelCpfAntigo).addComponent(fieldCpfAntigo,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelCpfNovo).addComponent(fieldCpfNovo,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelRenda).addComponent(fieldNome,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelIdade).addComponent(fieldRenda,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelCpf).addComponent(fieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panelClienteLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(rbuttonFeminino).addComponent(rbuttonMasculino))
								.addComponent(labelSexo))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
								javax.swing.GroupLayout.PREFERRED_SIZE)
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
	}// </editor-fold>

	private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {
		fieldCpfNovo.setText("");
		fieldCpfAntigo.setText("");
		fieldIdade.setText("");
		fieldNome.setText("");
		fieldRenda.setText("");
		rbuttonFeminino.setSelected(false);
		rbuttonMasculino.setSelected(false);
		textPaneMsg.setText("");
		this.dispose();
	}

	private void botaoOKActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		idade = Integer.parseInt(fieldIdade.getText());
		cpff = fieldCpfNovo.getText();
		nome = fieldNome.getText();
		renda = Integer.parseInt(fieldRenda.getText());
		cpf = new Cpf(cpff);
		cpffAntigo = fieldCpfAntigo.getText();
		cpfAntigo = new Cpf(cpffAntigo);
		cliente = new Cliente(cpf, nome, renda, idade, sexo);
		ControladorCliente.alterar(cpfAntigo, cliente);
		fieldCpfNovo.setText("");
		fieldCpfAntigo.setText("");
		fieldIdade.setText("");
		fieldNome.setText("");
		fieldRenda.setText("");
		rbuttonFeminino.setSelected(false);
		rbuttonMasculino.setSelected(false);
		textPaneMsg.setText("Cliente Alterado com Sucesso!");
	}

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

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(frameClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frameClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frameClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frameClienteAlterar.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frameClienteAlterar().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton botaoMenu;
	private javax.swing.JButton botaoOK;
	private javax.swing.JTextField fieldCpfAntigo;
	private javax.swing.JTextField fieldCpfNovo;
	private javax.swing.JTextField fieldIdade;
	private javax.swing.JTextField fieldNome;
	private javax.swing.JTextField fieldRenda;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel labelCpf;
	private javax.swing.JLabel labelCpfAntigo;
	private javax.swing.JLabel labelCpfNovo;
	private javax.swing.JLabel labelIdade;
	private javax.swing.JLabel labelRenda;
	private javax.swing.JLabel labelSexo;
	private javax.swing.JPanel panelCliente;
	private javax.swing.JRadioButton rbuttonFeminino;
	private javax.swing.JRadioButton rbuttonMasculino;
	private javax.swing.JTextPane textPaneMsg;
	// End of variables declaration
}

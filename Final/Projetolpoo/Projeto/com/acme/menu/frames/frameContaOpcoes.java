package com.acme.menu.frames;

import java.io.IOException;

import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.conta.ControladorContaMilhagem;
import com.acme.rn.conta.ControladorMovimentoConta;
import com.acme.rn.conta.IdentificadorConta;

/**
 *
 * @author Theeam
 */
public class frameContaOpcoes extends javax.swing.JFrame {

	public frameContaOpcoes() {
		initComponents();
	}

	private IdentificadorConta id, idDebito;
	private double valor;
	private long numero, numero2;

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		this.setLocation(400, 350);
		botaoMenu = new javax.swing.JButton();
		botaoTransferir = new javax.swing.JButton();
		botaoDebitar = new javax.swing.JButton();
		botaoBuscar = new javax.swing.JButton();
		botaoExtrato = new javax.swing.JButton();
		botaoCreditar = new javax.swing.JButton();
		labelContaCredito = new javax.swing.JLabel();
		labelValor = new javax.swing.JLabel();
		labelContaDebito = new javax.swing.JLabel();
		fieldCcredito = new javax.swing.JTextField();
		fieldCdebito = new javax.swing.JTextField();
		fieldValor = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		textPaneMsg = new javax.swing.JTextPane();
		textPaneMsg.setEditable(false);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(51, 153, 255));
		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Papaleguas Airlines",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 0, 12))); // NOI18N
		jPanel1.setMaximumSize(new java.awt.Dimension(400, 300));
		jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));

		botaoMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		botaoMenu.setText("Menu");
		botaoMenu.setToolTipText("Menu");
		botaoMenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoMenuActionPerformed(evt);
			}
		});

		botaoTransferir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		botaoTransferir.setText("Transferir");
		botaoTransferir.setToolTipText("Transferir");
		botaoTransferir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					botaoTransferirActionPerformed(evt);
				} catch (Exception e) {
					e.getMessage();
					textPaneMsg.setText("Dados Invalidos\n" + e);
					/**
					 * Joga o exception na caixa de msg
					 */
				}
			}
		});

		botaoDebitar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		botaoDebitar.setText("Debitar");
		botaoDebitar.setToolTipText("Debitar");
		botaoDebitar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					botaoDebitarActionPerformed(evt);
				} catch (Exception e) {
					e.getMessage();
					textPaneMsg.setText("Dados Invalidos\n" + e);
					/**
					 * Joga o exception na caixa de msg
					 */
				}
			}
		});

		botaoBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		botaoBuscar.setText("Buscar");
		botaoBuscar.setToolTipText("Buscar");
		botaoBuscar.setMaximumSize(new java.awt.Dimension(63, 23));
		botaoBuscar.setMinimumSize(new java.awt.Dimension(63, 23));
		botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					botaoBuscarActionPerformed(evt);
				} catch (Exception e) {
					e.getMessage();
					textPaneMsg.setText("Dados Invalidos\n" + e);
					/**
					 * Joga o exception na caixa de msg
					 */
				}
			}
		});

		botaoExtrato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		botaoExtrato.setText("Extrato");
		botaoExtrato.setToolTipText("Extrato");
		botaoExtrato.setMaximumSize(new java.awt.Dimension(63, 23));
		botaoExtrato.setMinimumSize(new java.awt.Dimension(63, 23));
		botaoExtrato.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					botaoExtratoActionPerformed(evt);
				} catch (Exception e) {
					e.getMessage();
					textPaneMsg.setText("Dados Invalidos\n" + e);
					/**
					 * Joga o exception na caixa de msg
					 */
				}
			}
		});

		botaoCreditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		botaoCreditar.setText("Creditar");
		botaoCreditar.setToolTipText("Creditar");
		botaoCreditar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					botaoCreditarActionPerformed(evt);
				} catch (Exception e) {
					e.getMessage();
					textPaneMsg.setText("Dados Invalidos\n" + e);
					/**
					 * Joga o exception na caixa de msg
					 */
				}
			}
		});

		labelContaCredito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		labelContaCredito.setText("ID Conta Credito:");

		labelValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		labelValor.setText("Valor:");

		labelContaDebito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		labelContaDebito.setText("ID Conta Debito:");

		fieldCcredito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		fieldCcredito.setToolTipText("");

		fieldCdebito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		fieldCdebito.setToolTipText("");

		fieldValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		fieldValor.setToolTipText("");

		textPaneMsg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		jScrollPane1.setViewportView(textPaneMsg);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(69, 69, 69)
								.addComponent(botaoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botaoExtrato, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(labelContaCredito)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(fieldCcredito, javax.swing.GroupLayout.PREFERRED_SIZE,
														120, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(labelContaDebito).addComponent(labelValor))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(fieldCdebito,
																javax.swing.GroupLayout.DEFAULT_SIZE, 120,
																Short.MAX_VALUE)
														.addComponent(fieldValor))))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(botaoTransferir, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(botaoDebitar, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(botaoCreditar, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
						.addContainerGap(34, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelContaCredito)
								.addComponent(fieldCcredito, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoCreditar))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelContaDebito)
								.addComponent(fieldCdebito, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(botaoDebitar))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(labelValor)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(fieldValor, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(botaoTransferir)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(botaoMenu, javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(botaoExtrato, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(19, 19, 19)))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {
		
		fieldCdebito.setText("");
		fieldCcredito.setText("");
		fieldValor.setText("");
		textPaneMsg.setText("");
		
		this.dispose();
	}

	private void botaoTransferirActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		numero = Long.parseLong(fieldCcredito.getText());
		id = new IdentificadorConta(numero);
		
		numero2 = Long.parseLong(fieldCdebito.getText());
		idDebito = new IdentificadorConta(numero2);
		
		valor = Double.parseDouble(fieldValor.getText());
		ControladorContaMilhagem.transferir(idDebito, id, valor);
		textPaneMsg.setText("Trasferencia realizada com Sucesso!");
		
		fieldCdebito.setText("");
		fieldCcredito.setText("");
		fieldValor.setText("");
	}

	private void botaoDebitarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		numero = Long.parseLong(fieldCdebito.getText());
		id = new IdentificadorConta(numero);
		valor = Double.parseDouble(fieldValor.getText());
		ControladorContaMilhagem.debitar(id, valor);
		
		fieldCdebito.setText("");
		fieldValor.setText("");
		
		textPaneMsg.setText("Debito realizado com Sucesso!");
	}

	private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		numero = Long.parseLong(fieldCcredito.getText());
		id = new IdentificadorConta(numero);
		textPaneMsg.setText(ControladorContaMilhagem.buscar(id).toString());
		
		fieldCcredito.setText("");
	}

	private void botaoExtratoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		textPaneMsg.setText(ControladorMovimentoConta.BuscarTodos().toString());
		
		fieldCdebito.setText("");
		fieldCcredito.setText("");
		fieldValor.setText("");
	}

	private void botaoCreditarActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		numero = Long.parseLong(fieldCcredito.getText());
		id = new IdentificadorConta(numero);
		valor = Double.parseDouble(fieldValor.getText());
		ControladorContaMilhagem.creditar(id, valor);
		
		fieldCcredito.setText("");
		fieldValor.setText("");
		
		textPaneMsg.setText("Credito realizado com Sucesso!");
		
		
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
			java.util.logging.Logger.getLogger(frameContaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frameContaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frameContaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frameContaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frameContaOpcoes().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton botaoBuscar;
	private javax.swing.JButton botaoCreditar;
	private javax.swing.JButton botaoDebitar;
	private javax.swing.JButton botaoExtrato;
	private javax.swing.JButton botaoMenu;
	private javax.swing.JButton botaoTransferir;
	private javax.swing.JTextField fieldCcredito;
	private javax.swing.JTextField fieldCdebito;
	private javax.swing.JTextField fieldValor;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel labelContaCredito;
	private javax.swing.JLabel labelContaDebito;
	private javax.swing.JLabel labelValor;
	private javax.swing.JTextPane textPaneMsg;
	// End of variables declaration
}

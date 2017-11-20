package com.acme.menu.frames;

import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;

/**
 *
 * @author Theeam
 */
public class frameClienteExcluir extends javax.swing.JFrame {

	public frameClienteExcluir() {
		initComponents();
	}

	/**
	 * Declaracao dos atributos
	 */
	private String cpff;
	private Cpf cpf;

	private void initComponents() {

		panelCliente = new javax.swing.JPanel();
		this.setLocation(400, 350);
		jScrollPane1 = new javax.swing.JScrollPane();
		textPaneMsg = new javax.swing.JTextPane();
		textPaneMsg.setEditable(false);
		botaoMenu = new javax.swing.JButton();
		botaoOK = new javax.swing.JButton();
		labelCpf = new javax.swing.JLabel();
		fieldCpf = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		panelCliente.setBackground(new java.awt.Color(51, 153, 255));
		panelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Papaleguas Airlines",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 0, 12))); // NOI18N

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

		labelCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		labelCpf.setText("Cpf");

		javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
		panelCliente.setLayout(panelClienteLayout);
		panelClienteLayout.setHorizontalGroup(panelClienteLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panelClienteLayout.createSequentialGroup()
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(panelClienteLayout.createSequentialGroup().addGap(123, 123, 123)
										.addComponent(botaoOK, javax.swing.GroupLayout.PREFERRED_SIZE, 71,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(botaoMenu,
												javax.swing.GroupLayout.PREFERRED_SIZE, 71,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(panelClienteLayout.createSequentialGroup().addGap(96, 96, 96)
										.addComponent(labelCpf).addGap(18, 18, 18)
										.addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 139,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(panelClienteLayout.createSequentialGroup().addGap(61, 61, 61).addComponent(
										jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(61, Short.MAX_VALUE)));
		panelClienteLayout.setVerticalGroup(panelClienteLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panelClienteLayout.createSequentialGroup().addContainerGap()
						.addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelCpf).addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116,
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

	/**
	 * Inicializa as variaveis com os dados recebidos
	 * 
	 * Invoca o metodo Excluir do ControladorCliente
	 * 
	 * Imprimi a mensagem de Sucesso ou lança o erro
	 * 
	 * @param evt
	 * @throws Exception
	 */
	private void botaoOKActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		cpff = fieldCpf.getText();
		cpf = new Cpf(cpff);
		ControladorCliente.excluir(cpf);
		textPaneMsg.setText("Cliente e Conta Excluidos com Sucesso!");
		
		fieldCpf.setText("");
	}

	/**
	 * Fecha a janela
	 * 
	 * @param evt
	 */
	private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {
		fieldCpf.setText("");
		textPaneMsg.setText("");
		this.dispose();
	}

	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frameClienteExcluir().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton botaoMenu;
	private javax.swing.JButton botaoOK;
	private javax.swing.JTextField fieldCpf;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel labelCpf;
	private javax.swing.JPanel panelCliente;
	private javax.swing.JTextPane textPaneMsg;
	// End of variables declaration
}

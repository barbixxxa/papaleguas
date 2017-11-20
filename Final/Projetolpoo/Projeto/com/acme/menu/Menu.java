package com.acme.menu;

import javax.swing.JOptionPane;

import com.acme.menu.frames.frameCliente;
import com.acme.menu.frames.frameContaOpcoes;

/**
 *
 * @author Theeam
 */
public class Menu extends javax.swing.JFrame {

	/**
	 * Creates new form frameMenu
	 */
	public Menu() {
		initComponents();
	}

	frameCliente fCliente = new frameCliente();
	frameContaOpcoes fConta = new frameContaOpcoes();

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		panelMenu = new javax.swing.JPanel();
		this.setLocation(400, 350);
		botaoCliente = new javax.swing.JButton();
		botaoConta = new javax.swing.JButton();
		botaoSair = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		panelMenu.setBackground(new java.awt.Color(51, 153, 255));
		panelMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Papaleguas Airlines",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Arial", 0, 12))); // NOI18N

		botaoCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		botaoCliente.setText("Cliente");
		botaoCliente.setToolTipText("Cliente");
		botaoCliente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoClienteActionPerformed(evt);
			}
		});

		botaoConta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		botaoConta.setText("Conta");
		botaoConta.setToolTipText("Conta");
		botaoConta.setPreferredSize(new java.awt.Dimension(71, 23));
		botaoConta.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoContaActionPerformed(evt);
			}
		});

		botaoSair.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
		botaoSair.setText("Sair");
		botaoSair.setToolTipText("Sair");
		botaoSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botaoSairActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
		panelMenu.setLayout(panelMenuLayout);
		panelMenuLayout.setHorizontalGroup(panelMenuLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panelMenuLayout.createSequentialGroup().addGap(155, 155, 155)
						.addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botaoCliente, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botaoConta, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(154, Short.MAX_VALUE)));
		panelMenuLayout.setVerticalGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panelMenuLayout.createSequentialGroup().addGap(75, 75, 75).addComponent(botaoCliente)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(botaoConta, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(botaoSair).addContainerGap(91, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panelMenu,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(panelMenu,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	private void botaoClienteActionPerformed(java.awt.event.ActionEvent evt) {
		fCliente.setVisible(true);
	}

	private void botaoContaActionPerformed(java.awt.event.ActionEvent evt) {
		fConta.setVisible(true);
	}

	private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "Created by: ", "Créditos", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
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
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Menu().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton botaoCliente;
	private javax.swing.JButton botaoConta;
	private javax.swing.JButton botaoSair;
	private javax.swing.JPanel panelMenu;
	// End of variables declaration
}

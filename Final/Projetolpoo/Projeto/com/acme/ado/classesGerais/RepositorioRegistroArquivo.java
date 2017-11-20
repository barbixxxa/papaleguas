package com.acme.ado.classesGerais;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import com.acme.rn.classesGerais.Registro;

public class RepositorioRegistroArquivo<Identificavel extends Registro> implements IRepositorioRegistro<Identificavel> {

	private FileOutputStream identificavelOut = null;
	private FileInputStream identificavelIn = null;
	private ObjectOutputStream dadosOut = null;
	private ObjectInputStream dadosIn = null;
	private File arquivo = null;
	private File local;

	public void incluir(Identificavel novo) throws IOException {
		try {
			local.mkdirs();
			identificavelOut = new FileOutputStream(local + "\\" + novo.getChave() + ".txt");
			dadosOut = new ObjectOutputStream(identificavelOut);
			dadosOut.writeObject(novo);
			dadosOut.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dadosOut.close();
			} catch (Exception e) {
			}
		}
	}

	public Identificavel buscar(String id) throws IOException, ClassNotFoundException {
		Identificavel identificavel = null;
		try {
			identificavelIn = new FileInputStream(local + "\\" + id + ".txt");

			dadosIn = new ObjectInputStream(identificavelIn);
			identificavel = (Identificavel) dadosIn.readObject();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				dadosIn.close();
			} catch (Exception e) {
			}
		}
		return identificavel;
	}

	public boolean excluir(String id) throws ClassNotFoundException, IOException {
		arquivo = new File(local + "\\" + id + ".txt");

		return arquivo.delete();
	}

	public boolean alterar(String id, Identificavel novo) throws IOException, ClassNotFoundException {
		if (this.excluir(id)) {
			this.incluir(novo);
			return true;
		}
		return false;
	}

	public Identificavel buscarTodos() throws ClassNotFoundException, IOException {
		File[] nome = local.listFiles();
		File arq;
		String s, r;

		for (int i = 0; i < nome.length; i++) {
			arq = nome[i];
			s = arq.getName();
			r = s.substring(0, s.lastIndexOf("."));
			System.out.println(this.buscar(r));
		}
		return null;
	}

	public void definirLocal(File file) {
		this.local = file;
	}

	
}

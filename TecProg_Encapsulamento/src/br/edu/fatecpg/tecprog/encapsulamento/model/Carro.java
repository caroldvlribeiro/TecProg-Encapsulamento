package br.edu.fatecpg.tecprog.encapsulamento.model;

public class Carro {
	private String marca;
	private double capacidadeTanque;
	private String modelo;
	private int ano;
	private double cc;
	private boolean ac;
	public Carro(String marca, double capacidadeTanque, String modelo, int ano, double cc, boolean ac) {
		super();
		this.marca = marca;
		this.capacidadeTanque = capacidadeTanque;
		this.modelo = modelo;
		this.ano = ano;
		this.cc = cc;
		this.ac = ac;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", capacidadeTanque=" + capacidadeTanque + ", modelo=" + modelo + ", ano="
				+ ano + ", cc=" + cc + ", ac=" + ac + "]";
	}
	


}

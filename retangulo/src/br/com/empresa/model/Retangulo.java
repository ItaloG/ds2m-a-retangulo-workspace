package br.com.empresa.model;

public class Retangulo {
 
	private double altura;
	private double base;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double calcularArea() {
		return this.base * this.altura;
	}
	
	public double calcularPerimetro() {
		return 2 * (this.altura + this.base);
	}
	
}

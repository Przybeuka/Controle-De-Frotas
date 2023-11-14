package com.cdf.controledefrota.veiculo;


//TESTE

public class Veiculo {
	private Integer id;
	private String marca;
	private String placa;
	
	public Veiculo(Integer id, String marca, String placa) {
		super();
		this.id = id;
		this.marca = marca;
		this.placa = placa;
	}
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", marca=" + marca + ", placa=" + placa + "]";
	}
	
}

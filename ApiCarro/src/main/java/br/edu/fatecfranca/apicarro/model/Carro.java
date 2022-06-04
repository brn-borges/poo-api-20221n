package br.edu.fatecfranca.apicarro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carro")
public class Carro {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		
		@Column(name="modelo")
		private String modelo;
		
		@Column(name="marca")
		private String marca;
		
		@Column(name="combustivel")
		private String combustivel;
		
		@Column(name="potencia")
		private String potencia;

		public Carro() {
		
		}
	
		public Carro(Long id, String modelo, String marca, String combustivel, String potencia) {
			super();
			this.id = id;
			this.modelo = modelo;
			this.marca = marca;
			this.combustivel = combustivel;
			this.potencia = potencia;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		
		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getCombustivel() {
			return combustivel;
		}

		public void setCombustivel(String combustivel) {
			this.combustivel = combustivel;
		}

		public String getPotencia() {
			return potencia;
		}

		public void setPotencia(String potencia) {
			this.potencia = potencia;
		}

		@Override
		public String toString() {
			return "Carro [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", combustivel=" + combustivel
					+ ", potencia=" + potencia + "]";
		}
		
}

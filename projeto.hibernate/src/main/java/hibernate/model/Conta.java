package hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Conta")
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public long id;
	
	@Column(name = "nome")
	public String nome;
	
	@Column(name = "data_vencimento")
	public String dataVencimento;
	
	@Column(name = "data_pagamento")
	public String dataPagamento;
	
}

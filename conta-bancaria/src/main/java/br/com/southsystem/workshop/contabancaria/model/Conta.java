package br.com.southsystem.workshop.contabancaria.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.southsystem.workshop.contabancaria.model.enumeration.TipoContaEnum;

/**
 * Documentar.
 *
 * @author Emiliano Fagundes (ef69036) - SouthSystem
 *
 */
@Document(collection ="contas")
public class Conta implements Serializable {

	
	private static final long serialVersionUID = 1461064527613287165L;
	
	@Id
	private String id;
	private String numeroConta;
	private String agencia;
	private TipoContaEnum tipoConta;
	
}

package br.com.caelum.jdbc.exceptions;

public class ConexaoNegadaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ConexaoNegadaException(String msg){
        super(msg);
	}
}

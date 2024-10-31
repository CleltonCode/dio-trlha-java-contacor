package excecao;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class ParametrosInvalidosException extends RuntimeException{

	/**
	 * importante caso a exceção seja serializada
	 */
	private static final long serialVersionUID = 1L;
	
	public ParametrosInvalidosException(String msg) {
		super(msg);
	}
}

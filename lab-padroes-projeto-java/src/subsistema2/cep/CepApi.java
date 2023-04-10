package subsistema2.cep;

import dio.gof.singleton.SingletonEager;

public class CepApi {

	private static CepApi instancia = new CepApi();
	
	// construtor como private para não haver mais de uma instancia 
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		System.out.println("cidade recuperada");
		return "";
	}
	
	public String recuperarEstado(String cep) {
		System.out.println("estado recuperado");
		return "";
	}
}

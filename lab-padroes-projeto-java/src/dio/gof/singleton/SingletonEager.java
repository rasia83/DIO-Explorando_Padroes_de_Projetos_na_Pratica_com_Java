package dio.gof.singleton;

/**
 * Singleton apressado
 * @author Rasia
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	// construtor como private para não haver mais de uma instancia 
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}

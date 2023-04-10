package dio.gof.singleton;

/**
 * Singleton Preguiçoso
 * 
 * @author Rasia
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	// construtor como private para não haver mais de uma instancia 
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null)
			instancia = new SingletonLazy();
		
		return instancia;
	}
}

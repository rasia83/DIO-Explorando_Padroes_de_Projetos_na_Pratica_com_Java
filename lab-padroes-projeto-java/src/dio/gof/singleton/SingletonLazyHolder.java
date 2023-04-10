package dio.gof.singleton;

/**
 * Singleton Lazy Holder
 * Thread safety in Singleton
 * 
 * @author Rasia
 *
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		public static final SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	
	// construtor como private para não haver mais de uma instancia 
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}

}

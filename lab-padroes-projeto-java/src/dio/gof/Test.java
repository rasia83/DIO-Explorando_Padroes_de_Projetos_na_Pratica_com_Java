package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.ComportamentoAgressivo;
import dio.gof.strategy.ComportamentoDefensivo;
import dio.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		/*** Testes - Desing Pattern Singleton ***/
		testSingleton();
		
		testStrategy();
		
		testFacade();
		
	}
	
	public static void testFacade() {
		System.out.println();
		Facade f = new Facade();
		f.migrarCliente("nome", "cep");
		System.out.println();
		
	}
	
	public static void testStrategy() {
		Robo r1 = new Robo();
		r1.mover();
		r1.setComportamento(new ComportamentoDefensivo());
		r1.mover();
		r1.setComportamento(new ComportamentoAgressivo());
		r1.mover();
		
	}
	
	public static void testSingleton() {

		System.out.println("Testes - Desing Pattern Singleton");
		System.out.println();
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		SingletonLazy lazy2 = SingletonLazy.getInstancia();
		System.out.println(lazy2);
		System.out.println();

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		SingletonEager eager2 = SingletonEager.getInstancia();
		System.out.println(eager2);
		System.out.println();
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder2);
		System.out.println();
		
	}

}

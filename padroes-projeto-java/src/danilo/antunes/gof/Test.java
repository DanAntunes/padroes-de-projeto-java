package danilo.antunes.gof;

import danilo.antunes.gof.facade.Facade;
import danilo.antunes.gof.singleton.SingletonEager;
import danilo.antunes.gof.singleton.SingletonLazy;
import danilo.antunes.gof.singleton.SingletonLazyHolder;
import danilo.antunes.gof.strategy.Comportamento;
import danilo.antunes.gof.strategy.ComportamentoAgressivo;
import danilo.antunes.gof.strategy.ComportamentoDefensivo;
import danilo.antunes.gof.strategy.ComportamentoNormal;
import danilo.antunes.gof.strategy.Robo;

public class Test {

  public static void main(String[] args) {

    // Singleton

    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);

    // Strategy

    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento normal = new ComportamentoNormal();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    robo.setComportamento(defensivo);
    robo.mover();
    robo.setComportamento(agressivo);
    robo.mover();
    robo.mover();
    robo.mover();

    // Facade

    Facade facade = new Facade();
    facade.migrarCliente("Venilton", "14801788");
  }

}

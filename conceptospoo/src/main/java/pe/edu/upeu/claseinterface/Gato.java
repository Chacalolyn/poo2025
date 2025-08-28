package pe.edu.upeu.claseinterface;

public class Gato  implements Animal {
    @Override
    public void emitirSonido() {
        System.out.println("Meu...Meu...");
    }

    @Override
    public void dormir() {
      System.out.println("zZZ...Zzz...");
    }
}

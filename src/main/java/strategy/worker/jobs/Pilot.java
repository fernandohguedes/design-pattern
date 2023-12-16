package strategy.worker.jobs;

public class Pilot implements Worker{
    @Override
    public void eat() {
        System.out.println("Gosto de comer Torrada");
    }

    @Override
    public void move() {
        System.out.println("Não gosta de caminhar sou piloto");
    }

    @Override
    public void work() {
        System.out.println("Sou piloto de corrida");
    }
}

package strategy.worker.jobs;

public class Developer implements Worker {

    @Override
    public void eat() {
        System.out.println("Gosto de comer churrasco");
    }

    @Override
    public void move() {
        System.out.println("Caminhadas ao iniciar o dia");
    }

    @Override
    public void work() {
        System.out.println("Trabalho Home office");
    }
}

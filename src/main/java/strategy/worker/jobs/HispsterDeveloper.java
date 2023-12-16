package strategy.worker.jobs;

public class HispsterDeveloper implements Worker{
    @Override
    public void eat() {
        System.out.println("Como panqueca com guaraná");
    }

    @Override
    public void move() {
        System.out.println("frequento academia");
    }

    @Override
    public void work() {
        System.out.println("Faço pomodoro invertido");
    }
}

package strategy.worker;

import strategy.worker.jobs.Developer;
import strategy.worker.jobs.HispsterDeveloper;
import strategy.worker.jobs.Pilot;
import strategy.worker.jobs.Worker;

public class Cliente {

    public static void presentYourself(Worker worker, String name) {
        System.out.println("Hi, I'm " + name);
        worker.eat();
        worker.move();
        worker.work();
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        /* Nesse Caso criamos uma instância para cada tipo de trabalhado de acordo com a sua profissão */

        /* Jhons é um programado, portando sua implementação é de acordo com o seu trabalho */
        Worker jhon = new Developer();
        presentYourself(jhon, "Jhon");

        /* Ann é uma piloto, portando sua implementação é de acordo com o seu trabalho */
        Worker ann = new Pilot();
        presentYourself(ann, "Ann");

        /* Carol é um programadora moderna, portando sua implementação é de acordo com o seu trabalho */
        Worker carol = new HispsterDeveloper();
        presentYourself(carol, "carol");


    }
}

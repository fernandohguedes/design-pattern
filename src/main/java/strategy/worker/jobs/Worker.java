package strategy.worker.jobs;

public interface Worker {

    /* Temos uma interface com contratos onde que os interessados em implementa-lá
    * devem obrigatóriamente criar comportamente para esses métodos, assim criamos
    * uma padronização de entre os clientes interessados
    */

    void eat();
    void move();
    void work();

}

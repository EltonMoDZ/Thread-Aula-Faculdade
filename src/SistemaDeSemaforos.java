import java.util.concurrent.Semaphore;

public class SistemaDeSemaforos {
    private static final int DURACAO_VERDE = 10_000;
    private static final int DURACAO_AMARELO = 4_000;
    private static final int DURACAO_VERMELHO = 13_000;

    private static Semaphore semaforo1 = new Semaphore(1);
    private static Semaphore semaforo2 = new Semaphore(0);

    public static void main(String[] args) {
        new Thread(new Semaforo(semaforo1, semaforo2)).start();
        new Thread(new Semaforo(semaforo2, semaforo1)).start();
    }

    static class Semaforo implements Runnable {
        private Semaphore meuSemaforo;
        private Semaphore outroSemaforo;

        public Semaforo(Semaphore meuSemaforo, Semaphore outroSemaforo) {
            this.meuSemaforo = meuSemaforo;
            this.outroSemaforo = outroSemaforo;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    meuSemaforo.acquire();

                    System.out.println(Thread.currentThread().getName() + " - Verde");
                    Thread.sleep(DURACAO_VERDE);

                    System.out.println(Thread.currentThread().getName() + " - Amarelo");
                    Thread.sleep(DURACAO_AMARELO);

                    System.out.println(Thread.currentThread().getName() + " - Vermelho");
                    Thread.sleep(DURACAO_VERMELHO);

                    outroSemaforo.release();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

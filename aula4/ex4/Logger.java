import java.util.Arrays;

public class Logger {

    public static void main(String[] args) {
        Logger logger = new Logger();

        // Teste simples
        logger.log("Mensagem simples");

        // Teste com nível
        logger.log("Mensagem com nível", 3);

        // Teste com exceção
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            logger.log("Erro capturado", e);
        }

        // Teste com múltiplos objetos (varargs)
        logger.log("Vários objetos recebidos", 1, "texto", true, 5.7);
    }

    public void log(String msg){
        System.out.println("Logs: " + msg);
    }

    public void log(String msg, int nivel){
        System.out.println("Logs: " + msg + "Nível: " + nivel);
    }

    public void log(String msg, Throwable t){
        System.out.println("Logs: " + msg + "Throwable: " + t);
    }

    
    public void log(String format, Object... args){
        System.out.println("Logs: " + format);
        System.out.println("Objetos: " + Arrays.toString(args));
    }
}
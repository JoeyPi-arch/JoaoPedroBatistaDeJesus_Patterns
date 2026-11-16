package Decorator;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String mensagem){
        System.out.println("Enviando E-Mail: " + mensagem);
    }
}

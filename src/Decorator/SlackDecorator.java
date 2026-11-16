package Decorator;

public class SlackDecorator extends NotifierDecorator {

    public SlackDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String mensagem) {
        wrappee.send(mensagem);
        System.out.println("Enviando SLACK: " + mensagem);
    }
}
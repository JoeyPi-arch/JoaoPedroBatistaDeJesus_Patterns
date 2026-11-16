package Decorator;

public class SmsDecorator extends NotifierDecorator {

    public SmsDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String mensagem) {
        wrappee.send(mensagem);
        System.out.println("Enviando SMS: " + mensagem);
    }
}
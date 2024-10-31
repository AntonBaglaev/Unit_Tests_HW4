package seminars.fourth.message;

public class MessageService {
    public void sendMessage(String message, String recipient) {
        System.out.println("Отправка сообщения \"" + message + "\" получателю " + recipient);
    }
}

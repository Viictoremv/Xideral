// File: SingleClassDIDemo.java
public class SingleClassDIDemo {
    // Dependency interface
    interface MessageService {
        void sendMessage(String msg);
    }

    // Concrete implementation
    static class EmailService implements MessageService {
        @Override
        public void sendMessage(String msg) {
            System.out.println("[Email] " + msg);
        }
    }

    // Class that uses MessageService via constructor injection
    private final MessageService service;

    public SingleClassDIDemo(MessageService service) {
        this.service = service; // dependency is injected
    }

    public void sendNotification(String message) {
        service.sendMessage(message);
    }

    // Demonstration in main (setup/injection)
    public static void main(String[] args) {
        // Choose implementation here, not inside SingleClassDIDemo
        MessageService smsService = new MessageService() {
            @Override
            public void sendMessage(String msg) {
                System.out.println("[SMS] " + msg);
            }
        };

        // Inject dependency
        SingleClassDIDemo demo = new SingleClassDIDemo(smsService);
        demo.sendNotification("Dependency Injection in one class!");
    }
}
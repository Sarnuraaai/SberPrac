package third;

public class Main {
    public static void main(String[] args) {
        ServiceUtil<String, String> service1 = new ServiceUtil<>(new Service1RequestValidator(), new Service1ResponseValidator());
        service1.workWithService("Сообщение");

        ServiceUtil<Integer, Integer> service2 = new ServiceUtil<>(new Service2RequestValidator(), new Service2ResponseValidator());
        service2.workWithService(123);
    }
}

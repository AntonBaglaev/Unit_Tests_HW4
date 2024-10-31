package seminars.fourth;

import seminars.fourth.book.Book;
import seminars.fourth.book.BookRepository;
import seminars.fourth.book.BookService;
import seminars.fourth.book.InMemoryBookRepository;
import seminars.fourth.database.DataProcessor;
import seminars.fourth.database.Database;
import seminars.fourth.hotel.BookingService;
import seminars.fourth.hotel.HotelService;
import seminars.fourth.message.MessageService;
import seminars.fourth.message.NotificationService;
import seminars.fourth.weather.WeatherReporter;
import seminars.fourth.weather.WeatherService;

import java.util.List;

public class Main {

//    public static void main(String[] args) {
//        WeatherService weatherService = new WeatherService();
//        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
//        String report = weatherReporter.generateReport();
//        System.out.println(report);
//    }


//    public static void main(String[] args) {
//        HotelService realHotelService = new HotelService();
//        BookingService bookingService = new BookingService(realHotelService);
//        if (bookingService.bookRoom(2)) {
//            System.out.println("Успешно забронирован номер 2!");
//        } else {
//            System.out.println("Не удалось забронировать номер 2.");
//        }
//
//        if (bookingService.bookRoom(3)) {
//            System.out.println("Успешно забронирован номер 3!");
//        } else {
//            System.out.println("Не удалось забронировать номер 3.");
//        }
//    }


   // public static void main(String[] args) {
   //     MessageService messageService = new MessageService();
   //     NotificationService notificationService = new NotificationService(messageService);

   //     notificationService.sendNotification("Привет!", "Анна");
    // }


//    public static void main(String[] args) {
//        Database database = new Database();
//        DataProcessor dataProcessor = new DataProcessor(database);
//        List<String> data = dataProcessor.processData("SELECT * FROM table");
//        for (String datum : data) {
//            System.out.println(datum);
//        }
//    }

    public static void main(String[] args) {
        BookRepository repository = new InMemoryBookRepository();
        BookService bookService = new BookService(repository);

        Book book1 = bookService.findBookById("1");
        System.out.println("Найдена книга: " + book1.getTitle() + " by " + book1.getAuthor());

        List<Book> allBooks = bookService.findAllBooks();
        System.out.println("Все книги:");
        for (Book book : allBooks) {
            System.out.println("- " + book.getTitle() + " от " + book.getAuthor());
        }
    }
}
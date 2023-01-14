public class Main {
    public static void main(String[] args) {

        int ticketPrice = 8800; // Стоимость билета

        int exchangeCourse = 20; // Обменный курс рубль/миля

        int result = ticketPrice / exchangeCourse; // Результат

        System.out.println("Поздравляем! Ваш билет заработал бонусы.");
        System.out.println("Эти мили для полётов теперь ваши: " + (result) + ".");
        System.out.println("Приятного путешествия!");
    }
}
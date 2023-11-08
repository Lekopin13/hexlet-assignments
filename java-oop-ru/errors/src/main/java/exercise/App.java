package exercise;

// BEGIN
public class App {

    public static void printSquare(Circle circle) {
        try {
            Math.round(circle.getSquare());
        } catch (NegativeRadiusException exception) {
                System.out.println("Не удалось посчитать площадь");
        } finally {
            System.out.println("Вычисление окончено");
        }
    }
}
// END

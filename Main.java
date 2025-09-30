import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        int customsFee = calculateCustoms(price, weight);

        System.out.println("Размер пошлины (в руб.) составит: " + customsFee);

        scanner.close();
    }

    public static int calculateCustoms(int price, int weight) {
        int fromPrice = price / 100;
        int fromWeight = weight * 100;
        return fromPrice + fromWeight;
    }
}

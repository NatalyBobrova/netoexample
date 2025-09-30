public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

        int d = calc.multiply.apply(5, 6);
        calc.println.accept(d);

        int e = calc.pow.apply(4);
        calc.println.accept(e);

        boolean isPos = calc.isPositive.test(-5); // false
        System.out.println("Число положительное? " + isPos);

        System.out.println("\nРабочий");
        OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();
    }
}

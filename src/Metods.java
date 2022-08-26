public class Metods {
    private int a;
    private int d;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void metod() {
        try {
            d = a / 0;
            System.out.println("Текст появился код неверный");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль словили ошибку");
        }
        System.out.println("Cловил ошибку круто ");
        System.out.println("Первый блок ошибка простая через try catch");
    }

    public void metod1() {
        try {
            d = a / 0;
            int[] array = new int[a];
            array[a + 1] = d;
            System.out.println("Текст появился код неверный");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль словили ошибку");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Неправильный индекс");
        }
        System.out.println("Cделали 2 кетча   круто ");
    }

    public void metod2() {
        try {
            d = a / 0;
            int[] array = new int[a];
            array[a + 1] = d;
            System.out.println("Текст появился код неверный");
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Споймали ошибку c помощью мульти кетча");
        }
    }

    public void metod3() {
        try {
            d = a / 0;
            int[] array = new int[a];
            array[a + 1] = d;
            System.out.println("Текст появился код неверный");
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Споймали ошибку c помощью мульти кетча должен еще появится блок файнали");
        } finally {
            System.out.println("Этот текст будет в любом случае");
        }
    }
    public void metod4() {
        try {
            d = a / 0;
            int[] array = new int[a];
            array[a + 1] = d;
            System.out.println("Текст появился код неверный");
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Споймали ошибку c помощью мульти кетча должен еще появится блок файнали,блок файноли не будкт выполнен");
            System.exit(0);
        }
        finally {
            System.out.println("Этот текст будет в любом случае");
        }
    }
}







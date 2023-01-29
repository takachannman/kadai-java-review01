
public class Review01 {

    public static void main(String[] args) {
        int money = 1500;
        int taxrate = 10;
        int result;
        result = tax(money, taxrate);
        int total = money + result;
        System.out.println(total);
    }

    public static int tax(int money, int taxrate) {
        int result = money * taxrate/ 100;
        return result;
    }
}
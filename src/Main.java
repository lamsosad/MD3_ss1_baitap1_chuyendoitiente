import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Nhập giá tiền cần chuyển đổi: ");
        float USD = money.nextFloat();
        System.out.println("Tiền VNĐ:" + USD * 23000 + "VND");
    }
}
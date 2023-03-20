import utils.InputMethods;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static Queue queueCustomer = new LinkedList();

    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập tên khách hàng chờ mua vé xem phim\n" +
                    "2. Khách tiếp theo\n" +
                    "3. Thoát");
            System.out.print("Nhập lựa chọn phù hợp: ");
            byte option = InputMethods.getByte();
            switch (option) {
                case 1:
                    inputCustomer();
                    break;
                case 2:
                    nextCustomer();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ, vui lòng thử lại...");
            }
            InputMethods.pressAnyKey();
        }
    }

    private static void nextCustomer() {
        if (queueCustomer.isEmpty()) {
            System.err.println("\nDanh sách khách hàng chờ đang trống\n");
            return;
        }
        String customer = (String) queueCustomer.poll();
        System.out.println("Khách hàng tiếp theo: " + customer);
    }

    private static void inputCustomer() {
        System.out.print("Nhập tên khách hàng chờ mua vé: ");
        String customer = InputMethods.getString();
        queueCustomer.offer(customer);
        System.out.println("Thêm khách hàng chờ thành công:");
    }
}

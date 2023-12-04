import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap mot so nguyen duong n: ");
            int n = scanner.nextInt();
            int choice;

            do {
                System.out.println("Chon mot trong cac lua chon sau:");
                System.out.println("1. kiem tra xem n co phai so hoan thien khong.");
                System.out.println("2. tinh tong câc ky so cua n.");
                System.out.println("3. Liet ke cac uoc so la so nguyen to cua n");
                System.out.println("4. cúc");
                System.out.print("may chon di tao xem nao: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        if (isPerfectNumber(n)) {
                            System.out.println(n + " u no la so haon thien do");
                        } else {
                            System.out.println(n + " no eo phai so hoan thien dau");
                        }
                        break;
                    case 2:
                        System.out.println("tong cac chu so cua " + n + " la: " + sumOfDigits(n));
                        break;
                    case 3:
                        System.out.println("Cac uoc so nguyen to cua " + n + " la: ");
                        listPrimeFactors(n);
                        break;
                    case 4:
                        System.out.println("ket thuc, eo lam nua");
                        break;
                    default:
                        System.out.println("eee chon sai roi, chon lai");
                        break;
                }
            } while (choice != 4);
        }
    }

   
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

   
    public static void listPrimeFactors(int num) {
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num/i;
            }
        }
    }
}

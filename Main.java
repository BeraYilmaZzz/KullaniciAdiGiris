import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, evet, hayır, answer, newpass;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz :");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();
        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giriş Başarılı !");
        } else {
            System.out.println("Giriş Başarısız !! \nYeni şifre belirlemek ister misiniz ? : (evet/hayır)");
            answer = input.nextLine();
            if (answer.equals("evet")) {
                System.out.println("Yeni şifrenizi giriniz : ");
                newpass = input.nextLine();
                if (newpass.equals("java101")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. ");
                }
                else if (newpass != ("java101")) {
                    System.out.println("Yeni şifreniz : " + newpass);
                }
            } else if (answer.equals("hayır")) {
                System.out.println("Çıkış yapılmıştır.");
            }
        }
    }
}




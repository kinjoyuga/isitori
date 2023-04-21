import java.util.Scanner;
public class StoneGame {
    public static void main(String[] args) {
        int isi =25;

        System.out.println("______________________");
        System.out.println("石取りゲームを始めます。");
        System.out.println("石の総数：" + isi +"個");
        System.out.println("一度に取れる石の数：３個");
        System.out.println("______________________");

        isi = ms(isi);

    }

    public static int playerA(int isi){
        while(true) {
            System.out.println("playerAの番です。");
            System.out.println("取る石の数を入力してください。1~3まで入力可能です。");

            var sc = new Scanner(System.in);
            var s1 = sc.nextLine();
            var pic = Integer.parseInt(s1);
//        sc.close();
            if (pic <= 0 || 4 <= pic) {
                continue;
            }
            return isi -= pic;
        }
    }
    public static int playerB(int isi){
        while(true) {
            System.out.println("playerBの番です。");
            System.out.println("取る石の数を入力してください。1~3まで入力可能です。");

            var sc = new Scanner(System.in);
            var s1 = sc.nextLine();
            var pic = Integer.parseInt(s1);
//        sc.close();
            if (pic <= 0 || 4 <= pic) {
                continue;
            }

            return isi -= pic;
        }
    }

    public static int ms(int isi) {
        while(true){
            isi = playerA(isi);

            if (isi <= 0) {
                System.out.println("playerBの勝ちです");
                break;
            } else {
                System.out.println("残り：" + isi + "個");
                for (var i = 0; i < isi; i++) {
                    System.out.print("●");
                }
                System.out.println(" ");
                System.out.println("______________________");

            }


            isi = playerB(isi);

            if (isi <= 0) {
                System.out.println("playerAの勝ちです");
                break;
            } else {
                System.out.println("残り：" + isi + "個");
                for (var i = 0; i < isi; i++) {
                    System.out.print("●");
                }
                System.out.println(" ");
                System.out.println("______________________");

            }
        }
        return isi;
    }

}

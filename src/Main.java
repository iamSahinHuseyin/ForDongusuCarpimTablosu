//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //İç içe for döngüsü yardımıyla çarpım tablosu yapmak.
        int sonuc = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println("*****************************");
            for (int j = 0; j <= 10; j++) {
                sonuc = i * j;
                System.out.println(i + " x " + j + " = " + sonuc);
            }
        }
    }
}
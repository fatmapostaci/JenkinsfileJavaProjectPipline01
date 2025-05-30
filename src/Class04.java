public class Class04 {
    public static void main(String[] args) {

        sumAll(5,9,-12,0,100,8,5,5,6);
    }

    private static void sumAll(int ...sayi) {

        int toplam = 0;

        for (int each :sayi) {
            toplam += each;
        }
        System.out.println("toplam = " + toplam);
    }
}

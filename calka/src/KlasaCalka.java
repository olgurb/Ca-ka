public class KlasaCalka {
    public static void main(String[] args) {
        int poczatek = 0;
        int koniec = 5;
        double krok = 0.01;

        System.out.println(calkaProstokaty(poczatek, koniec, krok));
        int[] dupa = {1, 2, 3};
        for (int i = 0; i < dupa.length; i++) {
            System.out.println(dupa[i]);
        }

    }

    public static double funkcja(double x) {
        return x;
    }

    public static double calkaProstokaty(int poczatek, int koniec, double krok) {

        double pole = 0;
        for (double i = poczatek; i <= koniec; i = i + krok) {
            double prostakat = (krok) * funkcja(i + krok);
            pole = pole + prostakat;

        }

        return pole;

    }
}

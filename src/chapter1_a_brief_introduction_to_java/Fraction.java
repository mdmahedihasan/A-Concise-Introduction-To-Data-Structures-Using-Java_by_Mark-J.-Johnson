package chapter1_a_brief_introduction_to_java;

public class Fraction {

    private int num;
    private int den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Fraction(int n) {
        this(n, 1);
    }

    public void addOn(Fraction fraction) {
        num = num * fraction.den + den * fraction.num;
        den *= fraction.den;
    }

    public static Fraction add(Fraction fraction1, Fraction fraction2) {
        int n = fraction1.num * fraction2.den + fraction1.den * fraction2.num;
        int d = fraction1.den * fraction2.den;
        return new Fraction(n, d);
    }

    public String toString() {
        return num + "/" + den;
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 3);
        System.out.print(fraction1 + " + " + fraction2 + " = ");
        System.out.println(add(fraction1, fraction2));
        fraction1.addOn(fraction2);
        System.out.println("Using addOn() changes fraction1 to " + fraction1);
    }
}

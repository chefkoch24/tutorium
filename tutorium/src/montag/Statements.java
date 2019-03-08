package montag;

public class Statements {
	public static void main(String[] args) {
		int a = 1;
		char b = 'B';
		double c = 7.0;
		boolean d = false;
		int aErg = 10 % 3;
		char bErg = (char) 66;
		double cErg = 4 + 5 * 6 / 8;
		boolean dErg = (4 * 5 <= 4 + 5);
		System.out.println("a) Vermutung:" + a + " Tatsächlich: " + aErg);
		System.out.println("Ergebnis: " + (a == aErg));
		System.out.println("b) Vermutung: " + b + " Tatsächlich: " + bErg);
		System.out.println("Ergebnis: " + (b == bErg));
		System.out.println("c) Vermutung: " + c + " Tatsächlich: " + cErg);
		System.out.println("Ergebnis: " + (c == cErg));
		System.out.println("d) Vermutung: " + d + " Tatsächlich: " + dErg);
		System.out.println("Ergebnis: " + (d == dErg));
	}
}

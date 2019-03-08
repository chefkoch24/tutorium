package montag;

public class Ueberlauf {
	public static void main(String[] args) {
		short a = Short.MAX_VALUE;
		System.out.println("Short vor dem Überlauf" + a);
		a++;
		System.out.println("Short nach dem Überlauf" + a);

		byte b = Byte.MAX_VALUE;
		System.out.println("Byte vor dem Überlauf" + b);
		b++;
		System.out.println("Byte nach dem Überlauf" + b);

		int c = Integer.MAX_VALUE;
		System.out.println("Int vor dem Überlauf" + c);
		c++;
		System.out.println("Int nach dem Überlauf" + c);
	}
}

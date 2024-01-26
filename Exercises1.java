public class Exercises1 {
	
	public static void main( String[] args) {
		
		System.out.println("----ES 1\t\t--------------------------");
		byte n0 = 1;
		short n1 = 33;
		int n2 = 435678;
		long n3 = 50_000L + 10L *(n0+n1+n2);
		
		System.out.println("Byte " + n0);
		System.out.println("Short " + n1);
		System.out.println("Int " + n2);
		System.out.println("Long " +n3);
		
		System.out.println("----ES 2\t\t--------------------------");
		double nPounds = 23.43;
		double CONVERSION_FACTOR = 0.45359237;
		double nKilos = nPounds * CONVERSION_FACTOR;
		
		System.out.println("Pounds: " + nPounds + "\tKilos: " + nKilos );
			
		
	}
	
}
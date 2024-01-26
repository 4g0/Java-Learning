class Variables {
	
	public static void main( String[] args ) {
		
		//number
		byte n0 = 0;
		short n1 = 1;
		int n2 = 5, n21 = 2_345_554; 
		long n3 = 321321312L;
		
		//wrapper classes
		System.out.println( "Short bytes: " + Short.BYTES );
		System.out.println( "Int min value: " + Integer.MIN_VALUE );
		System.out.println( "Long max value: " + Long.MAX_VALUE );
		System.out.println( "Long width: " + Long.SIZE );
		
		//decimal
		float d0 = 321.2f, d1 = (float)(323.1);
		double d2 = 4324.32d;
		BigDecimal  d3 = new BigDecimal (342423.3221231213);
		
		
		System.out.println( "Infinity: " + Float.POSITIVE_INFINITY );
		System.out.println( "Double min value: " + Double.MIN_VALUE);
		
		//boolean
		boolean b0 = true;
		boolean b1 = false;
		
		//literal
		char c0 = 'a';
		//String c1 = "Ciao";
		
		//Casting 
		int intMaxVal = Integer.MAX_VALUE;
		int tot = (int)(intMaxVal / 2); //cast to integer
		System.out.println( tot );
		
		int intValue = 5;
		double doubleValue = 32.2443242342314d;
		float floatValue = (float)doubleValue;
		System.out.println( intValue );
		System.out.println( doubleValue );
		System.out.println( floatValue );
	}
	
}

public class E {
	
	static String s1 = "";
	static String s2 = "";
	static String s3 = "";
	
	public static void main(String[] args) {
		final long time = System.currentTimeMillis();
		for(int i = 1; i < 20000; i++) {
			s1 = s1 + i;
		}
		s3 = s1 + s2;
		System.out.println(System.currentTimeMillis() - time);
	}

}


public class D {

	static String s1 = "";
	static String s2 = "";
	static String s3 = "";
	
	public static void main(String[] args) {
		final long time = System.currentTimeMillis();
		new Thread(new Runnable() {
			public void run () {
				for(int i = 1; i < 20000; i++) {
					s1 = s1 + i;
				}
				s3 = s1 + s2;
				System.out.println("1 - " + (System.currentTimeMillis() - time));
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run () {
				for(int i = 10001; i < 20000; i++) {
					s2 = s2 + i;
				}
				s3 = s1 + s2;
				System.out.println("2 - " + (System.currentTimeMillis() - time));
			}
		}).start();
	}
}

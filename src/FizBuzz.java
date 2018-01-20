

public class FizBuzz {
	public static void main(String[] args) {
		for (int i=1; i < 20; i++ ) {
			if (i%3==0 && i%5==0) {
				System.out.println("fizbuzz");
			}
			else if (i%5==0) {
				System.out.println("buzz");
			}
			else if (i%3==0) {
				System.out.println("fiz");
			}
			else {
				System.out.println(i);
			}
	}

}
}
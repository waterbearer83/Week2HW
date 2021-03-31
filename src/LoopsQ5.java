
public class LoopsQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Week2 HW 
		//Question 5b
		int i = 100;
		while (i > 0) {
			System.out.println(i);
			i -= 3;
		}
		
		//Question 5c
		for (int n = 1; n < 100; n += 2) {
			System.out.println(n);
		}
		//Question 5d
		for (int x = 0; x < 100 ; x++) {
			if ((x % 3 == 0) && (x % 5 == 0)) {
				System.out.println("HelloWorld");
			}else if (x % 5 == 0) {
				System.out.println("World");
			}else if (x % 3 == 0){
				System.out.println("Hello");
			}else {
				System.out.println(x);
			}
		}
	}

}

package abc;

public class MethodExample {

	static void display() {
		
		System.out.println("THIS IS A METHOD. My first one");
	}
	
	static void add(int x, int y) {
		int sum = x+y;
		System.out.println("THE SUM OF THE TWO NUMS ARE "+sum);
	}
	
	static int findLargest(int x, int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	
	public static void main(String[] args) {
		
		display();
		add(100,300);
		add (1000,3484);
		int result = findLargest(10, 50);
		System.out.println(result);
	}

}

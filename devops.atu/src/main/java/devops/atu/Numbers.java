package devops.atu;

public class Numbers {

	public int sum(int a, int b){
		int total = 0;
		total = a + b;
		
		System.out.println("The sum of a and b is =" + total);
		return (total);
	}
	
	public int subtract(int e, int f){
		int total = 0;
		total = e - f;
		
		System.out.println("Subtracting f from e is =" + total);
		return (total);
	
	}
	
	public int largest(int g, int h){
		if (g > h) {
			return g;
		}else return h;
		
	}

	public int smallest(int i, int j){
		if (i < j) {
			return i;
		}else return j;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

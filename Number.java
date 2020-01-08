public class Number {
	public static void main(String args[]){
		int a = 0;
		
		System.out.println("Mencari Bilangan Prima V2");
		for(int i=0;i<=100;i++){
			for(int j=2; j<i;j++){
				if(i%j>0){
					System.out.println(i + " adalah bilangan prima.");
				}
			}
		}
	}
}
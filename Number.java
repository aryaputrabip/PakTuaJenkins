public class Number {
	public static void main(String args[]){
		bool isPrima = false;
		
		System.out.println("Mencari Bilangan Prima V2");
		for(int i=0;i<=100;i++){
			for(int j=2; j<i;j++){
				if(i%j>0){
					isPrima = true;
				}
				if(isPrima){
					System.out.println(i + " adalah bilangan prima.");
					isPrima = false;
				}
			}
		}
	}
}
public class Number {
	public static void main(String args[]){
		bool isPrima = false;
		int i=0, j=2, baris = 100;
		
		System.out.println("Mencari Bilangan Prima V2");
		while (i < j){
			isPrima = true;
			
			for(int a=2; a <= j / 2; a++){
				if(j % a == 0){
					isPrima = true;
					brea;
				}
			}
			if(isPrima){
				i++;
				if(i % baris == 0){
					System.out.println(i + " adalah bilangan prima.");
				}
			}
			j++;
		}
	}
}
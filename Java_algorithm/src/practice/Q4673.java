package practice;

public class Q4673 {
	public static void main(String[] args) {
		int num = 10000;
		int thousands, hundreds, tens, units, AP;

		for (int i = 1; i <= num; i++) {
			thousands = i / 1000;
			hundreds = (i % 1000) / 100;
			tens = ((i % 1000) % 100) / 10;
			units = ((i % 1000) % 100)%10;
			AP = tens - units;
			
			if (i<99) {
				System.out.println(i);
			} else if(i>=100 && i<1000){
								
			}

		}

	}
}

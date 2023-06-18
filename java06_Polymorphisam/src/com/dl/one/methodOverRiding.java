package com.dl.one;
class RBI{
	
	public int gerRateofIntrest() {
		return 0;
		
	}
}
class SBI extends RBI{
		
		public int gerRateofIntrest() {
			return 2;
			
		}
	}
class ICICI extends RBI{
		
		public int gerRateofIntrest() {
			return 0;
			
		}
	}
public class methodOverRiding {

	
	
		public static void main(String[] args) {
			
			SBI sbi = new SBI();
			System.out.println(sbi.gerRateofIntrest() );
		}
	
}

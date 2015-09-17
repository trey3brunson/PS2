package MainPackage;

public class MyInteger {
	private int value;
	
	public MyInteger (int value) {
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isEven () {
		return (this.value % 2) == 0;
	}
	public boolean isOdd (){
		return (this.value % 2) == 1;
	}
	
	public boolean isPrime () {
		for(int i=2; i<value;i++){
			if(value%i==0)
				return false;
	}
	return true;			
	}
	
	public static boolean isEven (int value) {
		return (value % 2) == 0;
	}
	public static boolean isOdd (int value){
		return (value % 2) == 1;
	}
	
	public static boolean isPrime (int value) {
		for(int i=2; i<value;i++){
			if(value%i==0)
				return false;
			}
	return true;
}
	
	
	public static boolean isEven (MyInteger input) {
		return (input.value % 2) == 0;
	}
	public static boolean isOdd (MyInteger input){
		return (input.value % 2) == 1;
	}
	
	public static boolean isPrime (MyInteger input) {
		for(int i=2; i < input.value; i++){
			if(input.value % i==0)
				return false;
	}
	return true;			
	}

	public boolean equals(int value1){
		return (value == value1 );
	}
	
	public boolean equals(MyInteger MyInteger){
		return equals(MyInteger.getValue());
	}
	public static int parseInt(char[] string1)  {
		return parseInt(new String(string1));
	}
	public static int parseInt(String string1){
		return Integer.parseInt(string1);
	}
}

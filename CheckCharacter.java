package practice.empty;

public class CheckCharacter {
	
	static void vowelOrConstant(char x) {
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
			System.out.println(x+ " is Vowel");
		}
		else {
			System.out.println(x+ " is Constant");
		}
	}
	public static void main(String[] args){
		vowelOrConstant('a');
		vowelOrConstant('b');
		vowelOrConstant('u');
	}

}

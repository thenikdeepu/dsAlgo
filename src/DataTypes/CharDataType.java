package DataTypes;

public class CharDataType {

	public static void main(String[] args) {
		char c = '0';
		int a = c;
		System.out.println((int) c); // type casting -two type -implict /explict so here we do explicit type casting
		c++; // c=(char)(c+1); // implicit
		int i = 1;
		i++; // i=(int)(i+1) // implicit
		c = (char) (c + 1); // explicit we do it .
	}

}

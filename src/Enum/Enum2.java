package Enum;

public class Enum2 {
	enum Level{High,Medium,Low}
	public static void main(String[] args) {
		Level l=Level.Low;
		switch(l)
		{
		case Low:System.out.println("Low Level");
			break;
		case Medium:System.out.println("Medium Level");
		break;
		case High:System.out.println("High Level");
		break;
		}
		

	}

}

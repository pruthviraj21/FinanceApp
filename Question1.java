package typecasting;

public class Question1 {

	public static void main(String[] args) {
	//	message = {74, 97, 118, 97, 32, 105, 115, 32, 103, 114, 101, 97, 116};
		char msg[]= {(char)74, (char)97,(char) 118, (char)97, (char)32, (char)105, (char)115,(char) 32,(char) 103,(char) 114,(char) 101,(char) 97,(char) 116};
		for(int i=0;i<msg.length;i++)
			System.out.print(msg[i]);
	}

}

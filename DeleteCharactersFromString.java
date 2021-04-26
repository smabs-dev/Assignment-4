package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	public void run() {
		String test = "This is a test.";
		println(removeAllOccurences(test, 't'));
	}
	public String removeAllOccurences(String str, char ch) {
			char y[] = str.toCharArray();
			int size = str.length();
			
			int i = 0;
			String res = "";
			while (i !=size) 
				if(y[i] != ch)
				{
					res=res +y[i];
					i++;
				}
				else {
					i++;
				}
			return res;
	}
}
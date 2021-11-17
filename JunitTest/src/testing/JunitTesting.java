package testing;

public class JunitTesting {

	public int divide(int x, int y)
	{
		return x/y;
	}
	
	public int countA(String word) {
		int count=0;
		for(i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='a' ||word.charAt(i)=='A') {
				count++;
			}
		}
		return count;
	}
}

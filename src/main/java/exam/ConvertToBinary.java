package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
   
     StringBuilder result = new StringBuilder();

		for (int i = 31; i >= 0 ; i--)
		{
			int mask = 1 << i;
			result.append((x & mask) != 0 ? 1 : 0);
		}

		return result.toString();
      
      
  
  }
}

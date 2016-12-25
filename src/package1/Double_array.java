package package1;

public class Double_array {

	public static void main(String[] args)
	{
		String[][] str=new String[2][3];
		str[0][0]="selenum";
		str[0][1]="qtP";
		str[0][2]="bujji";
        
		str[1][0]="nabi";
		str[1][1]="malimsha";
		str[1][2]="array";
		for (int i = 0; i < str.length; i++)
		{
			for (int j = 0; j < str[i].length; j++) 
			{
				System.out.print(str[i][j]+"    ");
			}
			System.out.println();
		}

	}

}

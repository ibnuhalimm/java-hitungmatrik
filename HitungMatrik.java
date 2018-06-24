import java.util.*;

public class HitungMatrik {
	private static Scanner input_user = new Scanner(System.in);
	
	public static void main(String[] args) {
		int loop_a, loop_b, loop_c;
		int matrikA [][] = new int[2][2];
		int matrikB [][] = new int[2][2];
		int hasil_kurang [][] = new int[2][2];
		int hasil_kali [][] = new int[2][2];
		
		System.out.println("----- Pengurangan dan Perkalian Matriks -----");
		
		System.out.println("\n- MATRIK A");
		for(loop_a = 0; loop_a < matrikA.length; loop_a++)
		{
			for(loop_b = 0; loop_b < matrikA.length; loop_b++)
			{
				System.out.print("- Matrik A baris ke-"+(loop_a+1)+" kolom ke-"+(loop_b+1)+" : ");
				matrikA[loop_a][loop_b] = input_user.nextInt();
			}
		}
		
		
		System.out.println("\n- MATRIK B");
		for(loop_a = 0; loop_a < matrikB.length; loop_a++)
		{
			for(loop_b = 0; loop_b < matrikB.length; loop_b++)
			{
				System.out.print("- Matrik B baris ke-"+(loop_a+1)+" kolom ke-"+(loop_b+1)+" : ");
				matrikB[loop_a][loop_b] = input_user.nextInt();
			}
		}
		
		
		System.out.println("\n* MATRIK A ");
		for(loop_a = 0; loop_a < matrikA.length; loop_a++)
		{
			for(loop_b = 0; loop_b < matrikA.length; loop_b++)
			{
				System.out.print(matrikA[loop_a][loop_b]+" ");
			}
			System.out.println();
		}
		

		System.out.println("\n* MATRIK B ");
		for(loop_a = 0; loop_a < matrikB.length; loop_a++)
		{
			for(loop_b = 0; loop_b < matrikB.length; loop_b++)
			{
				System.out.print(matrikB[loop_a][loop_b]+" ");
			}
			System.out.println();
		}

		System.out.println("\n* HASIL A - B ");
		for(loop_a = 0; loop_a < hasil_kurang.length; loop_a++)
		{
			for(loop_b = 0; loop_b < hasil_kurang.length; loop_b++)
			{
				hasil_kurang[loop_a][loop_b] = matrikA[loop_a][loop_b] - matrikB[loop_a][loop_b];
				System.out.print(hasil_kurang[loop_a][loop_b]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n* HASIL A . B ");
		for(loop_a = 0; loop_a < hasil_kali.length; loop_a++)
		{
			for(loop_b = 0; loop_b < hasil_kali.length; loop_b++)
			{
				for(loop_c = 0; loop_c < hasil_kali.length; loop_c++)
				{
					hasil_kali[loop_a][loop_b] += (matrikA[loop_a][loop_b] * matrikB[loop_c][loop_b]);
				}
				System.out.print(hasil_kali[loop_a][loop_b]+" ");
			}
			System.out.println();
		}
		
	}

}

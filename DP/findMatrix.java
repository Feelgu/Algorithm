import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class findMatrix {
	static boolean matrix[][];
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int tc= Integer.parseInt(br.readLine()); 
	
		for( int testCase = 1 ; testCase < tc+1 ; testCase++ ) {
			int num= Integer.parseInt(br.readLine()); // ÀüÃ¼ matrix
			matrix = new boolean[num][num];
			
			for(int i =0; i<num;i++) {  
				int j=0;
				StringTokenizer row = new StringTokenizer(br.readLine(), " ");   
				while(row.hasMoreTokens()) {
					 if(Integer.parseInt(row.nextToken())!=0)
						 matrix[i][j++] = true;
					 else 
						 matrix[i][j++] = false;					 
				}
			}
			System.out.print(" " + search(num)); 
			
			
			System.out.print("#" + testCase); 
			
			System.out.print('\n');
			}
		}
	
	public static String search(int num) {
		String result= "";
		int count =1, x,y,sy;
		boolean visit[][] =new boolean [num][num];
		Arrays.fill(visit, false);
		
		for(int i=0; i<num;i++) {
			for(int j=0; j<num; j++) { 
				sy=i;
				if((matrix[i][j]==true)&&(visit[i][j]==false)) {
					for(;(matrix[i][j++]!=true)&&(visit[i][j+1]==false);) {
						visit[i][j]=true;
						count++;
					}
					x=count;
					count=1;
					for(;matrix[i++][j]!=true&&(visit[i+1][j]==false);) {
						visit[i][j]=true;
						count++;
					}
					y=count;
					count=1;
						
					result += x +" "+ y;
				} 
				i=sy;
			}
		}
		return result;

	}
	public static void sort() {
		
	}
}

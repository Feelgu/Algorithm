import java.util.Scanner; 

public class SupplyRoad {  
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// test case number
		int num = sc.nextInt();
		
		for( int testCase = 1  ; testCase < num+1 ; testCase++ ) {
			 
			// N x N
			int N = sc.nextInt(); 
			char[][] matrix = new char[N][N];
			
			//initialization
			for( int i=0; i<N; i++) { 

				// 한줄 씩 입력
				String temp = sc.nextLine();   
				
				for(int j=0 ;j<N;j++) {   
					matrix[i][j]= temp.charAt(j);   
				} 
			} 
			 
			
           System.out.println("#" + testCase);  
           for( int i=0; i<N; i++) { 				
				for(int j=0 ;j<N;j++) {  
					 System.out.print(matrix[i][j] + " ");  
				} 
				System.out.print("\n");  
			} 
        }
	}
	
	// right or bottom
	public static void dfs() {
	
	}

}
 
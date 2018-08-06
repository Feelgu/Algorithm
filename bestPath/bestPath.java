import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Keep in mind that greedy algorithm theory is a post-learning example

public class bestPath{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());

		for( int testCase = 1 ; testCase < num+1 ; testCase++ ) {
			int result = 0, i=0, guest = Integer.parseInt(br.readLine());
			int[] x = new int[guest+2], y=new int[guest+2];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            while(st.hasMoreTokens()) {
            	x[i] = Integer.parseInt(st.nextToken());
            	y[i++] = Integer.parseInt(st.nextToken());
            }
            // Fixed departure and arrival points
            // List the remaining paths by node or stack (sort by (| x1-x2 | + | y1-y2 |))

            //***********************************
            for(i=0; i<guest+2; i++){
            	System.out.println("x : " + x[i]+ "  y : " +y[i]);
            }



             System.out.println("#" + testCase + " "+result);
          }
    }
	public static int compare(int x1, int x2, int y1, int y2) {
		return Math.abs(x1-x2)+ Math.abs(y1-y2);
	}
}

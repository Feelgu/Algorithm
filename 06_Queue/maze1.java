import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;

class Maze1{

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         for(int i=1;i<11;i++) {
            int x,y,val = 0;
            String TestCase= br.readLine();
            String[] Ma = new String[16];

            int[][] Maze = new int[16][16];
            boolean[][] visited = new boolean[16][16];
            Queue<Integer> Q = new LinkedList<Integer>();

            for(int j=0;j<16;j++) {
            	Ma[j] = br.readLine();
            }
            //maze .init
            for(int j=0;j<16;j++) {
            	for(int k=0; k<16; k++) {
            		 Maze[j][k] = Ma[j].charAt(k)-'0';
            		 //start point
            		 if(Ma[j].charAt(k)-'0'==0) {
            			 x=j;
            			 y=k;
            		 }
            	}
            }
            for(int j=0;j<16;j++) {
            	for(int k=0; k<16; k++) {
            		visited[j][k] = false;
            	}
            }
            //탐색
            // {0 0 1 -1}
            // {1 -1 0 0}

            //visit

         }
    }
}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SupplyRoad {

	static class coordinate {
		int x;
		int y;

		coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	static int matrix[][] ;
	static int v[][] ;
	static int N;
	static Queue<coordinate> q = new LinkedList<coordinate>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		// test case number
		int num = sc.nextInt();
		for( int testCase = 1  ; testCase < num+1 ; testCase++ ) {

			N = sc.nextInt();
			matrix = new int[N][N];

			//visit
			v = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					v[i][j] = Integer.MAX_VALUE;
				}
			}
			//initialization
			for( int i=0; i<N; i++) {
				String temp = sc.next();
				for(int j=0 ;j<N;j++) {
					matrix[i][j]= Integer.parseInt(temp.charAt(j) + "");
				}
			}

			q.add(new coordinate(0, 0));
			v[0][0] = 0;
			bfs();
			confirm();
			System.out.println("#" + testCase + " " + v[N-1][N-1]);
		}
	}
	private static void confirm() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(v[i][j] + "   ");
			}
			System.out.println();
		}
	}
	private static void bfs() {
		while (!q.isEmpty()) {
			coordinate p = q.remove();
			int x = p.x;
			int y = p.y;

			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];

				if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
					continue;
				}
				if (v[nx][ny] > v[x][y] + matrix[nx][ny]) {
					v[nx][ny] = v[x][y] + matrix[nx][ny];
					q.add(new coordinate(nx, ny));

				}
			}

		}
	}

}
 

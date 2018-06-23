import java.util.Scanner;
import java.io.BufferreadReader;

public class DessertCafe {
  static Scanner sc = new Scanner(System.in);
  static int H;
  static int[][] map = new int[20][20];
  static boolean[] visited = new boolean[101];
  static int result;

  static void visitClear(){
    for(int i = 0; i<101; i++)
      visited[i]=false;
  }
  static void init(){
    visitClear();
    result = -1;
  }
  static void solve(){
    for( int i =0l i< H; i++){
      for( int j =0; j<H; j++){
        for( int a=1;a<H;a++){
          for(b=1; b<H;b++){
            if(j+a<=H-1
               && j+a+b<= H-1
               && j-b >=0
               && (a+b)+2 >result){
                 visitClear();
                 boolean isAble = true;
                 int curi = i; curj = j;
                 for(int n = 0; n <a; n++){
                   if(!visited[map[curi][curj]])
                      visited[map[curi][curj]] = true;
                   else{
                      isAble = false;
                      break;
                   }
                 }
                 if (!isAble) continue;

                 for(int n = 0; n<a; n++){
                   curi--; curj--;
                   if(!visited[map[curi][curj]])
                      visited[map[curi][curj]] = true;
                    else{
                      isAble = false;
                      break;
                    }
                 }
                 if( !isAble) continue;
                 result = 2 *(a+b);
               }
          }
        }
      }
    }
  }
  public static void main(String args[]) throws Exception{
    int testCase;
    testCase = sc.nextInt();
    for(int tc =1 ; tc <= testCase; tc++){
      jnit();
      H = sc.nextInt();
      for(int i=0; i<H; i++)
        for( int j =0; j< H; j++)
          map[i][j] = sc.nextInt();
      solve();

      System.out.println("#"+tc+" "+ result);
    }
  }
}

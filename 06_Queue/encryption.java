import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;

class encryption{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         for(int i=1;i<11;i++) {
            int temp = 0;
            String TestCase= br.readLine();
            String result ="";
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            Queue<Integer> Q = new LinkedList<Integer>();

            for(int j=0; j<8; j++)
                Q.offer(Integer.parseInt(tokenizer.nextToken()));

            for(int j=1; ; j++){
                if(j==6)
                    j=1;
                temp = (Integer)Q.poll()-j;
                if(temp<=0){
                    result +="#"+TestCase;
                    for(int k=0; k<7; k++)
                        result += " " + Q.poll();
                    System.out.println(result + " " + 0);
                    break;
                }
                Q.offer(temp);
            }
         }
    }
}

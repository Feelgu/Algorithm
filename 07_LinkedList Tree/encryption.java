import java.util.LinkedList;
import java.util.ListIterator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class encryption{

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

          for( int testCase = 1 ; testCase < 11 ; testCase++ ) {

            int num= Integer.parseInt(br.readLine());

            LinkedList<Integer> cryptoraph = new LinkedList<Integer>();

            StringTokenizer encrypt = new StringTokenizer(br.readLine(), " ");

            int x=0;
            // for( int x = 0 ; x < num ;)
            while(encrypt.hasMoreTokens())
                cryptoraph.add(x++,Integer.parseInt(encrypt.nextToken()));

            num= Integer.parseInt(br.readLine());
            encrypt = new StringTokenizer(br.readLine(), " ");

            // for( int x = 0 ; x < num ; x++ ){
            while(encrypt.hasMoreTokens()){
                if(encrypt.nextToken().equals("I")){
                    int y =Integer.parseInt(encrypt.nextToken());
                    for(int z=Integer.parseInt(encrypt.nextToken());z>0;z--)
                        cryptoraph.add(y++,Integer.parseInt(encrypt.nextToken()));
                }
            }

             System.out.print("#" + testCase);
            for(int j=0; j<10; j++)
                System.out.print(" "+cryptoraph.poll());
            System.out.print('\n');
          }
    }
}

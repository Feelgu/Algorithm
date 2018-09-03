import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class ONE{ 
	private int n;
	private int map[][];
	
	public ONE(int n) {
		this.n = n;
		map = new int[n+1][n+1];
	}
	public void input(int i,int j,int w){
        map[i][j] = w;
        map[j][i] = w;
    }
 
    public void dijkstra(int v){
        int distance[] = new int[n+1];          //�ִ� �Ÿ��� ������ ����
        boolean[] check = new boolean[n+1];     //�ش� ��带 �湮�ߴ��� üũ�� ����
         
        //distance�� �ʱ�ȭ.
        for(int i=1;i<n+1;i++){
            distance[i] = Integer.MAX_VALUE;
        }
         
        //���۳�尪 �ʱ�ȭ.
        distance[v] =0;
        check[v] =true;
         
        //������ distance����
        for(int i=1;i<n+1;i++){
            if(!check[i] && map[v][i] !=0){
                distance[i] = map[v][i];
            }
        }
         
         
        for(int a=0;a<n-1;a++){ 
            int min=Integer.MAX_VALUE;
            int min_index=-1;
              
            for(int i=1;i<n+1;i++){
                if(!check[i] && distance[i]!=Integer.MAX_VALUE){
                    if(distance[i]<min ){
                        min=distance[i];
                        min_index = i;
                    }
                }
            }
             
            check[min_index] = true;
            for(int i=1;i<n+1;i++){
                if(!check[i] && map[min_index][i]!=0){
                    if(distance[i]>distance[min_index]+map[min_index][i]){
                        distance[i] = distance[min_index]+map[min_index][i];
                    }
                }
            }
 
        }
         
        //����� ���
        for(int i=1;i<n+1;i++){
            System.out.print(distance[i]+" ");
        }
        System.out.println("");
         
    }
}  

 	 
 
	int min;
	static int x[];
	static int y[];

    public static void main(String[] args)throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	int testCase= Integer.parseInt(br.readLine());
    	
    	int result = 0, min =2000000003;
    	
    	for( int num = 1 ; num < testCase ; num++ ) {
    		
    		int N= Integer.parseInt(br.readLine()); 
    		StringTokenizer X=  new StringTokenizer(br.readLine(), " "); 
    		StringTokenizer Y=  new StringTokenizer(br.readLine(), " "); 
    		
    		//ȯ�� �δ� ����(E)�� �� �����ͳ� ����(L)�� ������ ��(E * L2)��ŭ ����
    		float E= Float.parseFloat(br.readLine());
    		
    		x = new int[N];
    		y = new int[N];
    		
    		for(int i=0;X.hasMoreTokens();i++)
    			x[i] = Integer.parseInt(X.nextToken()); 

    		for(int i=0;X.hasMoreTokens();i++)
    			y[i] = Integer.parseInt(Y.nextToken()); 
 
    		
    		System.out.print("#" + num + min*min*E); 
    	}
    }
    public void search(int current, int next, int val, int num){
    	if( min<val)  
    		return;
    	if(num==0)
    		if(min>0 && val<min) 
    			min = val; 
    	
    		
    	
    	
    }
    
    public int claculator(int x1, int y1, int x2, int y2){
    	return Math.abs(x1-x2) + Math.abs(y1-y2);    
    }
    
} 

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Power{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for(int i=1;i<=10;i++) {
            int TestCase=Integer.parseInt(br.readLine());
            String str= br.readLine();
            String compare = "";
            int res=0;
            int len = str.length();
            char[] stack = new char(len);

            for( int i = len; i>0 ; i--){
              if(equals(str.charAt(i), str.charAt(i-1)))


            }

            System.out.println("#"+TestCase+" "+ res);
        }
    }

    public static int pow(int num, int square){
      if(square==1)
        return 1;
      return num*pow(num, square--);
    }
}
*/
package day2;



import java.util.Scanner;

import java.util.Stack;



public class CheckBrace {



	public boolean check(String stat) {

		char openPair, testCh;

		int idx = 0;

		Stack<Character> stack = new Stack<Character>();

		while (idx < stat.length()) {

			testCh = stat.charAt(idx);

			switch (testCh) {

			case '(':

			case '{':

			case '[':

				stack.push(testCh); break;

			case ')':

			case '}':

			case ']':

				if (stack.isEmpty())

					return false;

				else {

					openPair = stack.pop();

					if ((openPair == '(' && testCh != ')') ||

							(openPair == '{' && testCh != '}')

							|| (openPair == '[' && testCh != ']'))

						return false;

					else

						break;

				}

			}

			idx++;

		}



		if (stack.isEmpty())

			return true;

		else

			return false;



	}



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("검사 할 수식 입력 : ");

		String stat = scanner.next();

		CheckBrace test = new CheckBrace();

		if(test.check(stat)){

			System.out.println(stat +"는 괄호 짝이 맞는 수식입니다.");

		}else{

			System.out.println(stat +"는 괄호 짝이 맞지 않는 수식입니다.");

		}



	}



}

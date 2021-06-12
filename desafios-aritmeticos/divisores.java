import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class minhaClasse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//declare suas variaveis
        int  A = Integer.parseInt(st.nextToken());
        int  B = Integer.parseInt(st.nextToken());
        int  C = Integer.parseInt(st.nextToken());
        int  D = Integer.parseInt(st.nextToken());
        br.close();   

        //declare suas variaveis com o valor correto 
        int saida = -1;       

//continue o codigo
        if (C % A == 0){
            int sqrt = (int)Math.sqrt(C);
            int n =0;
            for(int i =  1; i <= C; i++ ){
                n = i;
                if (n%A ==0 && n%B!=0 && C%n==0 && D%n!=0){
                    saida = n;
                    break;
                }         
            }
        }
        System.out.println(saida);        
    }    
}

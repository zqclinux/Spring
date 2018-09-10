package tt; /**
 * @author Zhao Quanchao 2017.03.15 0-1������̬�滮
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Dynamic {
	// �洢���ļ��õ���
	private static ArrayList<Goods> temple = new ArrayList<Goods>();
    
	class Goods { // ��¼ÿ�������λ������
		int X;
		int Y;
	}

	public static void main(String[] args) {
		final int Max = 10;  //�����������
		Dynamic dynamic = new Dynamic();
		dynamic.inputNumGoods();
		int [] W = new int[temple.size()+1];  //���ڱ�����Ʒ����������Ϊ��Ʒ����+1����һ����������
		int [] V = new int[temple.size()+1];  //���ڱ�����Ʒ��ֵ������Ϊ��Ʒ����+1����һ����������
		int [][] M = new int[temple.size()+1][Max+1];//���ڱ�������ֵ
		int [] X = new int[temple.size()]; //����Ǹ���Ʒ���Ž�����
        dynamic.getArray(W, V);             //�洢����
        X = dynamic.package0_1(M, W, V, temple.size(), Max);   //��ʼ����Ʒ�����ͼ�ֵ
        dynamic.PrintNum(X,M,Max);
      
	}
 
	//��ʼ����Ʒ����W����ֵV�Լ�M����
	private void getArray(int []W ,int []V ){
		for(int i = 0; i < temple.size(); i++){
			W[i+1] = temple.get(i).X;
			V[i+1] = temple.get(i).Y;
		}
		
	}
	
	// ��input����assign02_01.dat
    // ��ȡ���ݣ���ȡ�����ݱ�����һ��λ��������
	private ArrayList<Goods> inputNumGoods() { 

		File file = new File("input_assign02_01.dat");

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			int temW = 0; // ������ʱ����
			int temV = 0; // ������ʱ��ֵ
			String s;
			while ((s = br.readLine()) != null) {
				String[] stem;
				stem = s.split(" ");
				temW = Integer.parseInt(stem[0]);
				temV= Integer.parseInt(stem[1]);
				Goods temC = new Goods();
				temC.X = temW;
				temC.Y = temV;
				temple.add(temC);
			}
		} catch (FileNotFoundException e) {
			System.out.println("�������ļ�ʧ�ܣ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("��ȡ���ݴ���");
			e.printStackTrace();
		}
		return temple;
	}

	private int [] package0_1(int m[][], int w[],int v[],int n, int c) {  //n������Ʒ�ĸ���
	    //���ôӵ׵�����˳��������m[i][j]��ֵ  
	    //���ȷ�w[n]  
		int [] x = new int[n+1];
	    for(int j = 0; j <= c; j++)  
	       if(j < w[n]) m[n][j] = 0;     //jС��w[n],����Ӧ��ֵ��Ϊ0�������Ϊ���Է���   
	       else         m[n][j] = v[n];  
	         
	    //��ʣ�µ�n-1����Ʒ���з��á�  
	    int i;  
	    for(i = n-1; i >= 1; i--)  
	        for(int j = 0; j <= c; j++)  
	           if(j < w[i])   
	                        m[i][j] = m[i+1][j];//���j < w[i]�򣬵�ǰλ�þͲ��ܷ��ã���������һ��λ�õ�ֵ��  
	                                            //���򣬾ͱȽϵ����Ƿ���֮���ֵ�󣬻��ǲ����õ�ֵ��ѡ�����нϴ��ߡ�              
	           else         m[i][j] = m[i+1][j] > m[i+1][j-w[i]] + v[i]?   
	                                  m[i+1][j] : m[i+1][j-w[i]] + v[i];
	     for(i = 1; i <= n-1; i++)  
	    	 if(m[i][c] == m[i+1][c])
	    		 x[i] = 0; 
	    	 else {   
	    		 x[i] = 1;  
	    		 c = c - w[i];  
	    		 }      
	     x[n] = (m[i][c] > 0)? 1 : 0;     
	     return x;
	}  
    private void PrintNum(int [] x,int [][]m,int Max){
    	System.out.println("��input_assign02_01.dat��ȡ�����������£�");
    	System.out.println("����   " + "��ֵ");
    	for(int i = 0; i <temple.size(); i++ ){
    		System.out.println(temple.get(i).X + "      " + temple.get(i).Y); 
    	}
    	System.out .println();
    	System.out .println("        ***************0-1��������***************");
    	System.out.println("��������Ϊ��" + Max + "����̬�滮�������£�");
    	for(int j = 0; j <= Max; j++){
    		System.out.format("%-5d",j);
    	}
    	System.out.println();
    	for(int i = 1 ; i <= temple.size(); i++){
    		for(int j = 0; j <= Max; j++){
    			System.out.format("%-5d",m[i][j]);
    		}
    		System.out.println();
    	}
    }
}

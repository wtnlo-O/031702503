package read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class in {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			FileReader fr=new FileReader("E:\\word.txt");
			BufferedReader br=new BufferedReader(fr);
			String s=br.readLine();
			while(s!=null)
			{
				System.out.print(s);
				System.out.print("\n");
				s=br.readLine();
			}
			br.close();
			fr.close();
		}catch(IOException e)
		{
			System.out.print("�ļ�������");
		}

	}

}

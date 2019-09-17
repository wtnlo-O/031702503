package read;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class name {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str="李四,福建省福州13756899511市鼓楼区鼓西街道湖滨路110号湖滨大厦一层.";
		String sb=str.substring(0,str.indexOf(","));
	     System.out.println(sb);
     Pattern p=Pattern.compile("[0-9]{11}");
     Matcher m=p.matcher(str);
       while(m.find())
     {
    	 System.out.println(m.group());
     }
          
	}

}

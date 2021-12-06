package collections;

public class NumbertoString {

	public static void main(String[] args) {
		
		/*int n=15985,count=0,pos=0,j=0;
		String s=Integer.toString(n),t;
		int l=s.length();
		//System.out.println(s.getClass().getName());
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='5')
			{
				count++;
				pos=i;
				
			}
		}
		for(int i=0,j=0;i<s.length();i++)
		{
			if(i!=pos)
			{
				t.charAt(j)=s.charAt(i);
				j++;
			}
		}*/
		String text="bhavya";
		char a[]=new char[6];
		for(int i=0;i<text.length();i++) {
			int t=(int)text.charAt(i)+110;
		    a[i]=(char)t;
		}
		for(int i=0;i<6;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		
		for(int i=0;i<text.length();i++) {
			int t=(int)a[i]-110;
		    a[i]=(char)t;
		}
		for(int i=0;i<6;i++)
			System.out.print(a[i]);
		

	    //System.out.println("total no of 5's "+count+" last occurance is at "+pos+" result is "+temp1+" "+temp2);
	}

}

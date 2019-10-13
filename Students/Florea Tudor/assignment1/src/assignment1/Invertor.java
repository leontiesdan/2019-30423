package assignment1;

public class Invertor {
	
public static void main(String[] args) {
	
	System.out.println(invertName(null));
	System.out.println(invertName(""));
	System.out.println(invertName("Tudor"));
	System.out.println(invertName("Tudor Florea"));
	System.out.println(invertName("   Tudor   "));
	System.out.println(invertName("   Tudor   Florea   "));
	System.out.println(invertName("Mr. Tudor Florea"));
	System.out.println(invertName("     Mr.   Tudor     Florea  "));
	System.out.println(invertName("Mr. Phd. Tudor Florea"));
	System.out.println(invertName("     Mr.   Phd.    Tudor     Florea  "));
	
	
}
public static String invertName(String name)
{
	
	if(name!=null && name!="")
	{
		
		 name = name.trim().replaceAll(" +", " ");
		String name2=name;
		
		String arr[]=name2.split(" ");
	
		switch(arr.length) {
		case 2:
			name=arr[1]+", "+arr[0];
			break;
		case 3:
			name=arr[2]+", "+arr[1] + " "+  arr[0];
			break;
		case 4: name=arr[2]+", "+arr[3] + " " +  arr[0] + " "+ arr[1];
		    break;
		}
	}
		return name;
}
}

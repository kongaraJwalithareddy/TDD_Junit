public class Remove {
	public String remove(String string)
	{
		String s="";
		String b="";
		int length=string.length();
		if(length<1) return string;
		else if(length==1)
		{
			if(string.charAt(0)=='A')
			{
				s=b;
			}
			else if(string.charAt(0)!='A')
			{
				s+=string.substring(0);
			}
		}
		else if(length>=2)
		{
			if(string.charAt(0)== 'A' && string.charAt(1)=='A') {
				s+=string.substring(2);
			}
			else if(string.charAt(0)=='A' && string.charAt(1)!='A') {
				s+=string.substring(1);
			}
			else if(string.charAt(0)!='A' && string.charAt(1)=='A')
			{
				s+=string.charAt(0);
				s+=string.substring(2);
			}
			else if(string.charAt(0)!='A' && string.charAt(1)!='A')
			{
				s+=string.substring(0);
			}
		}
		return s;
	}
}
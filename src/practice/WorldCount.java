package practice;

public class WorldCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " vishal    lonika   mahajan       arora   ".trim();
		int worldCount = 0;
		
		if(!str.equals("")) {

			if(str.charAt(0) != ' ') {
				worldCount++;
			}
			for(int i=0; i < str.length(); i++) {
				
				if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
					worldCount++;
				}
			}		
		}
		System.out.println(worldCount);
		
		
		String str2 = " lonika mahajan vishal arora ".trim();		
		String arr[]=str2.split(" ");		
		System.out.println(arr.length);
	}

}

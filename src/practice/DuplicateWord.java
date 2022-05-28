package practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " lonika mahajan vishal arora lonika mahajan".trim();
		
		String array[] = str.split(" ");
		
		Map<String, Integer> hp = new HashMap<String, Integer>();
		
		for(int i=0; i < array.length; i++) {
			if(!hp.containsKey(array[i])) {
				hp.put(array[i], 1);
			}
			if(hp.containsKey(array[i])){
				hp.put(array[i], hp.get(array[i])+1);
			}
		}
		System.out.println(hp);
		for(Map.Entry<String, Integer> eachElement: hp.entrySet() ) {
			System.out.println(eachElement.getKey() + " - " + eachElement.getValue());
		}
		

	}

}

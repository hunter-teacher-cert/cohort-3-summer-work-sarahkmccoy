import java.util.ArrayList;
	public class lesson1{
//In SuperArray we were building some of the basic functions of ArrayList--a mutable array. 

	public static void main(String[] args){
		//note angle brackets
		ArrayList<String> words = new ArrayList<String>();
		//adding
		words.add("fish");//append
		words.add("fish2");
		words.add("fish3");
		words.add(1, "somethingelse");//add at index (overloaded)

		System.out.println(words);
		System.out.println(words.get(0));//access at index 0
		words.set(0, "notFish"); //overwrite at index 0
		System.out.println(words);//prints list in square brackets			
		System.out.println(words.get(words.size()-1));//last element
		
		
	}
	
}


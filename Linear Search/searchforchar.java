package searchalgorithm;

public class searchforchar {
public static void main(String[] args) {
	String name="mamatha";
	char target='t';
	String result=str(name,target);
	System.out.println(result);
}

static String str(String name, char target) {
	if(name.length()==0) {
		return "not found";
	}
	for(int i=0; i<name.length(); i++) {
		if(name.charAt(i)==target) {
			return "Found";
			
		}
	}
	return "not found";
}
}

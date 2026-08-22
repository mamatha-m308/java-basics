  //we use array list when we don't know the size of an array
public class Arraylist {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	//Syntax 
	ArrayList<Integer> list=new ArrayList<>();	
	list.add(27);
	list.add(32);
	list.add(54);
	list.add(56);
	list.add(87);
	list.add(98);
	
	System.out.println(list.contains(54));
	System.out.println(list.contains(433));
	System.out.println(list);
	
	//update array list
	list.set(0, 99);
	System.out.println(list);
	{
	//remove from array list
	list.remove(2);
	System.out.println(list);
	
	
	//input for array list
//	for(int i=0; i<5;i++) {
//   list.add(sc.nextInt());
//	      }
	
//	for(int i=0; i<5; i++) {
//		System.out.println(list.get(i));      pass index here
//	}
	
}
}
}

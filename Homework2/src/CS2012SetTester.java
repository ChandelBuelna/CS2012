
public class CS2012SetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {1,7,8,4,9};
		
		CS2012Set S1 = new CS2012Set();
		CS2012Set set1 = new CS2012Set(23, 1, 2, 4, 78, 9);
		CS2012Set set2 = new CS2012Set(4, 10, 29, 77, 34, 42, 17, 89, 47);
		CS2012Set S4 = new CS2012Set (array);
		
		//CS2012SetUtils setUtil = new CS2012SetUtils();
		
		System.out.println(set1.existsInSet(99));
		System.out.println(S4.toString());
		System.out.println(S1.toString());
		S1.addToSet(0);
		S4.addToSet(9);
		System.out.println(S1);
		set1.removeFromSet(9);
		System.out.println(set1.toString());
		System.out.println(set1.get(0));
		System.out.println(set1.size());
		
		System.out.println(CS2012SetUtils.union(set1, S1));
		System.out.println(CS2012SetUtils.intersection(set1, S1));
		
		
	}

}

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentReport> a1=new ArrayList<StudentReport>();
		StudentReport s1=new StudentReport("hope",10,550);
		StudentReport s2=new StudentReport("lizzie",11,575);
		StudentReport s3=new StudentReport("stefan",9,529);
		StudentReport s4=new StudentReport("mak",17,580);
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		System.out.println("----------------before sorting------------------");
		System.out.println(a1);
		Collections.sort(a1, new SortByMarks());
		
		System.out.println("----------------after sorting----------------");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
	}

}

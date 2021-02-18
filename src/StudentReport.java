import java.util.Comparator;

public class StudentReport {
	String name;
	int  roll_no,marks;
	
	public StudentReport(String name, int roll_no, int marks) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentFile [rollNo=" + roll_no + ", Name=" + name + ",marks=" + marks + "]";
	}
	

}
	 class SortByMarks implements Comparator<StudentReport>{

			@Override
			public int compare(StudentReport o1, StudentReport o2) {
				// TODO Auto-generated method stub
				return o1.marks-o2.marks;
	}
}


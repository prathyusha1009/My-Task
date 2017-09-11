import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
		StudentGroup sg=new StudentGroup(10);

	Date b=new Date(1996,10,10);
	Student st=new Student(569,"tom cruise",b,25);

                sg.addFirst(st);

              System.out.println(sg.getStudent(0).getId());






	}

}

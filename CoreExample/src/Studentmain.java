
public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(63);
		student.setName("sruthi");
		student.setClassName("12");
		student.setSchoolName("jnvs");

		student.setTelugumarks(50);
		student.setHindimarks(20);
		student.setMathsmarks(30);
		student.setSciencemarks(36);
		student.setSocialmarks(40);

		System.out.println("ID " + student.getId());
		System.out.println("name " + student.getClassName());
		System.out.println("schoolname " + student.getSchoolName());
		System.out.println("telugumarks " + student.getTelugumarks());
		System.out.println("hindimarks " + student.getHindimarks());
	}
}

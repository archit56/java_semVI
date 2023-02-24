// ask name, gender, age marks and max_marks of 5 subjects and prints its result, \t for tab

public class print_percent {
	public static void main(String[] args) {
		
		String name = args[0];
		String gender = args[1];
		int age = Integer.parseInt(args[2]);
		
		int marks = Integer.parseInt(args[3]);
		int max_marks = Integer.parseInt(args[4]);
		int perc = (marks*100)/max_marks;
		
		System.out.println(name + "\t" + age);
		System.out.println(gender + "\t" + perc + "%");
	}
}
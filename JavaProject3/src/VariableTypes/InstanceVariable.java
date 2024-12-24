package VariableTypes;

class StudentsMark{
	int mathMark;
	int scienceMark;
	int EnglishMark;
	int SocialMark;
}

public class InstanceVariable {
		public static void main(String[] args) {
			StudentsMark stud1= new StudentsMark();
			stud1.mathMark=80;
			stud1.scienceMark=40;
			stud1.EnglishMark=60;
			stud1.SocialMark=79;
			StudentsMark stud2=new StudentsMark();
			stud2.mathMark=50;
			stud2.scienceMark=80;
			stud2.EnglishMark=50;
			stud2.SocialMark=99;
			System.out.println("student1 Subject Marks");
			System.out.println("Maths: "+stud1.mathMark+"science:"+stud1.scienceMark+"English:"+stud1.EnglishMark+"Social:"+stud1.SocialMark);
			System.out.println("student2 Subject Marks");
			System.out.println("Maths: "+stud2.mathMark+"science:"+stud2.scienceMark+"English:"+stud2.EnglishMark+"Social:"+stud2.SocialMark);
	}
}
package Session7;

class Person
{
	public String name;
	public String birthDate;
	public int sleepy = 5;
	
	public Person(String name, String birthDate)
	{
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public void sleep()
	{
		sleepy -= 1;
	}
	public String toString()
	{
		return ("Name of Person = " + name + ", Date of birth = " + birthDate + ", Sleepiness = " + sleepy);
	}
}

class Mahasiswa extends Person
{
	public String name;
	public String birthDate;
	public String id;
	public int point;
	
	public Mahasiswa(String name, String birthDate, String id, int point)
	{
		super(name, birthDate);
		this.id = id;
		this.point = point;
	}
	
	public void helpingDosen()
	{
		point += 10;
	}
	public String toString()
	{
		return (super.toString() + "\nStudent id = " + id + ", current points =  " + point + "\n");
	}
}

class Dosen extends Person
{
	public String name;
	public String birthDate;
	public String code;
	public int point;
	
	public Dosen(String name, String birthDate, String code, int point)
	{
		super(name, birthDate);
		this.code = code;
		this.point = point;
	}
	public void teach()
	{
		point += 5;
	}
	public void p2m()
	{
		point += 4;
	}
	public void research()
	{
		point += 7;
	}
	public void selfDev()
	{
		point += 6;
	}
	public void otherWorks()
	{
		point += 3;
	}
	public String toString()
	{
		return (super.toString() + "\nLecturer code = " + code + ", current points =  " + point + "\n");
	}
}

public class Quiz_S7 {
	public static void main (String[] args)
	{
		Mahasiswa s1 = new Mahasiswa("Chuck", "2 March 2002", "2540125094", 30);
		Dosen d1 = new Dosen("Chock", "2 February 1982", "D0502", 60);
		System.out.println("Initial attributes of Mahasiswa s1: ");
		System.out.println(s1.toString());
		System.out.println("Initial attributes of Dosen d1: ");
		System.out.println(d1.toString());
		
		System.out.println("Mahasiswa s1 after calling sleep(-1 sleepiness) and helpingDosen(+10 points): ");
		s1.sleep();
		s1.helpingDosen();
		System.out.println(s1.toString());
		
		System.out.println("Dosen d1 after calling sleep(-1 sleepiness) and all other functions(+25 points): ");
		d1.sleep();
		d1.teach();
		d1.p2m();
		d1.research();
		d1.selfDev();
		d1.otherWorks();
		System.out.println(d1.toString());
	}
}

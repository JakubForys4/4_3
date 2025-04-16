public class Student {
  private String Name;
  private String LastName;
  private int Age;
  private String StudentId;

  public Student(String name, String lastName, int age, String studentId) {
    Name = name;
    LastName = lastName;
    Age = age;
    StudentId = studentId;
  }

  public String GetName() {return Name;}
  public String GetLastName() {return LastName;}
  public int GetAge() {return Age;}
  public String GetStudentId() {return StudentId;}

  public String ToString() {
    return Name + " " + LastName + " " + Integer.toString(Age) + " " + StudentId;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", "Error", -1, "");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
  }
}
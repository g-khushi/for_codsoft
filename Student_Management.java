import java.util.*;
class Student{
    String name;
    int rollno;
    int admnno;
    String grade;

    Student(String name, int rollno, int admnno, String grade)
    {
        this.name= name;
        this.rollno=rollno;
        this.admnno=admnno;
        this.grade=grade;
    }
    public int getRollNumber() { return rollno; }
    public int getAdmnNumber() { return admnno; }
    public String toString()
    {
    return "Name: " +name +"\nRollno: "+rollno +"\nAdmn no: "+admnno +"\nGrade: "+grade;
    }
}
public class Student_Management {
    static ArrayList<Student> students= new ArrayList<>();
         static Scanner obj= new Scanner(System.in);

        static void Add_Student()
        {
            obj.nextLine();
            System.out.println("Enter Name:");
            String name= obj.nextLine().trim();
            System.out.println("Enter Admn no:");
            int admnno= obj.nextInt();
            System.out.println("Enter Rollno:");
            int rollno= obj.nextInt();
            obj.nextLine();
            System.out.println("Enter Grade:");
            String grade= obj.nextLine().trim();

            if(name.isEmpty() || grade.isEmpty())
            {
                System.out.println("Name and Grade cannot be empty");
                return;
            }
            for(Student s: students)
            {
                if(s.getRollNumber()== rollno ||s.getAdmnNumber()== admnno)
                {
                    System.out.println("Roll no and Admn no cannot be same");
                    return;
                }

            }

             students.add(new Student(name, rollno, admnno, grade));
             System.out.println("Student Added");
             System.out.println();
        }
            static void Remove_Student()
            {
                System.out.println("Enter rollno and admnno to remove:");
                int rollno= obj.nextInt();
                int admnno= obj.nextInt();

                boolean found=false;

                Iterator<Student> iterator= students.iterator();
            while(iterator.hasNext())
             {
                   Student s= iterator.next();
                if(s.getAdmnNumber()== admnno && s.getRollNumber()== rollno)
                {
                    iterator.remove();
                    found = true;
                    System.out.println("Student Removed");
                    break;
                }
             }
              if (!found)
              {
                System.out.println("Student not found");
              }
            }
            static void Search()
            {
                System.out.print("Enter roll number to search: ");
                int rollno = obj.nextInt();
                System.out.print("Enter admn number to search: ");
                int admnno= obj.nextInt();

        for (Student s : students) {
            if (s.getRollNumber() == rollno && s.getAdmnNumber()== admnno) {
                System.out.println("Student found:");
                System.out.println(s);
                return;
            }
        }

        System.out.println(" Student not found.");
    }
            
            static void display()
            {
                if(students.isEmpty())
                {
                    System.out.println("No Student in list");
                }
                else
                {
                    System.out.println("Students list: \n");
                    for(Student s:students)
                    {
                        System.out.println(s);
                    }
                }
            }
           
        
        public static void main(String[] args)
    {
        
        while(true)
        {
            int choice;
            System.out.println("Student Management System");
            System.out.println("Enter 1 to Add Student");
            System.out.println("Enter 2 to Remove Student");
            System.out.println("Enter 3 to Search Student");
            System.out.println("Enter 4 to Display All Students");
            System.out.println("Enter 5 to Exit");
            
            choice = obj.nextInt();

            switch(choice)
            {
                case 1: Add_Student();
                        break;
                case 2: Remove_Student();
                        break;
                case 3: Search();
                        break;
                case 4: display();
                        break;
                case 5: System.out.println("Exiting: ");
                        return;
                default: System.out.println("Invalid");
            }
        }
    }
    
}

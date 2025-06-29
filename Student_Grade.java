import java.util.*;
class student
{
    Scanner obj= new Scanner(System.in);
    int totalsubjects;
    double marks[];
    String subjectname[];
    double total;
    double average;
   
   public student()
    {
    System.out.println("Enter total subjects");
    this.totalsubjects=obj.nextInt();
    obj.nextLine();
     this.marks= new double[totalsubjects];
    this.subjectname= new String[totalsubjects];
    
    }

    public void input()
    {
        for(int i=0;i<totalsubjects;i++)
        {
            System.out.print("Enter subject name:");
            subjectname[i]=obj.nextLine();
            
            System.out.print("Enter marks in "+subjectname[i]+": ");
            marks[i]=obj.nextDouble();

            obj.nextLine(); 
        }
    }
    public void Calculate_result()
    {
        for(int i=0; i<totalsubjects;i++)
        {
            total= marks[i]+total;
            average= total/totalsubjects;
        }
    }
        public void display()
        {
            for(int i=0;i<totalsubjects;i++)
            {
                System.out.print("SubjectName: "+subjectname[i] +"                   Marks:"+marks[i]);
                System.out.println();
            }
            System.out.println();
             System.out.println("Total marks: "+ total);
             System.out.println("Average: "+average);
        }
        public void grade()
        {
            if(average>100 || average<0)
            {
                System.out.println("Error");
            }
            else if(average>90 && average<100)
            {
                System.out.println("Outstanding Result   A+");
            }
            else if(average>80 && average<90)
            {
             System.out.println("Excellent Result      A");   
            }
            else if(average>70 && average<80)
            {
                System.out.println("Good Result     B");
            }
            else if(average>60 && average<70)
            {
                System.out.println(" Needs Improvement     C");
            }
            else if(average>50 && average>60)
            {
                System.out.println("Needs Improvement     D");
            }
            else
            {
                System.out.println("Fail   F");
            }
        }
    
}   
    public class Student_Grade
{
    public static void main(String args[])
    {
        student s= new student();
        s.input();
        System.out.println();
        s.Calculate_result();
        s.display();
        System.out.println();
        s.grade();

    }
}
import java.util.Scanner;

public class StudentMarks
{

private static Scanner scan;

public static void main(String[] args) 
{
  double[][] marksTable;

  double mark;
  int studentNo;
  int subjectNo;

 
  marksTable = new double[4][4];
  scan = new Scanner(System.in);

  for(studentNo = 1; studentNo <= 3; studentNo++)
  {
      System.out.print("Enter marks for student no " +studentNo);

      for (subjectNo = 1; subjectNo <= 3; subjectNo++)
      {
          System.out.print("Mark for student "+studentNo+" for subject no "+subjectNo+":");
          mark = scan.nextDouble();
          marksTable [studentNo] [subjectNo] = mark;
      }    
  }
} 
} 
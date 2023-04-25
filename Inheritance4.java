/*Define a class department with data members Department name, HOD name, a constructor and a function print department details define another class
staff member that extends the class department and contains data membbers staff name,staff qualification a constructor and a function print staff
details. Create object for the class staff and print all the details*/

import java.util.*;

class department{
String Dept_Name;
String HOD_Name;

department()
{

Scanner sc = new Scanner(System.in);
Dept_Name = sc.nextLine();
HOD_Name = sc.nextLine();

}
void print_department()
{
  System.out.println(Dept_Name);
  System.out.println(HOD_Name);
}
}

class staffmember extends department
{
 String staff_Name;
 String staff_Qualification;
 
staffmember()
{
  Scanner sc = new Scanner(System.in);
  staff_Name = sc.nextLine();
  staff_Qualification = sc.nextLine(); 
}
void print_staff_details()
{
  System.out.println(staff_Name);
  System.out.println(staff_Qualification);
}
}

class Inheritance4
{
 public static void main(String args[])
 {
  staffmember sm = new staffmember();
  sm.print_staff_details();
  sm.print_department();
 }
}
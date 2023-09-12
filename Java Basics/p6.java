import java.util.*;
class Staff{
	int code;
	String name;
	void put_data_staff(){
                Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Code of the Staff:");
	code = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the name of the Staff:");
	name = sc.nextLine();
        }
        void get_data_staff(){
            System.out.println("Details of the Staff:");
            System.out.println("Code: " + code);
            System.out.println("Name: " + name);
        }
    }

    class Teacher extends Staff{
        String subject, publication;
        void put_data_teacher(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Subject: ");
            subject = sc.nextLine();
            System.out.println("Enter the Publication:");
            publication = sc.nextLine();
        }
        void get_data_teacher(){
            System.out.println("Details of the Teacher:");
            System.out.println("Subject: " + subject);
            System.out.println("Publication: " + publication);
        }
    }

    class Typist extends Staff{
        int speed;
        void put_data_typist(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Speed(in wpm): ");
            speed = sc.nextInt();
        }
        void get_data_typist(){
            System.out.println("Details of the Typist:");
            System.out.println("Speed: " + speed);
        }
    }
    
    class Officer extends Staff{
        char grade;
        void put_data_officer(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Grade: ");
            grade = sc.next().charAt(0);
        }
        void get_data_officer(){
            System.out.println("Details of the Officer:");
            System.out.println("Grade: " + grade);
        }
    }

    class Regular extends Typist{}

    class Casual extends Typist{
        float daily_wages;
        void put_data_casual(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Daily Wages of Officer: ");
            daily_wages = sc.nextFloat();
        }
        void get_data_casual(){
            System.out.println("Details of the Casual:");
            System.out.println("Daily Wages: " + daily_wages);
        }
    }

public class p6{
	public static void main(String[] args){
        Staff st = new Staff();
        st.put_data_staff();
        st.get_data_staff();
        System.out.println();

        Teacher te = new Teacher();
        te.put_data_staff();
        te.put_data_teacher();
        te.get_data_staff();
        te.get_data_teacher();
        System.out.println();

        Typist ty = new Typist();
        ty.put_data_staff();
        ty.put_data_typist();
        ty.get_data_staff();
        ty.get_data_typist();
        System.out.println();

        Officer of = new Officer();
        of.put_data_staff();
        of.put_data_officer();
        of.get_data_staff();
        of.get_data_officer();
        System.out.println();

        Regular re = new Regular();
        re.put_data_staff();
        re.put_data_typist();
        System.out.println();

        Casual ca = new Casual();
        ca.put_data_staff();
        ca.put_data_typist();
        ca.get_data_typist();
        ca.get_data_casual();
    }
}

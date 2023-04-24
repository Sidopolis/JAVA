import java.util.Scanner;

abstract class Staff {
    String name;
    String address;
    void display() {}
}

class FullTimeStaff extends Staff{
    String dept;
    int sal;
    FullTimeStaff(String n, String add, String dept, int sal){
        this.name = n;
        this.address = add;
        this.dept = dept;
        this.sal = sal;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Department: "+dept);
        System.out.println("Salary: "+sal);
    }
}

class PartTimeStaff extends Staff{
    int no_of_hour;
    int rate;
    PartTimeStaff(String name, String add, int hour, int rate){
        this.name = name;
        this.no_of_hour = hour;
        this.address = add;
        this.rate = rate;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("No of hours: "+no_of_hour);
        System.out.println("Rate: "+rate);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, add, dept;
        int sal, hours, rate;
        System.out.println("1. Full Time\n2. Part Time\nEnter your choice:");
        int ch = sc.nextInt();
        System.out.println("Enter no of employees:");
        int n = sc.nextInt();
        switch (ch) {
            case 1:
                FullTimeStaff[] f = new FullTimeStaff[n];
                for(int i=0; i<n; i++){
                    System.out.println("Enter name:");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Enter address:");
                    add = sc.nextLine();
                    System.out.println("Enter Department:");
                    dept = sc.nextLine();
                    System.out.println("Enter Salary:");
                    sal = sc.nextInt();
                    f[i] = new FullTimeStaff(name, add, dept, sal);
                }
                for(int i=0; i<n; i++){
                    f[i].display();
                }
                break;
            case 2:
                PartTimeStaff[] p = new PartTimeStaff[n];
                for(int i=0; i<n; i++){
                    System.out.println("Enter name:");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Enter address:");
                    add = sc.nextLine();
                    System.out.println("Enter no of hours:");
                    hours = sc.nextInt();
                    System.out.println("Enter Rate:");
                    rate = sc.nextInt();
                    p[i] = new PartTimeStaff(name, add, hours, rate);
                }
                for(int i=0; i<n; i++){
                    p[i].display();
                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        sc.close();
    }
}
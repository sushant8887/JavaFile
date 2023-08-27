public class Employees 
    {
     String name = "Tom";
     double salary = 1500;

        public void displayInfo(){
        System.out.println(name +"" + salary);
    }
         public static void main(String[] args) {
        Employees emp = new Employees();
        System.out.println(emp.name);
    }
    
}

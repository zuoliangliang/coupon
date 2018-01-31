import java.io.*;
import java.lang.reflect.Constructor;

public class ObjectCreation implements Serializable{

    public static void main(String[] args) throws Exception {

        // By using new keyword
        Employee employee1 = new Employee();
        employee1.setName("employee1");
        System.out.println("employee1");

        Employee employee2 = (Employee) Class.forName("Employee").newInstance();
        employee2.setName("employee2");
        System.out.println("employee2");

        Employee employee3 = Employee.class.newInstance();
        employee3.setName("employee3");
        System.out.println("employee3");


        Employee employee4 = (Employee) employee1.clone();
        employee4.setName("employee4");
        System.out.println("employee4");

        Constructor<Employee> constructor = Employee.class.getConstructor();
        Employee employee5 = constructor.newInstance();
        employee5.setName("employee5");
        System.out.println("employee5");


        File file = new File("D:/employee1.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(employee1);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Employee employee6 = (Employee) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(employee6.getName());
        System.out.println("employee6");
    }
}

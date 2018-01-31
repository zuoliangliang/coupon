import java.io.Serializable;

public class Employee implements Cloneable, Serializable {


    private static final long serialVersionUID = 936851061521185752L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
        System.out.println("Employee Constructor Called...");
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }

    @Override
    protected Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}

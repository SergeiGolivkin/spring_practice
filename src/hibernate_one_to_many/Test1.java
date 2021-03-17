package hibernate_one_to_many;



import hibernate_one_to_many.entity.Department;
import hibernate_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {

//            session = factory.getCurrentSession();
//            Department department = new Department("IT", 1200, 300);
//            Employee employee1 = new Employee("Sergei", "Petrov", 800 );
//            Employee employee2 = new Employee("Oleg", "Ivanov", 600 );
//
//            department.addEmployeeDepartment(employee1);
//            department.addEmployeeDepartment(employee2);
//
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//****************************************************************************

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//**************************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();
            Employee employee = session.get(Employee.class, 1);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }


    }
}
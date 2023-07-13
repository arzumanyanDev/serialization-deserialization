import model.Employee;
import model.Organization;
import model.OrganizationList;
import model.Status;

public class GenerateOrganization {

    public OrganizationList generate() {

        // Создание списка организаций и добавление сотрудников
        Organization org1 = new Organization("Организация 1", "2023-01-01", Status.OPEN);
        org1.getEmployees().add(new Employee("Иванов Иван", "1990-01-01"));
        org1.getEmployees().add(new Employee("Петров Петр", "1995-05-05"));

        Organization org2 = new Organization("Организация 2", "2023-02-01", Status.CLOSE);
        org2.getEmployees().add(new Employee("Сидоров Алексей", "1985-03-15"));

        OrganizationList organizationList = new OrganizationList();
        organizationList.getOrganizations().add(org1);
        organizationList.getOrganizations().add(org2);
        return organizationList;
    }
}

package hollow.special.operation.app;

import hollow.special.operation.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("hollow special operation");

        // cara menggunakan innerclass
        Company.Employee employee = company.new Employee();
        employee.setName("shoukaku");

        // memanggil name company di class employee
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}

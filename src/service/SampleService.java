package service;

import domain.Employees;
import repository.EmployeesRepository;
import repository.connection.ConnectionHandling;
import repository.impl.EmployeesRepositoryImpl;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * smattern on 09/10/16.
 */
public class SampleService {

    private static final Logger log = Logger.getLogger(SampleService.class.getName());

    private EmployeesRepository employeesRepository;

    /**
     * Do same action.
     */
    public void doSampleAction() {
        ConnectionHandling conn = new ConnectionHandling();
        conn.beginConnection();
        EmployeesRepository repository = new EmployeesRepositoryImpl(conn);
        ArrayList<Employees> resultList = repository.getEmployeeByName("Max");

        for (Employees employees : resultList) {
            log.log(Level.INFO,
                    employees.getFirstName() + ", "
                            + employees.getLastName() + ", "
                            + employees.getSalaries().getSalary());
        }
        conn.endConnection();

    }// end method

    /**
     * Aux.
     */
    private void showRecords(String name) {

    }// end method
}

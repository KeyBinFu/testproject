package com.fubin.code.poly;

public class PloyParameter {

    public static void main(String[] args) {

        PloyParameter ployParameter = new PloyParameter();
        Worker work = new Worker("work", 3000);
        Manager manager = new Manager("manager", 5000, 20000);
        ployParameter.testWork(work);
        ployParameter.showEmpAnnual(work);
        ployParameter.testWork(manager);
        ployParameter.showEmpAnnual(manager);
    }

    public void showEmpAnnual(Employee employee) {
        System.out.println(employee.getAnnual());
    }

    public void testWork(Employee employee) {
        if (employee instanceof Worker) {
            ((Worker) employee).work();
        } else if (employee instanceof Manager) {
            ((Manager) employee).Manage();
        } else {

        }
    }
}

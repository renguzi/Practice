package com.atguigu.Generics.GenericMethod;

/**
 * @Author:asher
 * @Date:2020/8/6 16:35
 * @Description:com.atguigu.Generics.GenericMethod
 * @Version:1.0
 */
public class Test {
    @org.junit.jupiter.api.Test
    public void test() {
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.add( new Customer());


        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.delete(new Employee());

    }

}

package com.atguigu.Generics.GenericMethod;

import java.util.List;

/**
 * @Author:asher
 * @Date:2020/8/6 16:34
 * @Description:com.atguigu.Generics.GenericMethod
 * @Version:1.0
 */
public class CustomerDAO extends DAO<Customer> {
    @Override
    public void add(Customer customer) {
        super.add(customer);
    }

    @Override
    public void delete(Customer customer) {
        super.delete(customer);
    }

    @Override
    public void update(Customer customer) {
        super.update(customer);
    }

    @Override
    public Customer select() {
        return super.select();
    }

    @Override
    public List<Customer> selectAll() {
        return super.selectAll();
    }
}

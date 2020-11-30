package com.atguigu.Generics.exer;

import java.util.*;

/**
 * @Author:asher
 * @Date:2020/8/8 11:07
 * @Description:com.atguigu.Generics.exer
 * @Version:1.0
 */
public class DAO<T> {
    private Map<String, T> map;

    public Map<String, T> getMap() {
        return map;
    }

    public void setMap(Map<String, T> map) {
        this.map = map;
    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        if (map.containsKey(id)) {
            map.replace(id, entity);
        }
    }

    public List<T> list() {
//        第一种正确的写法：
//        List<T> list = new ArrayList<>();
//        Set<Map.Entry<String, T>> entries = map.entrySet();
//        Iterator<Map.Entry<String, T>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            list.add(iterator.next().getValue());
//        }
//        return list;
//        第二种写法：
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t : values) {
            list.add(t);
        }
        return list;

//        下面是错误的写法
//        Collection<T> values = map.values();
//        System.out.println(values.lass().getName());
//        System.out.println(values.getClass());
//        return (List<T>) values;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

package com.xiexing.dao;

import com.xiexing.entities.Stu;

import java.util.List;

public interface StuMapper {

    void save(Stu stu);

    boolean update(Stu stu);

    boolean delete(int id);

    Stu findById(int id);

    List<Stu> finAll();

    Stu login(Stu stu);
}

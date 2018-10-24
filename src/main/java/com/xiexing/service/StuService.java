package com.xiexing.service;

import com.xiexing.dao.StuMapper;
import com.xiexing.entities.Stu;

import java.util.List;

public class StuService {

    private StuMapper stuMapper;

    /**
     * 保存数据
     *
     * @param stu
     */
    public void save(Stu stu) {
        stuMapper.save(stu);

    }

    /**
     * 修改数据
     *
     * @param stu
     * @return
     */
    public boolean update(Stu stu) {
        return stuMapper.update(stu);

    }

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    public boolean delete(int id) {
        return stuMapper.delete(id);
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    public Stu findById(int id) {
        return stuMapper.findById(id);
    }

    /**
     * 查询所有数据
     *
     * @return
     */
    public List<Stu> findAll() {
        return stuMapper.finAll();
    }

    /**
     * 登录验证
     *
     * @param stu
     * @return
     */
    public Stu login(Stu stu) {
        return stuMapper.login(stu);
    }

}

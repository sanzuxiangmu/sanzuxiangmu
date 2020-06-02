package com.jk.mapper;


import model.InfomationBean;
import model.Tree;
import model.UserBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from t_order")
    List<UserBean> select();

    @Select("delete from t_order where id = #{id}")
    String delete(String ids);

    @Insert("insert into t_order (name,price,time) values (#{name},#{price},now())")
    void addUser(UserBean userBean);

    @Select("select id , text , href , pid from t_crmtree where pid=#{id}")
    List<Tree> selectTreeById(Integer id);

    @Select("select * from t_crmInfomation")
    List<InfomationBean> selectInfomationBean();


    @Select("delete from t_crmInfomation where id = #{id}")
    void deleteJiGou(String id);


    @Insert("insert into t_crmInfomation (mecname,meclevelname,provincename,peopled,name,status) values (#{mecname},#{meclevelname},#{provincename},#{peopled},#{name},#{status})")
    void addJiGouaaa(InfomationBean infomationBean);



    /*@Select("select * from t_order where id = ${id}")
    UserBean queryhuixian(Integer id);*/

    /*@Update("update t_order set name = #{name} , price = #{price} where id = #{id}")
    void updateUser(UserBean userBean);

    @Select("select * from t_order where id = ${id}")
    UserBean queryhuixian(Integer id);*/
}

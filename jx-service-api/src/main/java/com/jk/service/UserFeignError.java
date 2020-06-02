package com.jk.service;

import model.InfomationBean;
import model.Tree;
import model.UserBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1.创建要给熔断器类并且实现FeignClient接口
//2.在类上添加Component注解，注入到Spring容器中
@Component
public class UserFeignError implements UserService{
    public String hello() {
        return "请求失败....请检查网络问题";
    }

    public Map<String,Object> testHystrix1() {
        Map<String,Object> resultMap = new HashMap<String, Object>();
        resultMap.put("value" , "-1");
        resultMap.put("message" , "系统维护中。。。");
        return resultMap;
    }

    public List<UserBean> select() {
        return null;
    }

    public String delete(String id) {
        return null;
    }

    public void addUser(UserBean userBean) {

    }

    public List<Tree> selectTree() {
        return null;
    }

    public List<InfomationBean> selectInfomationBean() {
        return null;
    }

    public String deleteJiGou(String id) {
        return null;
    }

    public void addJiGouaaa(InfomationBean infomationBean) {

    }



    /*public void updateUser(UserBean userBean) {

    }

    public UserBean queryhuixian(Integer id) {
        return null;
    }*/


}

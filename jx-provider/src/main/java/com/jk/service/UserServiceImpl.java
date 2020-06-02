package com.jk.service;


import com.jk.mapper.UserMapper;
import model.InfomationBean;
import model.Tree;
import model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    @Override
    public String hello() {
        return "调用成功...";
    }

    @Override
    public Map<String,Object> testHystrix1() {
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("value" , "1");
        resultMap.put("message" , "请求成功。。。");
        return resultMap;
    }

    @Override
    @RequestMapping("/select")
    public List<UserBean> select() {
        List<UserBean> list = userMapper.select();
        return list;
    }

    @Override
    @RequestMapping("/delete")
    public String delete(@RequestParam("id") String id) {
        userMapper.delete(id);
        return "删除成功";
    }

    @Override
    public void addUser(@RequestBody UserBean userBean) {
        userMapper.addUser(userBean);
    }

    @Override
    public List<Tree> selectTree() {
        return selectChildrenNode(-1);
    }



    private List<Tree> selectChildrenNode(Integer id){
        List<Tree> menuList = userMapper.selectTreeById(id);
        for (Tree menu : menuList) {
            List<Tree> nodeList = selectChildrenNode(menu.getId());
            if(nodeList != null && !nodeList.isEmpty()) {
                menu.setNodes(nodeList);
                menu.setSelecttable(false); // 当前节点是否能点击，false不能点
            } else {
                menu.setSelecttable(true); // true能点
            }
        }
        return menuList;
    }



    /*@Override
    @RequestMapping("/queryhuixian")
    public UserBean queryhuixian(@RequestParam Integer id) {
        return userMapper.queryhuixian(id);
    }*/

    /*@Override
    @RequestMapping("/updateUser")
    public void updateUser(UserBean userBean) {
        userMapper.updateUser(userBean);
    }
    */
    /*@Override
    @RequestMapping("/queryhuixian")
    public UserBean queryhuixian(Integer id) {
        return userMapper.queryhuixian(id);
    }*/

    @Override
    public List<InfomationBean> selectInfomationBean() {
        List<InfomationBean> list2 = userMapper.selectInfomationBean();
        return list2;
    }

    @Override
    @RequestMapping("/deleteJiGou")
    public String deleteJiGou(String id) {
        userMapper.deleteJiGou(id);
        return "删除成功";
    }

    @Override
    public void addJiGouaaa(@RequestBody InfomationBean infomationBean) {
        userMapper.addJiGouaaa(infomationBean);
    }
}

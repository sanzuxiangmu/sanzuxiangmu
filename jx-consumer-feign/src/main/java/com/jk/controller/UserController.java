package com.jk.controller;


import com.jk.service.UserService;
import model.InfomationBean;
import model.Tree;
import model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return userService.hello();
    }

    @GetMapping("/testHystrix1")
    public Map<String,Object> testHystrix1(){
        return userService.testHystrix1();
    }

    //跳首页
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    //查询
    @RequestMapping("/select")
    @ResponseBody
    public List<UserBean> select(){
        List<UserBean> list = userService.select();
        return list;
    }

    //删除
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(String id){
        return userService.delete(id);
    }


    //新增跳转页面
    @GetMapping("/toadd")
    public String toadd(){
        return "addCommodity";
    }
    //新增
    @PostMapping("/addUser")
    @ResponseBody
    public String addUser(UserBean userBean){
        userService.addUser(userBean);
        return "新增成功...";
    }
/*
    //修改(带着id查询一条数据)
    @RequestMapping("/toupdate")
    public ModelAndView toupdate(@RequestParam Integer id){
        UserBean uu=  userService.queryhuixian(id);
        UserBean u = new UserBean();
        ModelAndView modelAndView = new ModelAndView();
        List<UserBean> list = redisTemplate.opsForList().range("colist",0,-1);
      for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).getId()==id){
                c = list.get(i);
            }
        }

        modelAndView.setViewName("updateCommodity");
        modelAndView.addObject("uu",u);
        return modelAndView;
    }

    //修改
    @PostMapping("/updateUser")
    @ResponseBody
    public String updateUser(UserBean userBean){
        userService.updateUser(userBean);
        return "修改成功";
    }
*/
    /*@RequestMapping("/toupdate")
    public ModelAndView toupdate(@RequestParam Integer id){
        UserBean uu=  userService.queryhuixian(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("updateCommodity");
        modelAndView.addObject("uu",uu);
        return modelAndView;
    }*/

    //跳树首页
    @RequestMapping("/indexs")
    public String indexs(){
        return "indexs";
    }

    //树查询
    @RequestMapping("/selectTree")
    @ResponseBody
    public List<Tree> selectTree(){
        List<Tree> lists = userService.selectTree();
        return lists;
    }


    @RequestMapping("/toInfoList")
    public String toInfoList(){
        return "list";
    }
    //信息管理(查询)
    @RequestMapping("/selectInfomationBean")
    @ResponseBody
    public List<InfomationBean> selectInfomationBean(){
        List<InfomationBean> list2 = userService.selectInfomationBean();
        return list2;
    }

    //删除机构
    @RequestMapping("/deleteJiGou")
    @ResponseBody
    public String deleteJiGou(String id){
        return userService.deleteJiGou(id);
    }

    //新增机构跳转页面
    @GetMapping("/toadds")
    public String toadds(){
        return "addJiGou";
    }
    //新增机构
    @PostMapping("/addJiGouaaa")
    @ResponseBody
    public String addJiGouaaa(InfomationBean infomationBean){
        userService.addJiGouaaa(infomationBean);
        return "新增成功...";
    }


}

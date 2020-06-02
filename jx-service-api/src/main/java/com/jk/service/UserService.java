package com.jk.service;


import model.InfomationBean;
import model.Tree;
import model.UserBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "jx-provider" , fallback = UserFeignError.class)
public interface UserService {

    @GetMapping("/hello")
    String hello();


    @GetMapping("/testHystrix1")
    Map<String,Object> testHystrix1();


    @RequestMapping("/select")
    List<UserBean> select();


    @RequestMapping("/delete")
    String delete(@RequestParam("id") String id);

    @PostMapping("/addUser")
    void addUser(UserBean userBean);


    @RequestMapping("/selectTree")
    List<Tree> selectTree();


    @RequestMapping("/selectInfomationBean")
    List<InfomationBean> selectInfomationBean();


    @RequestMapping("/deleteJiGou")
    String deleteJiGou(@RequestParam("id") String id);


    @PostMapping("/addJiGouaaa")
    void addJiGouaaa(InfomationBean infomationBean);





    /*UserBean queryhuixian(@RequestParam Integer id);*/

    /*@PostMapping("/updateUser")
    void updateUser(@RequestBody UserBean userBean);*/

    /*@PostMapping("/queryhuixian")
    UserBean queryhuixian(@RequestParam Integer id);*/
}

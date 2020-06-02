package model;

import lombok.Data;

import java.util.List;


@Data
//Erp管理系统的树
public class ErpTree {

    private Integer id;
    private String text;
    private String href;
    private Integer pid;
    private List<Tree> nodes;
    private Boolean selecttable;
}

package model;

import java.util.List;

import lombok.Data;

@Data
//客户资源信息管理后台的树
public class Tree {
	
	private Integer id;
	private String text;
	private String href;
	private Integer pid;
	private List<Tree> nodes;
	private Boolean selecttable;

}

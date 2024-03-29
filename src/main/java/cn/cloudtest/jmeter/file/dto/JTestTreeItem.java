package cn.cloudtest.jmeter.file.dto;

import org.apache.jmeter.testelement.TestElement;

/**
 * 返回jmeter的树节点
 * 
 * @author win10
 *
 */
public class JTestTreeItem {

	private int pid;// 父节点id，为0为根节点
	private TestElement content;// 内容
	private int id;// 自身节点id
	private String text;// 前台的显示名称
	private String url;// 跳转url
	private String className;// element的类
	private String menuName;
	private String icon;
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	

	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public TestElement getContent() {
		return content;
	}

	public void setContent(TestElement content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public JTestTreeItem(){
		
	}

}

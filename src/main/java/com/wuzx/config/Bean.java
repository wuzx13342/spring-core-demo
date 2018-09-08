package com.wuzx.config;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuzhixiang
 *
 */
public class Bean {

	private String name;//姓名

	private String className;//班级

	private String scope="singleton";//得分

	private List<Property> properties=new ArrayList<Property>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

}

package com.zc.pojo;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class pp {
private int id;
private String name;
private String ctime;
public pp() {
	super();
}
public pp(int id, String name, String ctime) {
	super();
	this.id = id;
	this.name = name;
	this.ctime = ctime;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCtime() {
	return ctime;
}
public void setCtime(String ctime) {
	this.ctime = ctime;
}

}

package schedulers;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class userda {	
@Id
private String id;
private String uname;
private String phno;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return uname;
}
public void setName(String name) {
	this.uname = name;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "user [id=" + id + ", name=" + name + ", phno=" + phno + "]";
}

}

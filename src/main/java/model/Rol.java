package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "rol")
@NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r")
public class Rol {

	@Id
	@Column(name = "idrol")
	private int idrol; 
	
	@Column(name = "rolName")
	private String rolname; 
	
	@Column(name = "rolStatus")
	private int rolstatus; 
	
	public Rol() {}

	public int getIdrol() {
		return idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getRolname() {
		return rolname;
	}

	public void setRolname(String rolname) {
		this.rolname = rolname;
	}

	public int getRolstatus() {
		return rolstatus;
	}

	public void setRolstatus(int rolstatus) {
		this.rolstatus = rolstatus;
	}
	
	
	
}

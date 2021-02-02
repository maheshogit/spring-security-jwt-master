package io.javabrains.springsecurityjwt.entity;


import javax.persistence.*;

@Entity
@Table(name="rolem_tbl")
public class RoleEntity {
	@Id
	@GeneratedValue
	private int role_id;
	@Column(name="role")
	private String role;

	public RoleEntity() {
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}

package spcbl.org.bd.osp.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_roles")
public class Roles {
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "name")
    private String name;

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

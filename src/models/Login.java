package models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

//import sk.security.Hash;

@Entity
public class Login implements Serializable {
        private static final long serialVersionUID = 1769955608L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @Column(nullable = false, length = 50, unique = true)
        private String username;
        @Column(nullable = false, length = 128) //MySQL CHAR not working , columnDefinition = "CHAR")
        private String password;
        @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch = FetchType.EAGER)
        private Set<Role> roles = new HashSet<Role>();

        public Login() {
        }

        public Login(String username, String password) {
                super();
                this.username = username;
                this.password = password;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public String getPassword() {
                return password;
        }

        public void setRoles(Set<Role> roles) {
                this.roles = roles;
        }

        public Set<Role> getRoles() {
                return roles;
        }

}
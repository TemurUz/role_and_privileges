//package temur.uz.springsecurityandrole.entity;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.Collection;
//
//@Data
//@NoArgsConstructor
//@Entity
//@Table(name = "privileges")
//public class Privilege {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    private String name;
//
//    @ManyToMany(mappedBy = "privileges")
//    private Collection<Role> roles;
//
//    public Privilege(String name) {
//        this.name = name;
//    }
//}

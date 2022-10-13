package org.tektutor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="customer")
@Entity
public class Customer {
    @Id
    private int id; 
    private String firstname;
    private String lastname;
    private String email;
}

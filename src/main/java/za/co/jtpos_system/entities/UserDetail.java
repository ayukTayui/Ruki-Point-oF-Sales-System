package za.co.jtpos_system.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDetail {
	@Id
	@GeneratedValue
	private int userId;
	private String name;
	private String surname;
	private String email;
	private String homeAddress;
	private long contact;
	@OneToOne
        private LoginDetail login;
	
}

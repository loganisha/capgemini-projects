package a;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contact {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String name;

	@Column
	private String email;

	@Column
	private String country;

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub

	}

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEmail(Object email2) {
		// TODO Auto-generated method stub

	}

	public Object getCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCountry(Object country2) {
		// TODO Auto-generated method stub

	}

}

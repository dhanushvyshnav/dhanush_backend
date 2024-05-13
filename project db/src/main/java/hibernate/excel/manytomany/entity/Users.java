package hibernate.excel.manytomany.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name ="email" )
	private String email;
	
	@Column(name ="password" )
	private String password;
	
	@Column(name ="is_organization" )
	private Boolean is_organization;
	
	@Column(name ="created_at" )
	private String created_at;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "Organization_id")
	private List<Organization> organizations;
}

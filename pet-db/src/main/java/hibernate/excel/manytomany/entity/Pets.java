package hibernate.excel.manytomany.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "pets")
public class Pets 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="pet_id" )
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "Organization_id", referencedColumnName = "id")
	private Organization o_id;
	
	@Column(name ="name" )
	private String name;
	
	@Column(name ="species" )	
	private String species;
	
	@Column(name ="breed" )
	private String breed;
	
	@Column(name ="pet_age" )
	private int age;
	
	@Column(name ="gender" )
	private String gender;
	
	@Column(name ="size" )
	private int size;
	
	@Column(name ="url" )
	private String url;
	
	@Column(name ="fee" )
	private Double fee;
	
	@Column(name ="is_adpoted" )
	private Boolean is_adopted;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Organization organizations;

}

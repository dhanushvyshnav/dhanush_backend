package hibernate.excel.manytomany.entity;

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
@Table(name = "Applications")
public class Application 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="application_id" )
	private int id;
	
	@Column(name ="status" )
	private String status;
	
	@Column(name ="date" )
	private String application_date;
	
	@Column(name ="approval_date" )
	private String approval_date;
	
	@ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id")
    private Pets pet;
	
}

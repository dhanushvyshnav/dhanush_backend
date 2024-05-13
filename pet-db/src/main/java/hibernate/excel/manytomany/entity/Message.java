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
@Table(name = "message")
public class Message 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name ="message_id" )
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users sender_id;
	
	@ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users receiver_id;
	
	@Column(name ="subject")
	private String subject;
	
	@Column(name ="contact_info")
	private String content;
	
	@Column(name ="send_at" )
	private String sent_at;
	
	@Column(name ="is_read" )
	private Boolean is_read;

	@ManyToOne
    @JoinColumn(name = "sender_id")
    private Users sender;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private Users user;
	
	
}

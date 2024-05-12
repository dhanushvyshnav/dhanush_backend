package hibernate.excel.manytomany.entity;

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
	private int id;
	private String subject;
	private String content;
	private String sent_at;
	private Boolean is_read;

	@ManyToOne
    @JoinColumn(name = "sender_id")
    private Users sender;
	

	@ManyToOne
    @JoinColumn(name = "receiver_id")
    private Users receiver;
	
	
}

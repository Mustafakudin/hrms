package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity  // veritabanında baglanmayı saglıyoruz
@Table(name="users")

public class User {
	@Id             //primer key oldugunu belirtiyorr
	@GeneratedValue
	@Column(name="id")
	private int id ;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;

}
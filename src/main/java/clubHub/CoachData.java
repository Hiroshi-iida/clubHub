package clubHub;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class CoachData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@NotNull
	private int id;

	@Column(nullable = false)
	@Length(max = 10, message = "10文字以下で設定してください")
	@NotEmpty(message = "空白NG")
	private String lastName;

	@Column(nullable = false)
	@NotEmpty(message = "空白NG")
	@Length(max = 10, message = "10文字以下で設定してください")
	private String firstName;

	@Column(nullable = false)
	@NotEmpty(message = "空白NG")
	private String job;

	@Column(nullable = false)
	@Email(message = "正しく入力してください")
	@NotEmpty(message = "空白NG")
	private String mail;

	@Column(nullable = false)
	@NotEmpty(message = "空白NG")
	private String password;

	@Column(nullable = false)
	@NotEmpty(message = "空白NG")
	private String area;

	@Column(nullable = true)
	private String address;

	@Column(nullable = true)
	private String tel;

	@Column(nullable = true)
	@Length(max = 400, message = "400文字以下で設定してください")
	private String experience;

	@Column(nullable = true)
	@Length(max = 400, message = "400文字以下で設定してください")
	private String message;

	@Column(length=100000)
	private String image;
	
	@Column
	private boolean authentication;	//メール認証
	
	public boolean isAuthentication() {
		return authentication;
	}

	public void setAuthentication(boolean authentication) {
		this.authentication = authentication;
	}
	@Column
	private String uuid;
	

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

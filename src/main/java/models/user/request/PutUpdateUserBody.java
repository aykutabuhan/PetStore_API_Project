package models.user.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PutUpdateUserBody {
	private String firstName;
	private String lastName;
	private String password;
	private int userStatus;
	private String phone;
	private int id;
	private String email;
	private String username;
}
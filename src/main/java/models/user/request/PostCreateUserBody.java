package models.user.request;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostCreateUserBody {
	private List<ResponseItem> response;

	@Data
	@Builder
	public static class ResponseItem{
		private String firstName;
		private String lastName;
		private String password;
		private int userStatus;
		private String phone;
		private int id;
		private String email;
		private String username;
	}
}
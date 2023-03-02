package models.user.response;

import lombok.Data;

@Data
public class PostCreateUserResponse {
	private int code;
	private String type;
	private String message;
}
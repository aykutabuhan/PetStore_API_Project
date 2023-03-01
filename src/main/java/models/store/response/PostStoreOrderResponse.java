package models.store.response;

import lombok.Data;

@Data
public class PostStoreOrderResponse {
	private int petId;
	private int quantity;
	private int id;
	private String shipDate;
	private boolean complete;
	private String status;
}
package models.store.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostStoreOrderPet {
	private int petId;
	private int quantity;
	private int id;
	private String shipDate;
	private boolean complete;
	private String status;
}
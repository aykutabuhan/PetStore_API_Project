package models.pets.request;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PutPetBodyUpdate {
	private List<String> photoUrls;
	private String name;
	private int id;
	private Category category;
	private List<TagsItemUpdate> tags;
	private String status;

	@Data
	@Builder
	public static class Category{
		private String name;
		private int id;
	}

	@Data
	@Builder
	public static class TagsItemUpdate {
		private String name;
		private int id;
	}
}
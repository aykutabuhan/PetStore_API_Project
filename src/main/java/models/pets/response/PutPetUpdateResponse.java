package models.pets.response;

import java.util.List;
import lombok.Getter;

@Getter
public class PutPetUpdateResponse {
	private List<String> photoUrls;
	private String name;
	private long id;
	private Category category;
	private List<TagsItem> tags;
	private String status;

	@Getter
	public static class Category{
		private String name;
		private int id;
	}

	@Getter
	public static class TagsItem{
		private String name;
		private int id;
	}
}
package models.pets.request;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostPetBody {

	private int id;
	private Category category;
	private String name;
	private List<String> photoUrls;
	private List<TagsItem> tags;
	private String status;

	@Data
	@Builder
	public static class Category{
		private String name;
		private int id;
	}
	@Data
	@Builder
	public static class TagsItem{
		private String name;
		private int id;
	}
}
package models.pets.response;

import lombok.Getter;

import java.util.List;
@Getter
public class PostPetResponse {
    private List<String> photoUrls;
    private String name;
    private Object id;
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

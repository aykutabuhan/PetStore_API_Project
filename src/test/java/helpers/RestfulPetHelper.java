package helpers;

import client.RestClient;
import io.restassured.response.Response;
import models.pets.request.PostPetBody;

import java.util.*;

public class RestfulPetHelper extends RestClient {

    public RestfulPetHelper() {
        super("https://petstore.swagger.io/");
    }

    public Response createNewPet(){
        PostPetBody.Category category = PostPetBody.Category.builder().id(1).name("Dogs").build();
        ArrayList <String> photos = new ArrayList<>();
        photos.add("The Front Photo");

        PostPetBody.TagsItem tagsItem = PostPetBody.TagsItem.builder().name("Rotation Number").id(1001).build();
        HashMap<String, Object> item = new HashMap<>();
        item.put("id", 1001);
        item.put("name", "rotation number");

        PostPetBody postPetBody = PostPetBody.builder().id(101).category(category).name("Fındık").photoUrls(photos)
                .tags(item).status("available").build();

        return post("v2/pet", null, null, postPetBody);
    }
}

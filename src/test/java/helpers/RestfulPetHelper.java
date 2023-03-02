package helpers;

import client.RestClient;
import io.restassured.response.Response;
import models.pets.request.PostPetBody;
import models.pets.request.PutPetBodyUpdate;

import java.util.*;

public class RestfulPetHelper extends RestClient {

    public RestfulPetHelper() {
        super("https://petstore.swagger.io/");
    }

    public Response createNewPet(){
        PostPetBody.TagsItem tagsItem = PostPetBody.TagsItem.builder().id(11).name("Bulldog").build();
        PostPetBody.TagsItem tagsItem2 = PostPetBody.TagsItem.builder().id(12).name("Golden").build();
        List<PostPetBody.TagsItem> items = new ArrayList<>();
        items.add(tagsItem);
        items.add(tagsItem2);

        PostPetBody.Category category = PostPetBody.Category.builder().id(11).name("Dog").build();

        List<String> photos = new ArrayList<>();
        photos.add("Front");
        photos.add("Back");

        PostPetBody petBody = PostPetBody.builder().id(1).category(category).name("Franko").photoUrls(photos)
                .tags(items).status("avaliable").build();

        return post("v2/pet", null, null, petBody);
    }

    public Response getPetWithID(int ID){
        return get("v2/pet/" +ID, null, null, null);
    }

    public Response putUpdatePet(){
        PutPetBodyUpdate.TagsItemUpdate tagsItemUpdate = PutPetBodyUpdate.TagsItemUpdate.builder().id(22)
                .name("French Bulldog").build();
        List<PutPetBodyUpdate.TagsItemUpdate> itemUpdates = new ArrayList<>();
        itemUpdates.add(tagsItemUpdate);

        PutPetBodyUpdate.Category category = PutPetBodyUpdate.Category.builder().id(22).name("Big Dog").build();

        List <String> photos = new ArrayList<>();
        photos.add("Right Side");
        photos.add("Left Side");

        PutPetBodyUpdate putPetBodyUpdate = PutPetBodyUpdate.builder().id(2).category(category).name("Marco")
                .photoUrls(photos).tags(itemUpdates).status("Non avaliable").build();

        return put("v2/pet", null, null, putPetBodyUpdate);
    }
}

package tests.pet;

import helpers.RestfulPetHelper;
import io.restassured.response.Response;
import models.pets.response.PostPetResponse;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PostPetTest {

    RestfulPetHelper m_helper = new RestfulPetHelper();

    @Test
    public void postPetTest(){
        Response response = m_helper.createNewPet();

        Assert.assertEquals(response.as(PostPetResponse.class).getId(), 1);
        Assert.assertEquals(response.as(PostPetResponse.class).getCategory().getId(), 11);
        Assert.assertEquals(response.as(PostPetResponse.class).getCategory().getName(), "Dog");
        Assert.assertEquals(response.as(PostPetResponse.class).getName(), "Franko");
        Assert.assertEquals(response.as(PostPetResponse.class).getPhotoUrls().get(0), "Front");
        Assert.assertEquals(response.as(PostPetResponse.class).getPhotoUrls().get(1), "Back");
        Assert.assertEquals(response.as(PostPetResponse.class).getTags().get(0).getId(), 11);
        Assert.assertEquals(response.as(PostPetResponse.class).getTags().get(0).getName(), "Bulldog");
        Assert.assertEquals(response.as(PostPetResponse.class).getTags().get(1).getId(), 12);
        Assert.assertEquals(response.as(PostPetResponse.class).getTags().get(1).getName(), "Golden");
        Assert.assertEquals(response.as(PostPetResponse.class).getStatus(), "avaliable");

        response.then().statusCode(200);
    }
}

package tests.pet;

import helpers.RestfulPetHelper;
import io.restassured.response.Response;
import models.pets.response.PutPetUpdateResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PutUpdatePetTest {

    RestfulPetHelper m_helper = new RestfulPetHelper();

    @Test
    public void updatePetTest(){
        Response response = m_helper.putUpdatePet();

        Assert.assertEquals(response.as(PutPetUpdateResponse.class).getId(), 2);
        Assert.assertEquals(response.as(PutPetUpdateResponse.class).getCategory().getId(), 22);
        Assert.assertEquals(response.as(PutPetUpdateResponse.class).getCategory().getName(), "Big Dog");
        Assert.assertEquals(response.as(PutPetUpdateResponse.class).getName(), "Marco");
        Assert.assertEquals(response.as(PutPetUpdateResponse.class).getPhotoUrls().get(0), "Right Side");
        Assert.assertEquals(response.as(PutPetUpdateResponse.class).getPhotoUrls().get(1), "Left Side");
        Assert.assertEquals(response.as(PutPetUpdateResponse.class).getTags().get(0).getId(), 22);
        Assert.assertEquals(response.as(PutPetUpdateResponse.class).getTags().get(0).getName(), "French Bulldog");
        Assert.assertEquals(response.as(PutPetUpdateResponse.class).getStatus(), "Non avaliable");

        response.then().statusCode(200);
    }
}

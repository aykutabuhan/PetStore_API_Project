package tests.pet;

import helpers.RestfulPetHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class PostPetTest {

    RestfulPetHelper m_helper = new RestfulPetHelper();

    @Test
    public void postPetTest(){
        Response response = m_helper.createNewPet();

        response.then().statusCode(200);
    }

}

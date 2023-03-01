package tests.pet;

import helpers.RestfulPetHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetPetTest {

    RestfulPetHelper m_helper = new RestfulPetHelper();

    @Test
    public void getPetTest(){
        Response response = m_helper.getPetWithID(2);

        response.then().statusCode(200);
    }
}

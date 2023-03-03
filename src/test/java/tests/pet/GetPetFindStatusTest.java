package tests.pet;

import helpers.RestfulPetHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetPetFindStatusTest {

    RestfulPetHelper m_helper = new RestfulPetHelper();

    @Test
    public void getPetWithStatus(){
        Response response = m_helper.getPetFindByStatus();

        response.then().statusCode(200);
    }
}

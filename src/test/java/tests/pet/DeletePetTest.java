package tests.pet;

import helpers.RestfulPetHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DeletePetTest {

    RestfulPetHelper m_helper = new RestfulPetHelper();

    @Test
    public void deletePedWithIDTest(){
        Response response = m_helper.deletePedWithID();

        response.then().statusCode(200);
    }
}

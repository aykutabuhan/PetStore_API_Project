package tests.pet;

import helpers.RestfulPetHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import util.PropertyUtil;

public class GetPetTest {

    RestfulPetHelper m_helper = new RestfulPetHelper();

    private static final int petID = Integer.parseInt(PropertyUtil.getProperty("id", "PetID.property"));

    @Test
    public void getPetTest(){
        Response response = m_helper.getPetWithID(petID);

        response.then().statusCode(200);
    }
}

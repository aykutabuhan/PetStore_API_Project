package tests.store;

import helpers.RestfulStoreHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetPetOrderTest {

    RestfulStoreHelper m_helper = new RestfulStoreHelper();

    @Test
    public void getPetOrderTest(){
        Response response = m_helper.getPetOrder();

        response.then().statusCode(200);
    }
}

package tests.store;

import helpers.RestfulStoreHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DeletePetOrderTest {

    RestfulStoreHelper m_helper = new RestfulStoreHelper();

    @Test
    public void deletePetOrderTest(){
        Response response = m_helper.deletePetOrder();

        response.then().statusCode(200);
    }
}

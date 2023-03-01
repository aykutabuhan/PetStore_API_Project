package tests.store;

import helpers.RestfulStoreHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetPetOrderInventoryTest {

    RestfulStoreHelper m_helper = new RestfulStoreHelper();

    @Test
    public void getStoreInventoryTest(){
        Response response = m_helper.getStoreInventory();

        response.then().statusCode(200);
    }
}

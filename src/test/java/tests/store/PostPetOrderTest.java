package tests.store;

import helpers.RestfulStoreHelper;
import io.restassured.response.Response;
import models.store.response.PostStoreOrderResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyUtil;

import java.io.IOException;

public class PostPetOrderTest {

    RestfulStoreHelper m_helper = new RestfulStoreHelper();

    @Test
    public void postOrderTest() throws IOException {
        Response response = m_helper.postPetOrder();

        PropertyUtil.setProperty("StoreID.property", "id", response.as(PostStoreOrderResponse.class)
                .getId());

        Assert.assertEquals(response.as(PostStoreOrderResponse.class).getId(), 1);
        Assert.assertEquals(response.as(PostStoreOrderResponse.class).getPetId(), 101);
        Assert.assertEquals(response.as(PostStoreOrderResponse.class).getQuantity(), 2);
        Assert.assertEquals(response.as(PostStoreOrderResponse.class).getShipDate(), "2023-02-28T00:00:00.000+0000");
        Assert.assertEquals(response.as(PostStoreOrderResponse.class).getStatus(), "On the way");
        Assert.assertFalse(response.as(PostStoreOrderResponse.class).isComplete());

        response.then().statusCode(200);
    }
}

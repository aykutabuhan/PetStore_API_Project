package helpers;

import client.RestClient;
import io.restassured.response.Response;
import models.store.request.PostStoreOrderPet;
import util.PropertyUtil;

public class RestfulStoreHelper extends RestClient {

    private static final String BASE_URL = "https://petstore.swagger.io/v2/store/";
    private static final String PET_ID = PropertyUtil.getProperty("id", "StoreID.property");

    public RestfulStoreHelper() {
        super(BASE_URL);
    }
    public Response postPetOrder(){
        PostStoreOrderPet postStoreOrderPet = PostStoreOrderPet.builder().id(1).petId(101).quantity(2)
                .shipDate("2023-02-28T00:00:00.000+0000").status("On the way").complete(false).build();

        return post("order", null,null, postStoreOrderPet);
    }
    public Response getPetOrder(){
        return get("order/" + PET_ID, null, null, null);
    }
    public Response deletePetOrder(){
        return delete("order/".concat(PET_ID), null, null , null);
    }

    public Response getStoreInventory(){
        return get("/inventory", null,null,null);
    }
}

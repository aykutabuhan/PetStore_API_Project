package helpers;

import client.RestClient;
import io.restassured.response.Response;
import models.user.request.PostCreateUserBody;

import java.util.ArrayList;
import java.util.List;

public class RestfulUserHelper extends RestClient {

    private static final String BASE_URL = "https://petstore.swagger.io/v2/user/";

    public RestfulUserHelper() {
        super(BASE_URL);
    }

    public Response postCreateUser() {
        PostCreateUserBody.ResponseItem postCreateUserBody = PostCreateUserBody.ResponseItem.builder().id(1).username("Doglover")
                .firstName("Alex").lastName("Maritano").email("alex@gmail.com").password("01010101").phone("112233")
                .userStatus(11).build();

        PostCreateUserBody.ResponseItem postCreateUserBody2 = PostCreateUserBody.ResponseItem.builder().id(2).username("Catlover")
                .firstName("Ronaldo").lastName("Murcelago").email("ronaldo@gmail.com").password("101010").phone("332211")
                .userStatus(112).build();

        List<PostCreateUserBody.ResponseItem> item = new ArrayList<>();
        item.add(postCreateUserBody);
        item.add(postCreateUserBody2);


        return post("createWithArray", null, null, item);
    }

    public Response getUsername(){
        return get("user2", null, null, null);
    }
}

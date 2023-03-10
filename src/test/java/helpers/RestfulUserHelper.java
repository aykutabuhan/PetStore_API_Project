package helpers;

import client.RestClient;
import io.restassured.response.Response;
import models.user.request.PostCreateUserBody;
import models.user.request.PutUpdateUserBody;
import util.PropertyUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RestfulUserHelper extends RestClient {

    private static final String BASE_URL = "https://petstore.swagger.io/v2/user/";

    public RestfulUserHelper() {
        super(BASE_URL);
    }

    public Response postCreateUser() throws IOException {
        PostCreateUserBody.ResponseItem postCreateUserBody = PostCreateUserBody.ResponseItem.builder().id(1).username("Doglover")
                .firstName("Alex").lastName("Maritano").email("alex@gmail.com").password("01010101").phone("112233")
                .userStatus(11).build();

        PostCreateUserBody.ResponseItem postCreateUserBody2 = PostCreateUserBody.ResponseItem.builder().id(2).username("Catlover")
                .firstName("Ronaldo").lastName("Murcelago").email("ronaldo@gmail.com").password("101010").phone("332211")
                .userStatus(112).build();

        List<PostCreateUserBody.ResponseItem> item = new ArrayList<>();
        item.add(postCreateUserBody);
        item.add(postCreateUserBody2);

        PropertyUtil.setProperty("Username.property", "username",postCreateUserBody.getUsername());

        return post("createWithArray", null, null, item);
    }

    public Response getUsername(){
        return get(PropertyUtil.getProperty("username", "Username.property"),
                null, null, null);
    }

    public Response putUpdateUser() throws IOException {
        PutUpdateUserBody userBody = PutUpdateUserBody.builder().id(121).username("Birdlover").firstName("John")
                .lastName("Collins").email("john@gmail.com").password("998877").phone("778899").userStatus(123).build();

        PropertyUtil.setProperty("Username.property", "username",userBody.getUsername());

        return put("Doglover", null,null,userBody);
    }

    public Response deleteUser(){
        return delete("".concat(PropertyUtil.getProperty("username", "Username.property")), null, null, null);
    }
}

package tests.user;

import helpers.RestfulUserHelper;
import io.restassured.response.Response;
import models.user.response.PostCreateUserResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class PostCreateUserTest {

    RestfulUserHelper m_helper = new RestfulUserHelper();

    @Test
    public void postCreateUserTest() throws IOException {
        Response response = m_helper.postCreateUser();

        Assert.assertEquals(response.as(PostCreateUserResponse.class).getMessage(), "ok");
        Assert.assertEquals(response.as(PostCreateUserResponse.class).getType(), "unknown");
        Assert.assertEquals(response.as(PostCreateUserResponse.class).getCode(), 200);

     //   PropertyUtil.setProperty("Username.property", "username", response.as(PostCreateUserBody.ResponseItem.class)
      //          .getUsername());

        response.then().statusCode(200);
    }
}

package tests.user;

import helpers.RestfulUserHelper;
import io.restassured.response.Response;
import models.user.response.PostCreateUserResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class PutUpdateUserTest {

    RestfulUserHelper m_helper = new RestfulUserHelper();

    @Test
    public void putUpdateUserTest() throws IOException {
        Response response = m_helper.putUpdateUser();

        Assert.assertEquals(response.as(PostCreateUserResponse.class).getCode(), 200);
        Assert.assertEquals(response.as(PostCreateUserResponse.class).getType(), "unknown");
        Assert.assertEquals(response.as(PostCreateUserResponse.class).getMessage(), "121");

        response.then().statusCode(200);
    }
}

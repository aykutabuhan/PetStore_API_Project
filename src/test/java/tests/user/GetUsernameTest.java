package tests.user;

import helpers.RestfulUserHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetUsernameTest {

    RestfulUserHelper m_helper = new RestfulUserHelper();

    @Test
    public void getUsernameTest(){
        Response response = m_helper.getUsername();

        response.then().statusCode(200);
    }
}

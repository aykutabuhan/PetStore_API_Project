package tests.user;

import helpers.RestfulUserHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DeleteUserTest {

    RestfulUserHelper m_helper = new RestfulUserHelper();

    @Test
    public void deleteUserTest(){
        Response response = m_helper.deleteUser();

        response.then().statusCode(200);
    }
}

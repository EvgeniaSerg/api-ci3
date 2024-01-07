import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class TestPost {


    @Test
    void shouldReturnResultOfCheckPostman() {
        // Given - When - Then
// Предусловия
         given()
                .baseUri("https://postman-echo.com")
                .body("Kanikuly") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                 .body("data", equalTo("Kanikuly"))
         ;

    }
}
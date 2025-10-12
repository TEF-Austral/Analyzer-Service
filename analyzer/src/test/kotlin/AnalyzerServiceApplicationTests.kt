package analyzer

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.runApplication

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class AnalyzerServiceApplicationTests {

    @Test
    fun contextLoads() {
        // Verifies that the Spring context loads.
    }

    @Test
    fun applicationStartsAndStops() {
        assertDoesNotThrow {
            val ctx =
                runApplication<AnalyzerServiceApplication>(
                    "--spring.main.web-application-type=none",
                )
            ctx.close()
        }
    }
}

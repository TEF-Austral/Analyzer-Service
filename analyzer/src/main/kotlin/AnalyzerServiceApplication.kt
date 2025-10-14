package analyzer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AnalyzerServiceApplication

fun main(args: Array<String>) {
    runApplication<AnalyzerServiceApplication>(*args)
}

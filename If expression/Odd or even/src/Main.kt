import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    println(if (Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine()) % 2 == 0) "EVEN" else "ODD")
}
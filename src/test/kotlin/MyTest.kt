import assertk.assertThat
import assertk.assertions.isEqualTo
import org.testng.annotations.Test

class MyTest {
    @Test
    fun test1() {
        val res = 2+2
        assertThat(res).isEqualTo(4)
    }

    @Test
    fun test2() {
        val res = 2-2
        assertThat(res).isEqualTo(4)
    }
}
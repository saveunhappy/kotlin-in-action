package ch06.ex1_8_2_LateinitializedProperties1

import org.junit.Before
import org.junit.Test
import org.junit.Assert

class MyService {
    fun performAction(): String = "foo"
}
//这个方法比较好，以后如果写项目的话就用这个方式
class MyTest {
    //这个方法比较好
    private lateinit var myService: MyService

    @Before fun setUp() {
        myService = MyService()
    }

    @Test fun testAction() {
        Assert.assertEquals("foo",
            myService.performAction())
    }
}

package com.tandemdiabetes.codecovpoc

import com.tandemdiabetes.codecovpoc.fullcontrol.FullControlUtility
import com.tandemdiabetes.codecovpoc.mobilebolus.MobilebolusUtility
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testAddition() {
        val util = Utility()
        assertEquals(4, util.add(3, 1))
    }

    @Test
    fun testFCAddition() {
        val util = FullControlUtility()
        assertEquals(4, util.addFcNumbers(3, 1))
    }

    @Test
    fun testMbAddition() {
        val util = MobilebolusUtility()
        assertEquals(4, util.addMbNumbers(3, 1))
    }
}
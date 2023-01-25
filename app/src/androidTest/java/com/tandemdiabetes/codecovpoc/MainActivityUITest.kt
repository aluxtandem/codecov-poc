package com.tandemdiabetes.codecovpoc

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule

import org.junit.Test

import org.junit.Rule

class MainActivityUITest {

    @Rule
    @JvmField
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun clickButtonToChangeText() {
        onView(withId(R.id.button))
            .check(matches(isDisplayed()))
            .perform(click())
        onView(withId(R.id.textView)).check(matches(withText("Hello World!")))
    }
}
package com.dannndi.getstarted.data

import androidx.annotation.RawRes
import com.dannndi.getstarted.R

class GetStartedData(@RawRes val resId: Int, val title: String, val desc: String)

val listData = listOf(
    GetStartedData(
        R.raw.ill_goal,
        "Define Your Goal",
        "Aliquam pharetra tortor nec odio pellentesque dignissim. Etiam ultricies sollicitudin est sit amet rutrum.",
    ),
    GetStartedData(
        R.raw.ill_ilustration,
        "Green Marketing",
        "Maecenas gravida, ipsum eget ultricies cursus, nisl lectus ullamcorper mi, egestas blandit mi sem vitae lorem.",
    ),
    GetStartedData(
        R.raw.ill_ilustration_1,
        "Clear Task",
        "Vestibulum interdum dolor sit amet orci pulvinar, id mattis mi laoreet. Aliquam venenatis metus velit, in fringilla urna fermentum id.",
    ),
    GetStartedData(
        R.raw.ill_security,
        "Secured Storage",
        "Vivamus convallis odio posuere, tempus nulla eget, ullamcorper erat. In ut tortor consequat, pharetra ex id, interdum mauris.",
    ),
)
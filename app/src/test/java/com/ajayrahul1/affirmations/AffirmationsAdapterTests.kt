package com.ajayrahul1.affirmations

import com.ajayrahul1.affirmations.model.Affirmation
import org.junit.Test
import org.junit.runner.manipulation.Ordering.Context
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    private val context : Context? = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
    }
}
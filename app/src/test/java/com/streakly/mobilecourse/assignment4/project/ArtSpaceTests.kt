package com.streakly.mobilecourse.assignment4.project

import org.junit.Assert.assertEquals
import org.junit.Test

class ArtSpaceTests {
    @Test
    fun nextIndex_onLastArtwork_returnsFirst() {
        assertEquals(0, nextIndex(current = 2, size = 3))
    }

    @Test
    fun previousIndex_onFirstArtwork_returnsLast() {
        assertEquals(2, previousIndex(current = 0, size = 3))
    }
}
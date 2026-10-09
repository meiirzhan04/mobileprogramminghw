package com.streakly.mobilecourse.assignment4.project


internal fun nextIndex(current: Int, size: Int): Int = (current + 1) % size

internal fun previousIndex(current: Int, size: Int): Int = (current - 1 + size) % size
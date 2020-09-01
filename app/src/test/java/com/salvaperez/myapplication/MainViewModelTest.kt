package com.salvaperez.myapplication

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    private lateinit var vm: MainViewModel

    @Before
    fun setUp() {
        vm = MainViewModel()
    }

    @Test
    fun `is first letter in range A-Z`() {
        val isValidRegex = vm.checkTextWithRegex("Test")
        assertEquals(true, isValidRegex)
    }

    @Test
    fun `First letter in not in range A-Z`() {
        val isValidRegex = vm.checkTextWithRegex("test")
        assertEquals(false, isValidRegex)
    }

    @Test
    fun `First character with number return false`() {
        val isValidRegex = vm.checkTextWithRegex("1test")
        assertEquals(false, isValidRegex)
    }

}
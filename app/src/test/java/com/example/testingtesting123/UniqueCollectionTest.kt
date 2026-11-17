package com.example.testingtesting123

import org.junit.Before
import org.junit.Test

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }


    // TODO 1: Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        assert(collection.size()== 0)
        collection.addItem(Item("Item1"))
        assert(collection.get(0) == Item("Item1"))

        collection.addItem(Item(("Item2") ))
        assert(collection.size() == 2)
        assert(collection.get(1) == Item(("Item2") ))


    }

    // TODO 2: Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        assert(collection.size() == 0){"UniqueCollection was non-empty on initalization"}

        collection.addItem(Item("Item1"))
        collection.addItem(Item("Item2"))
        collection.addItem(Item("Item1"))

        assert(collection.size() == 2){"Duplicate Items were added"}
    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size();

        assert(originalSize == 2 && newSize == 0) {"Items not cleared"}
    }
}
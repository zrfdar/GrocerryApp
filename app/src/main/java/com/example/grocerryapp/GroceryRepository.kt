package com.example.grocerryapp

class GroceryRepository(private val db:GroceryDatabase) {
    fun insert(items: GroceryItems) = db.getGroceryDao().insert(items)
    fun delete(items: GroceryItems) = db.getGroceryDao().delete(items)

    fun getAllItems() = db.getGroceryDao().getAllGroceryItems()
}
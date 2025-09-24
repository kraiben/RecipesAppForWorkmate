package com.gab.recipesappforworkmate.domain.entities

enum class DishType(name: String) {
    MAIN_COURSE("main course"),
    SIDE_DISH("side dish"),
    DESSERT("dessert"),
    APPETIZER("appetizer"),
    SALAD("salad"),
    BREAD("bread"),
    BREAKFAST("breakfast"),
    SOUP("soup"),
    BEVERAGE("beverage"),
    SAUCE("sauce"),
    MARINADE("marinade"),
    FINGERFOOD("fingerfood"),
    SNACK("snack"),
    DRINK("drink"),
    NONE("");

    companion object {
        fun getByName(name: String): DishType {
            return when (name) {
                MAIN_COURSE.name -> MAIN_COURSE
                SIDE_DISH.name -> SIDE_DISH
                DESSERT.name -> DESSERT
                APPETIZER.name -> APPETIZER
                SALAD.name -> SALAD
                BREAD.name -> BREAD
                BREAKFAST.name -> BREAKFAST
                SOUP.name -> SOUP
                BEVERAGE.name -> BEVERAGE
                SAUCE.name -> SAUCE
                MARINADE.name -> MARINADE
                FINGERFOOD.name -> FINGERFOOD
                SNACK.name -> SNACK
                DRINK.name -> DRINK
                else -> NONE
            }
        }
    }
}

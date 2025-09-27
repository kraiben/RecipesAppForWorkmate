package com.gab.recipesappforworkmate.domain.models

enum class DishType(val typeName: String) {
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
        fun fromName(name: String): DishType {
            return when (name) {
                MAIN_COURSE.typeName -> MAIN_COURSE
                SIDE_DISH.typeName -> SIDE_DISH
                DESSERT.typeName -> DESSERT
                APPETIZER.typeName -> APPETIZER
                SALAD.typeName -> SALAD
                BREAD.typeName -> BREAD
                BREAKFAST.typeName -> BREAKFAST
                SOUP.typeName -> SOUP
                BEVERAGE.typeName -> BEVERAGE
                SAUCE.typeName -> SAUCE
                MARINADE.typeName -> MARINADE
                FINGERFOOD.typeName -> FINGERFOOD
                SNACK.typeName -> SNACK
                DRINK.typeName -> DRINK
                else -> NONE
            }
        }
    }
}

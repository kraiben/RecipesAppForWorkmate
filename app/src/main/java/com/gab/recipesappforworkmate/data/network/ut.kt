//package com.gab.recipesappforworkmate.data.network
//
//const val apiKey = "c631f4a7c3d04d5ea0dd6eca94bce350"
//const val query =
//    "https://api.spoonacular.com/recipes/complexSearch?apiKey=5fb57f356cfc416893baa1d3837af645&instructionsRequired=true&fillIngredients=true&addRecipeInformation=true&addRecipeInstructions=true&number=50&offset=0"
//val someShit = {
//    "results": [
//    {
//        "id": 715415,
//        "image": "https://img.spoonacular.com/recipes/715415-312x231.jpg",
//        "title": "Red Lentil Soup with Chicken and Turnips",
//        "readyInMinutes": 55,
//        "extendedIngredients": [
//        {
//            "id": 9037,
//            "image": "avocado.jpg",
//            "name": "additional toppings: avocado",
//            "original": "additional toppings: diced avocado, micro greens, chopped basil)",
//            "originalName": "additional toppings: diced avocado, micro greens, chopped basil)",
//            "amount": 8.0,
//            "unit": "servings",
//            "meta": [
//            "diced",
//            "chopped"
//            ],
//            "measures": {
//            "us": {
//            "amount": 8.0,
//            "unitShort": "servings",
//            "unitLong": "servings"
//        },
//            "metric": {
//            "amount": 8.0,
//            "unitShort": "servings",
//            "unitLong": "servings"
//        }
//        }
//        },
//        {
//            "id": 11124,
//            "aisle": "Produce",
//            "image": "sliced-carrot.png",
//            "consistency": "SOLID",
//            "name": "carrots",
//            "nameClean": "carrots",
//            "original": "3 medium carrots, peeled and diced",
//            "originalName": "carrots, peeled and diced",
//            "amount": 3.0,
//            "unit": "medium",
//            "meta": [
//            "diced",
//            "peeled"
//            ],
//            "measures": {
//            "us": {
//            "amount": 3.0,
//            "unitShort": "medium",
//            "unitLong": "mediums"
//        },
//            "metric": {
//            "amount": 3.0,
//            "unitShort": "medium",
//            "unitLong": "mediums"
//        }
//        }
//        },
//        ],
//        "summary": "Red Lentil Soup with Chicken and Turnips might be a good recipe to expand your main course repertoire. This recipe serves 8 and costs $3.0 per serving. One serving contains <b>477 calories</b>, <b>27g of protein</b>, and <b>20g of fat</b>. It is brought to you by Pink When. 1866 people have tried and liked this recipe. It can be enjoyed any time, but it is especially good for <b>Autumn</b>. From preparation to the plate, this recipe takes approximately <b>55 minutes</b>. It is a good option if you're following a <b>gluten free and dairy free</b> diet. Head to the store and pick up salt and pepper, canned tomatoes, flat leaf parsley, and a few other things to make it today. Overall, this recipe earns a <b>spectacular spoonacular score of 99%</b>. If you like this recipe, you might also like recipes such as <a href=\"https://spoonacular.com/recipes/red-lentil-and-chicken-soup-682185\">Red Lentil and Chicken Soup</a>, <a href=\"https://spoonacular.com/recipes/red-lentil-and-chicken-soup-1058971\">Red Lentil and Chicken Soup</a>, and <a href=\"https://spoonacular.com/recipes/red-lentil-soup-34121\">Red-Lentil Soup</a>.",
//        "dishTypes": [
//        "lunch",
//        "soup",
//        "main course",
//        "main dish",
//        "dinner"
//        ],
//        "analyzedInstructions": [
//        {
//            "name": "",
//            "steps": [
//            {
//                "number": 1,
//                "step": "To a large dutch oven or soup pot, heat the olive oil over medium heat.",
//                "ingredients": [
//                {
//                    "id": 4053,
//                    "name": "olive oil",
//                    "localizedName": "olive oil",
//                    "image": "olive-oil.jpg"
//                },
//                {
//                    "id": 0,
//                    "name": "soup",
//                    "localizedName": "soup",
//                    "image": ""
//                }
//                ],
//                "equipment": [
//                {
//                    "id": 404667,
//                    "name": "dutch oven",
//                    "localizedName": "dutch oven",
//                    "image": "https://spoonacular.com/cdn/equipment_100x100/dutch-oven.jpg"
//                }
//                ]
//            },
//            {
//                "number": 2,
//                "step": "Add the onion, carrots and celery and cook for 8-10 minutes or until tender, stirring occasionally.",
//                "ingredients": [
//                {
//                    "id": 11124,
//                    "name": "carrot",
//                    "localizedName": "carrot",
//                    "image": "sliced-carrot.png"
//                },
//                {
//                    "id": 11143,
//                    "name": "celery",
//                    "localizedName": "celery",
//                    "image": "celery.jpg"
//                },
//                {
//                    "id": 11282,
//                    "name": "onion",
//                    "localizedName": "onion",
//                    "image": "brown-onion.png"
//                }
//                ],
//                "equipment": [],
//                "length": {
//                "number": 10,
//                "unit": "minutes"
//            }
//            },
//            {
//                "number": 3,
//                "step": "Add the garlic and cook for an additional 2 minutes, or until fragrant. Season conservatively with a pinch of salt and black pepper.To the pot, add the tomatoes, turnip and red lentils. Stir to combine. Stir in the vegetable stock and increase the heat on the stove to high. Bring the soup to a boil and then reduce to a simmer. Simmer for 20 minutes or until the turnips are tender and the lentils are cooked through.",
//                "ingredients": [
//                {
//                    "id": 1102047,
//                    "name": "salt and pepper",
//                    "localizedName": "salt and pepper",
//                    "image": "salt-and-pepper.jpg"
//                },
//                {
//                    "id": 6615,
//                    "name": "vegetable stock",
//                    "localizedName": "vegetable stock",
//                    "image": "chicken-broth.png"
//                },
//                {
//                    "id": 10016069,
//                    "name": "red lentils",
//                    "localizedName": "red lentils",
//                    "image": "red-lentils.png"
//                },
//                {
//                    "id": 11529,
//                    "name": "tomato",
//                    "localizedName": "tomato",
//                    "image": "tomato.png"
//                },
//                {
//                    "id": 10316069,
//                    "name": "lentils",
//                    "localizedName": "lentils",
//                    "image": "lentils-brown.jpg"
//                },
//                {
//                    "id": 11564,
//                    "name": "turnip",
//                    "localizedName": "turnip",
//                    "image": "turnips.png"
//                },
//                {
//                    "id": 11215,
//                    "name": "garlic",
//                    "localizedName": "garlic",
//                    "image": "garlic.png"
//                },
//                {
//                    "id": 0,
//                    "name": "soup",
//                    "localizedName": "soup",
//                    "image": ""
//                }
//                ],
//                "equipment": [
//                {
//                    "id": 404794,
//                    "name": "stove",
//                    "localizedName": "stove",
//                    "image": "https://spoonacular.com/cdn/equipment_100x100/oven.jpg"
//                },
//                {
//                    "id": 404752,
//                    "name": "pot",
//                    "localizedName": "pot",
//                    "image": "https://spoonacular.com/cdn/equipment_100x100/stock-pot.jpg"
//                }
//                ],
//                "length": {
//                "number": 22,
//                "unit": "minutes"
//            }
//            },
//            {
//                "number": 4,
//                "step": "Add the chicken breast and parsley. Cook for an additional 5 minutes. Adjust seasoning to taste.",
//                "ingredients": [
//                {
//                    "id": 5062,
//                    "name": "chicken breast",
//                    "localizedName": "chicken breast",
//                    "image": "chicken-breasts.png"
//                },
//                {
//                    "id": 1042027,
//                    "name": "seasoning",
//                    "localizedName": "seasoning",
//                    "image": "seasoning.png"
//                },
//                {
//                    "id": 11297,
//                    "name": "parsley",
//                    "localizedName": "parsley",
//                    "image": "parsley.jpg"
//                }
//                ],
//                "equipment": [],
//                "length": {
//                "number": 5,
//                "unit": "minutes"
//            }
//            },
//            {
//                "number": 5,
//                "step": "Serve the soup immediately garnished with fresh parsley and any additional toppings. Enjoy!",
//                "ingredients": [
//                {
//                    "id": 10511297,
//                    "name": "fresh parsley",
//                    "localizedName": "fresh parsley",
//                    "image": "parsley.jpg"
//                },
//                {
//                    "id": 0,
//                    "name": "soup",
//                    "localizedName": "soup",
//                    "image": ""
//                }
//                ],
//                "equipment": []
//            }
//            ]
//        }
//        ]
//    },
//
//    {
//        "id": 716406,
//        "image": "https://img.spoonacular.com/recipes/716406-312x231.jpg",
//        "imageType": "jpg",
//        "title": "Asparagus and Pea Soup: Real Convenience Food",
//        "readyInMinutes": 20,
//        "servings": 2,
//        "sourceUrl": "https://fullbellysisters.blogspot.com/2011/03/asparagus-and-pea-soup-real-convenience.html",
//        "vegetarian": true,
//        "vegan": true,
//        "glutenFree": true,
//        "dairyFree": true,
//        "veryHealthy": true,
//        "cheap": false,
//        "veryPopular": false,
//        "sustainable": false,
//        "lowFodmap": false,
//        "weightWatcherSmartPoints": 2,
//        "gaps": "GAPS_4",
//        "preparationMinutes": null,
//        "cookingMinutes": null,
//        "aggregateLikes": 207,
//        "healthScore": 100.0,
//        "creditsText": "Full Belly Sisters",
//        "license": "CC BY-SA 3.0",
//        "sourceName": "Full Belly Sisters",
//        "pricePerServing": 178.37,
//        "extendedIngredients": [
//        {
//            "id": 11011,
//            "aisle": "Produce",
//            "image": "asparagus.png",
//            "consistency": "SOLID",
//            "name": "asparagus",
//            "nameClean": "asparagus",
//            "original": "1 bag of frozen organic asparagus (preferably thawed)",
//            "originalName": "frozen organic asparagus (preferably thawed)",
//            "amount": 1.0,
//            "unit": "bag",
//            "meta": [
//            "frozen",
//            "organic",
//            "thawed",
//            "(preferably )"
//            ],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "bag",
//            "unitLong": "bag"
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "bag",
//            "unitLong": "bag"
//        }
//        }
//        },
//        {
//            "id": 1034053,
//            "aisle": "Oil, Vinegar, Salad Dressing",
//            "image": "olive-oil.jpg",
//            "consistency": "LIQUID",
//            "name": "evoo",
//            "nameClean": "evoo",
//            "original": "1T EVOO (extra virgin olive oil)",
//            "originalName": "EVOO (extra virgin olive oil)",
//            "amount": 1.0,
//            "unit": "T",
//            "meta": [
//            "(extra virgin olive oil)"
//            ],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "Tbsp",
//            "unitLong": "Tbsp"
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "Tbsp",
//            "unitLong": "Tbsp"
//        }
//        }
//        },
//        {
//            "id": 11215,
//            "aisle": "Produce",
//            "image": "garlic.png",
//            "consistency": "SOLID",
//            "name": "garlic",
//            "nameClean": "garlic",
//            "original": "a couple of garlic cloves",
//            "originalName": "a couple of garlic",
//            "amount": 2.0,
//            "unit": "cloves",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "cloves",
//            "unitLong": "cloves"
//        },
//            "metric": {
//            "amount": 2.0,
//            "unitShort": "cloves",
//            "unitLong": "cloves"
//        }
//        }
//        },
//        {
//            "id": 11282,
//            "aisle": "Produce",
//            "image": "brown-onion.png",
//            "consistency": "SOLID",
//            "name": "onion",
//            "nameClean": "onion",
//            "original": "1/2 onion",
//            "originalName": "onion",
//            "amount": 0.5,
//            "unit": "",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 0.5,
//            "unitShort": "",
//            "unitLong": ""
//        },
//            "metric": {
//            "amount": 0.5,
//            "unitShort": "",
//            "unitLong": ""
//        }
//        }
//        },
//        {
//            "id": 11304,
//            "aisle": "Produce",
//            "image": "peas.jpg",
//            "consistency": "SOLID",
//            "name": "peas",
//            "nameClean": "peas",
//            "original": "2-3c of frozen organic peas",
//            "originalName": "frozen organic peas",
//            "amount": 2.0,
//            "unit": "c",
//            "meta": [
//            "frozen",
//            "organic"
//            ],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "cups",
//            "unitLong": "cups"
//        },
//            "metric": {
//            "amount": 290.0,
//            "unitShort": "g",
//            "unitLong": "grams"
//        }
//        }
//        },
//        {
//            "id": 99253,
//            "aisle": "Canned and Jarred",
//            "image": "chicken-broth.png",
//            "consistency": "LIQUID",
//            "name": "vegetable broth",
//            "nameClean": "vegetable broth",
//            "original": "1 box low-sodium vegetable broth",
//            "originalName": "low-sodium vegetable broth",
//            "amount": 1.0,
//            "unit": "box",
//            "meta": [
//            "low-sodium"
//            ],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "box",
//            "unitLong": "box"
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "box",
//            "unitLong": "box"
//        }
//        }
//        }
//        ],
//        "summary": "Asparagus and Pea Soup: Real Convenience Food requires approximately <b>20 minutes</b> from start to finish. Watching your figure? This gluten free, dairy free, paleolithic, and lacto ovo vegetarian recipe has <b>217 calories</b>, <b>11g of protein</b>, and <b>8g of fat</b> per serving. This recipe serves 2. For <b>$1.78 per serving</b>, this recipe <b>covers 25%</b> of your daily requirements of vitamins and minerals. <b>Autumn</b> will be even more special with this recipe. It works well as a hor d'oeuvre. 207 people have tried and liked this recipe. It is brought to you by fullbellysisters.blogspot.com. A mixture of vegetable broth, evoo, garlic, and a handful of other ingredients are all it takes to make this recipe so yummy. All things considered, we decided this recipe <b>deserves a spoonacular score of 96%</b>. This score is outstanding. Try <a href=\"https://spoonacular.com/recipes/asparagus-and-pea-soup-real-convenience-food-1393979\">Asparagus and Pea Soup: Real Convenience Food</a>, <a href=\"https://spoonacular.com/recipes/asparagus-and-pea-soup-real-convenience-food-1376201\">Asparagus and Pea Soup: Real Convenience Food</a>, and <a href=\"https://spoonacular.com/recipes/asparagus-and-pea-soup-real-convenience-food-1362341\">Asparagus and Pea Soup: Real Convenience Food</a> for similar recipes.",
//        "cuisines": [],
//        "dishTypes": [
//        "antipasti",
//        "soup",
//        "starter",
//        "snack",
//        "appetizer",
//        "antipasto",
//        "hor d'oeuvre"
//        ],
//        "diets": [
//        "gluten free",
//        "dairy free",
//        "paleolithic",
//        "lacto ovo vegetarian",
//        "primal",
//        "vegan"
//        ],
//        "occasions": [
//        "fall",
//        "winter"
//        ],
//        "analyzedInstructions": [
//        {
//            "name": "",
//            "steps": [
//            {
//                "number": 1,
//                "step": "Chop the garlic and onions.",
//                "ingredients": [
//                {
//                    "id": 11215,
//                    "name": "garlic",
//                    "localizedName": "garlic",
//                    "image": "garlic.png"
//                },
//                {
//                    "id": 11282,
//                    "name": "onion",
//                    "localizedName": "onion",
//                    "image": "brown-onion.png"
//                }
//                ],
//                "equipment": []
//            },
//            {
//                "number": 2,
//                "step": "Saute the onions in the EVOO, adding the garlic after a couple of minutes; cook until the onions are translucent.",
//                "ingredients": [
//                {
//                    "id": 11215,
//                    "name": "garlic",
//                    "localizedName": "garlic",
//                    "image": "garlic.png"
//                },
//                {
//                    "id": 11282,
//                    "name": "onion",
//                    "localizedName": "onion",
//                    "image": "brown-onion.png"
//                },
//                {
//                    "id": 1034053,
//                    "name": "extra virgin olive oil",
//                    "localizedName": "extra virgin olive oil",
//                    "image": "olive-oil.jpg"
//                }
//                ],
//                "equipment": []
//            },
//            {
//                "number": 3,
//                "step": "Add the whole bag of asparagus and cover everything with the broth. Season with salt and pepper and a pinch of red pepper flakes, if using.Simmer until the asparagus is bright green and tender (if you've thawed the asparagus it will only take a couple of minutes). Turn off the heat and puree using an immersion blender.",
//                "ingredients": [
//                {
//                    "id": 1032009,
//                    "name": "red pepper flakes",
//                    "localizedName": "red pepper flakes",
//                    "image": "red-pepper-flakes.jpg"
//                },
//                {
//                    "id": 1102047,
//                    "name": "salt and pepper",
//                    "localizedName": "salt and pepper",
//                    "image": "salt-and-pepper.jpg"
//                },
//                {
//                    "id": 11011,
//                    "name": "asparagus",
//                    "localizedName": "asparagus",
//                    "image": "asparagus.png"
//                },
//                {
//                    "id": 1006615,
//                    "name": "broth",
//                    "localizedName": "broth",
//                    "image": "chicken-broth.png"
//                }
//                ],
//                "equipment": [
//                {
//                    "id": 404776,
//                    "name": "immersion blender",
//                    "localizedName": "immersion blender",
//                    "image": "https://spoonacular.com/cdn/equipment_100x100/immersion-blender.png"
//                }
//                ]
//            },
//            {
//                "number": 4,
//                "step": "Add peas (the heat of the soup will quickly thaw them) and puree until smooth; add more until it reaches the thickness you like.Top with chives and a small dollop of creme fraiche or sour cream or greek yogurt.",
//                "ingredients": [
//                {
//                    "id": 1001056,
//                    "name": "creme fraiche",
//                    "localizedName": "creme fraiche",
//                    "image": "sour-cream.jpg"
//                },
//                {
//                    "id": 1256,
//                    "name": "greek yogurt",
//                    "localizedName": "greek yogurt",
//                    "image": "plain-yogurt.jpg"
//                },
//                {
//                    "id": 1056,
//                    "name": "sour cream",
//                    "localizedName": "sour cream",
//                    "image": "sour-cream.jpg"
//                },
//                {
//                    "id": 11156,
//                    "name": "chives",
//                    "localizedName": "chives",
//                    "image": "fresh-chives.jpg"
//                },
//                {
//                    "id": 11304,
//                    "name": "peas",
//                    "localizedName": "peas",
//                    "image": "peas.jpg"
//                },
//                {
//                    "id": 0,
//                    "name": "soup",
//                    "localizedName": "soup",
//                    "image": ""
//                }
//                ],
//                "equipment": []
//            }
//            ]
//        }
//        ],
//        "spoonacularScore": 99.41780090332031,
//        "spoonacularSourceUrl": "https://spoonacular.com/asparagus-and-pea-soup-real-convenience-food-716406",
//        "usedIngredientCount": 0,
//        "missedIngredientCount": 5,
//        "missedIngredients": [
//        {
//            "id": 11011,
//            "amount": 1.0,
//            "unit": "bag",
//            "unitLong": "bag",
//            "unitShort": "bag",
//            "aisle": "Produce",
//            "name": "asparagus",
//            "original": "1 bag of frozen organic asparagus (preferably thawed)",
//            "originalName": "frozen organic asparagus (preferably thawed)",
//            "meta": [
//            "frozen",
//            "organic",
//            "thawed",
//            "(preferably )"
//            ],
//            "extendedName": "frozen asparagus",
//            "image": "https://img.spoonacular.com/ingredients_100x100/asparagus.png"
//        },
//        {
//            "id": 11215,
//            "amount": 2.0,
//            "unit": "cloves",
//            "unitLong": "cloves",
//            "unitShort": "cloves",
//            "aisle": "Produce",
//            "name": "garlic",
//            "original": "a couple of garlic cloves",
//            "originalName": "a couple of garlic",
//            "meta": [],
//            "image": "https://img.spoonacular.com/ingredients_100x100/garlic.png"
//        },
//        {
//            "id": 11282,
//            "amount": 0.5,
//            "unit": "",
//            "unitLong": "",
//            "unitShort": "",
//            "aisle": "Produce",
//            "name": "onion",
//            "original": "1/2 onion",
//            "originalName": "onion",
//            "meta": [],
//            "image": "https://img.spoonacular.com/ingredients_100x100/brown-onion.png"
//        },
//        {
//            "id": 11304,
//            "amount": 2.0,
//            "unit": "c",
//            "unitLong": "cups",
//            "unitShort": "cup",
//            "aisle": "Produce",
//            "name": "peas",
//            "original": "2-3c of frozen organic peas",
//            "originalName": "frozen organic peas",
//            "meta": [
//            "frozen",
//            "organic"
//            ],
//            "extendedName": "frozen peas",
//            "image": "https://img.spoonacular.com/ingredients_100x100/peas.jpg"
//        },
//        {
//            "id": 99253,
//            "amount": 1.0,
//            "unit": "box",
//            "unitLong": "box",
//            "unitShort": "box",
//            "aisle": "Canned and Jarred",
//            "name": "vegetable broth",
//            "original": "1 box low-sodium vegetable broth",
//            "originalName": "low-sodium vegetable broth",
//            "meta": [
//            "low-sodium"
//            ],
//            "extendedName": "low sodium vegetable broth",
//            "image": "https://img.spoonacular.com/ingredients_100x100/chicken-broth.png"
//        }
//        ],
//        "likes": 0,
//        "usedIngredients": [],
//        "unusedIngredients": []
//    },
//    {
//        "id": 644387,
//        "image": "https://img.spoonacular.com/recipes/644387-312x231.jpg",
//        "imageType": "jpg",
//        "title": "Garlicky Kale",
//        "readyInMinutes": 45,
//        "servings": 2,
//        "sourceUrl": "https://www.foodista.com/recipe/J2FTJBF7/garlicky-kale",
//        "vegetarian": true,
//        "vegan": true,
//        "glutenFree": true,
//        "dairyFree": true,
//        "veryHealthy": true,
//        "cheap": false,
//        "veryPopular": false,
//        "sustainable": false,
//        "lowFodmap": false,
//        "weightWatcherSmartPoints": 5,
//        "gaps": "no",
//        "preparationMinutes": null,
//        "cookingMinutes": null,
//        "aggregateLikes": 19,
//        "healthScore": 83.0,
//        "creditsText": "Foodista.com – The Cooking Encyclopedia Everyone Can Edit",
//        "license": "CC BY 3.0",
//        "sourceName": "Foodista",
//        "pricePerServing": 69.09,
//        "extendedIngredients": [
//        {
//            "id": 2069,
//            "aisle": "Oil, Vinegar, Salad Dressing",
//            "image": "balsamic-vinegar.jpg",
//            "consistency": "LIQUID",
//            "name": "balsamic vinegar",
//            "nameClean": "balsamic vinegar",
//            "original": "3 tablespoons balsamic vinegar",
//            "originalName": "balsamic vinegar",
//            "amount": 3.0,
//            "unit": "tablespoons",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 3.0,
//            "unitShort": "Tbsps",
//            "unitLong": "Tbsps"
//        },
//            "metric": {
//            "amount": 3.0,
//            "unitShort": "Tbsps",
//            "unitLong": "Tbsps"
//        }
//        }
//        },
//        {
//            "id": 11215,
//            "aisle": "Produce",
//            "image": "garlic.png",
//            "consistency": "SOLID",
//            "name": "garlic",
//            "nameClean": "garlic",
//            "original": "1 clove garlic, minced",
//            "originalName": "garlic, minced",
//            "amount": 1.0,
//            "unit": "clove",
//            "meta": [
//            "minced"
//            ],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "clove",
//            "unitLong": "clove"
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "clove",
//            "unitLong": "clove"
//        }
//        }
//        },
//        {
//            "id": 11233,
//            "aisle": "Produce",
//            "image": "kale.jpg",
//            "consistency": "SOLID",
//            "name": "curly kale",
//            "nameClean": "curly kale",
//            "original": "1 bunch curly kale, stems removed and chopped",
//            "originalName": "curly kale, stems removed and chopped",
//            "amount": 1.0,
//            "unit": "bunch",
//            "meta": [
//            "chopped"
//            ],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "bunch",
//            "unitLong": "bunch"
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "bunch",
//            "unitLong": "bunch"
//        }
//        }
//        },
//        {
//            "id": 4053,
//            "aisle": "Oil, Vinegar, Salad Dressing",
//            "image": "olive-oil.jpg",
//            "consistency": "LIQUID",
//            "name": "olive oil",
//            "nameClean": "olive oil",
//            "original": "Olive oil",
//            "originalName": "Olive oil",
//            "amount": 2.0,
//            "unit": "servings",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "servings",
//            "unitLong": "servings"
//        },
//            "metric": {
//            "amount": 2.0,
//            "unitShort": "servings",
//            "unitLong": "servings"
//        }
//        }
//        }
//        ],
//        "summary": "Garlicky Kale requires approximately <b>45 minutes</b> from start to finish. This side dish has <b>170 calories</b>, <b>2g of protein</b>, and <b>15g of fat</b> per serving. This recipe serves 2. For <b>69 cents per serving</b>, this recipe <b>covers 17%</b> of your daily requirements of vitamins and minerals. 19 people have made this recipe and would make it again. This recipe from Foodista requires balsamic vinegar, garlic, curly kale, and olive oil. It is a good option if you're following a <b>gluten free, dairy free, paleolithic, and lacto ovo vegetarian</b> diet. With a spoonacular <b>score of 99%</b>, this dish is outstanding. Try <a href=\"https://spoonacular.com/recipes/garlicky-kale-248759\">Garlicky Kale</a>, <a href=\"https://spoonacular.com/recipes/garlicky-kale-1267347\">Garlicky Kale</a>, and <a href=\"https://spoonacular.com/recipes/garlicky-kale-1584523\">Garlicky Kale</a> for similar recipes.",
//        "cuisines": [],
//        "dishTypes": [
//        "side dish"
//        ],
//        "diets": [
//        "gluten free",
//        "dairy free",
//        "paleolithic",
//        "lacto ovo vegetarian",
//        "primal",
//        "whole 30",
//        "vegan"
//        ],
//        "occasions": [],
//        "analyzedInstructions": [
//        {
//            "name": "",
//            "steps": [
//            {
//                "number": 1,
//                "step": "Heat the olive oil in a large pot over medium heat.",
//                "ingredients": [
//                {
//                    "id": 4053,
//                    "name": "olive oil",
//                    "localizedName": "olive oil",
//                    "image": "olive-oil.jpg"
//                }
//                ],
//                "equipment": [
//                {
//                    "id": 404752,
//                    "name": "pot",
//                    "localizedName": "pot",
//                    "image": "https://spoonacular.com/cdn/equipment_100x100/stock-pot.jpg"
//                }
//                ]
//            },
//            {
//                "number": 2,
//                "step": "Add the kale and cover.Stir occasionally until the volume of the kale is reduced by half. Uncover.",
//                "ingredients": [
//                {
//                    "id": 11233,
//                    "name": "kale",
//                    "localizedName": "kale",
//                    "image": "kale.jpg"
//                }
//                ],
//                "equipment": []
//            },
//            {
//                "number": 3,
//                "step": "Add garlic and basalmic.Allow to cook for about another 30 seconds or so, mixing well so that the garlic and vinegar are well distributed.",
//                "ingredients": [
//                {
//                    "id": 2053,
//                    "name": "vinegar",
//                    "localizedName": "vinegar",
//                    "image": "vinegar-(white).jpg"
//                },
//                {
//                    "id": 11215,
//                    "name": "garlic",
//                    "localizedName": "garlic",
//                    "image": "garlic.png"
//                }
//                ],
//                "equipment": []
//            },
//            {
//                "number": 4,
//                "step": "Serve hot.",
//                "ingredients": [],
//                "equipment": []
//            }
//            ]
//        }
//        ],
//        "spoonacularScore": 98.94418334960938,
//        "spoonacularSourceUrl": "https://spoonacular.com/garlicky-kale-644387",
//        "usedIngredientCount": 0,
//        "missedIngredientCount": 3,
//        "missedIngredients": [
//        {
//            "id": 2069,
//            "amount": 3.0,
//            "unit": "tablespoons",
//            "unitLong": "tablespoons",
//            "unitShort": "Tbsp",
//            "aisle": "Oil, Vinegar, Salad Dressing",
//            "name": "balsamic vinegar",
//            "original": "3 tablespoons balsamic vinegar",
//            "originalName": "balsamic vinegar",
//            "meta": [],
//            "image": "https://img.spoonacular.com/ingredients_100x100/balsamic-vinegar.jpg"
//        },
//        {
//            "id": 11215,
//            "amount": 1.0,
//            "unit": "clove",
//            "unitLong": "clove",
//            "unitShort": "clove",
//            "aisle": "Produce",
//            "name": "garlic",
//            "original": "1 clove garlic, minced",
//            "originalName": "garlic, minced",
//            "meta": [
//            "minced"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/garlic.png"
//        },
//        {
//            "id": 11233,
//            "amount": 1.0,
//            "unit": "bunch",
//            "unitLong": "bunch",
//            "unitShort": "bunch",
//            "aisle": "Produce",
//            "name": "curly kale",
//            "original": "1 bunch curly kale, stems removed and chopped",
//            "originalName": "curly kale, stems removed and chopped",
//            "meta": [
//            "chopped"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/kale.jpg"
//        }
//        ],
//        "likes": 0,
//        "usedIngredients": [],
//        "unusedIngredients": []
//    },
//    {
//        "id": 715446,
//        "image": "https://img.spoonacular.com/recipes/715446-312x231.jpg",
//        "imageType": "jpg",
//        "title": "Slow Cooker Beef Stew",
//        "readyInMinutes": 490,
//        "servings": 6,
//        "sourceUrl": "https://www.pinkwhen.com/slow-cooker-beef-stew-recipe/",
//        "vegetarian": false,
//        "vegan": false,
//        "glutenFree": true,
//        "dairyFree": true,
//        "veryHealthy": true,
//        "cheap": false,
//        "veryPopular": false,
//        "sustainable": false,
//        "lowFodmap": false,
//        "weightWatcherSmartPoints": 10,
//        "gaps": "no",
//        "preparationMinutes": 10,
//        "cookingMinutes": 480,
//        "aggregateLikes": 57,
//        "healthScore": 100.0,
//        "creditsText": "pinkwhen.com",
//        "license": null,
//        "sourceName": "pinkwhen.com",
//        "pricePerServing": 270.41,
//        "extendedIngredients": [
//        {
//            "id": 6008,
//            "aisle": "Canned and Jarred",
//            "image": "beef-broth.png",
//            "consistency": "LIQUID",
//            "name": "beef broth",
//            "nameClean": "beef broth",
//            "original": "1 14.5oz can of Beef Broth",
//            "originalName": "Beef Broth",
//            "amount": 14.5,
//            "unit": "oz",
//            "meta": [
//            "canned"
//            ],
//            "measures": {
//            "us": {
//            "amount": 14.5,
//            "unitShort": "oz",
//            "unitLong": "ounces"
//        },
//            "metric": {
//            "amount": 411.068,
//            "unitShort": "g",
//            "unitLong": "grams"
//        }
//        }
//        },
//        {
//            "id": 11124,
//            "aisle": "Produce",
//            "image": "sliced-carrot.png",
//            "consistency": "SOLID",
//            "name": "carrots",
//            "nameClean": "carrots",
//            "original": "2 large carrots, chopped",
//            "originalName": "carrots, chopped",
//            "amount": 2.0,
//            "unit": "large",
//            "meta": [
//            "chopped"
//            ],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "large",
//            "unitLong": "larges"
//        },
//            "metric": {
//            "amount": 2.0,
//            "unitShort": "large",
//            "unitLong": "larges"
//        }
//        }
//        },
//        {
//            "id": 11143,
//            "aisle": "Produce",
//            "image": "celery.jpg",
//            "consistency": "SOLID",
//            "name": "celery",
//            "nameClean": "celery",
//            "original": "2 stalks celery, chopped",
//            "originalName": "celery, chopped",
//            "amount": 2.0,
//            "unit": "stalks",
//            "meta": [
//            "chopped"
//            ],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "stalks",
//            "unitLong": "stalks"
//        },
//            "metric": {
//            "amount": 2.0,
//            "unitShort": "stalks",
//            "unitLong": "stalks"
//        }
//        }
//        },
//        {
//            "id": 6147,
//            "aisle": "Canned and Jarred",
//            "image": "cream-of-mushroom-soup.png",
//            "consistency": "LIQUID",
//            "name": "cream of mushroom soup",
//            "nameClean": "cream of mushroom soup",
//            "original": "1 26oz can Cream of Mushroom Soup",
//            "originalName": "Cream of Mushroom Soup",
//            "amount": 26.0,
//            "unit": "oz",
//            "meta": [
//            "canned"
//            ],
//            "measures": {
//            "us": {
//            "amount": 26.0,
//            "unitShort": "oz",
//            "unitLong": "ounces"
//        },
//            "metric": {
//            "amount": 737.088,
//            "unitShort": "g",
//            "unitLong": "grams"
//        }
//        }
//        },
//        {
//            "id": 11291,
//            "aisle": "Produce",
//            "image": "spring-onions.jpg",
//            "consistency": "SOLID",
//            "name": "green onions",
//            "nameClean": "green onions",
//            "original": "3 green onions, chopped",
//            "originalName": "green onions, chopped",
//            "amount": 3.0,
//            "unit": "",
//            "meta": [
//            "chopped"
//            ],
//            "measures": {
//            "us": {
//            "amount": 3.0,
//            "unitShort": "",
//            "unitLong": ""
//        },
//            "metric": {
//            "amount": 3.0,
//            "unitShort": "",
//            "unitLong": ""
//        }
//        }
//        },
//        {
//            "id": 10211352,
//            "aisle": "Produce",
//            "image": "new-potatoes.jpg",
//            "consistency": "SOLID",
//            "name": "new potatoes",
//            "nameClean": "new potatoes",
//            "original": "10 new (red)potatoes",
//            "originalName": "new (red)potatoes",
//            "amount": 10.0,
//            "unit": "",
//            "meta": [
//            "red",
//            "()"
//            ],
//            "measures": {
//            "us": {
//            "amount": 10.0,
//            "unitShort": "",
//            "unitLong": ""
//        },
//            "metric": {
//            "amount": 10.0,
//            "unitShort": "",
//            "unitLong": ""
//        }
//        }
//        },
//        {
//            "id": 11282,
//            "aisle": "Produce",
//            "image": "brown-onion.png",
//            "consistency": "SOLID",
//            "name": "onion",
//            "nameClean": "onion",
//            "original": "1 small onion chopped",
//            "originalName": "onion chopped",
//            "amount": 1.0,
//            "unit": "small",
//            "meta": [
//            "chopped"
//            ],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "small",
//            "unitLong": "small"
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "small",
//            "unitLong": "small"
//        }
//        }
//        },
//        {
//            "id": 1042027,
//            "aisle": null,
//            "image": "seasoning.png",
//            "consistency": "SOLID",
//            "name": "dale's seasoning",
//            "nameClean": "dale's seasoning",
//            "original": "½ cup Dale's Seasoning",
//            "originalName": "Dale's Seasoning",
//            "amount": 0.5,
//            "unit": "cup",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 0.5,
//            "unitShort": "cups",
//            "unitLong": "cups"
//        },
//            "metric": {
//            "amount": 118.294,
//            "unitShort": "ml",
//            "unitLong": "milliliters"
//        }
//        }
//        },
//        {
//            "id": 10023618,
//            "aisle": "Meat",
//            "image": "beef-cubes-raw.png",
//            "consistency": "SOLID",
//            "name": "stew meat",
//            "nameClean": "stew meat",
//            "original": "2 pounds stew meat",
//            "originalName": "stew meat",
//            "amount": 2.0,
//            "unit": "pounds",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "lb",
//            "unitLong": "pounds"
//        },
//            "metric": {
//            "amount": 907.185,
//            "unitShort": "g",
//            "unitLong": "grams"
//        }
//        }
//        },
//        {
//            "id": 14412,
//            "aisle": "Beverages",
//            "image": "water.png",
//            "consistency": "LIQUID",
//            "name": "water",
//            "nameClean": "water",
//            "original": "2 cups water",
//            "originalName": "water",
//            "amount": 2.0,
//            "unit": "cups",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "cups",
//            "unitLong": "cups"
//        },
//            "metric": {
//            "amount": 473.176,
//            "unitShort": "ml",
//            "unitLong": "milliliters"
//        }
//        }
//        }
//        ],
//        "summary": "If you want to add more <b>gluten free and dairy free</b> recipes to your recipe box, Slow Cooker Beef Stew might be a recipe you should try. One serving contains <b>434 calories</b>, <b>44g of protein</b>, and <b>12g of fat</b>. This recipe serves 6. For <b>$2.7 per serving</b>, this recipe <b>covers 45%</b> of your daily requirements of vitamins and minerals. It works best as a main course, and is done in approximately <b>8 hours and 10 minutes</b>. If you have green onions, carrots, celery, and a few other ingredients on hand, you can make it. This recipe is liked by 57 foodies and cooks. <b>Autumn</b> will be even more special with this recipe. It is brought to you by Pink When. Taking all factors into account, this recipe <b>earns a spoonacular score of 99%</b>, which is awesome. Similar recipes include <a href=\"https://spoonacular.com/recipes/slow-cooker-beef-stew-1578321\">Slow Cooker Beef Stew</a>, <a href=\"https://spoonacular.com/recipes/slow-cooker-beef-stew-1241707\">Slow Cooker Beef Stew</a>, and <a href=\"https://spoonacular.com/recipes/slow-cooker-beef-stew-1281171\">Slow Cooker Beef Stew</a>.",
//        "cuisines": [],
//        "dishTypes": [
//        "lunch",
//        "soup",
//        "main course",
//        "main dish",
//        "dinner"
//        ],
//        "diets": [
//        "gluten free",
//        "dairy free"
//        ],
//        "occasions": [
//        "fall",
//        "winter"
//        ],
//        "analyzedInstructions": [
//        {
//            "name": "",
//            "steps": [
//            {
//                "number": 1,
//                "step": "To get started, heat your slow cooker to low.",
//                "ingredients": [],
//                "equipment": [
//                {
//                    "id": 404718,
//                    "name": "slow cooker",
//                    "localizedName": "slow cooker",
//                    "image": "https://spoonacular.com/cdn/equipment_100x100/slow-cooker.jpg"
//                }
//                ]
//            },
//            {
//                "number": 2,
//                "step": "Pour in the cream of mushroom soup, Dale's seasoning, water, and beef broth and stir until mixed well.",
//                "ingredients": [
//                {
//                    "id": 6147,
//                    "name": "cream of mushroom soup",
//                    "localizedName": "cream of mushroom soup",
//                    "image": "cream-of-mushroom-soup.png"
//                },
//                {
//                    "id": 6008,
//                    "name": "beef broth",
//                    "localizedName": "beef broth",
//                    "image": "beef-broth.png"
//                },
//                {
//                    "id": 1042027,
//                    "name": "seasoning",
//                    "localizedName": "seasoning",
//                    "image": "seasoning.png"
//                },
//                {
//                    "id": 14412,
//                    "name": "water",
//                    "localizedName": "water",
//                    "image": "water.png"
//                }
//                ],
//                "equipment": []
//            },
//            {
//                "number": 3,
//                "step": "Add in your stew meat, potatoes, onions, carrots, celery, and green onions. Stir well until covered and cook on low for 8 hours. You can add salt and pepper as desired, but the flavors and the Dale's marry together so well that you probably won’t need them.",
//                "ingredients": [
//                {
//                    "id": 1102047,
//                    "name": "salt and pepper",
//                    "localizedName": "salt and pepper",
//                    "image": "salt-and-pepper.jpg"
//                },
//                {
//                    "id": 11291,
//                    "name": "green onions",
//                    "localizedName": "green onions",
//                    "image": "spring-onions.jpg"
//                },
//                {
//                    "id": 10023618,
//                    "name": "beef stew meat",
//                    "localizedName": "beef stew meat",
//                    "image": "beef-cubes-raw.png"
//                },
//                {
//                    "id": 11352,
//                    "name": "potato",
//                    "localizedName": "potato",
//                    "image": "potatoes-yukon-gold.png"
//                },
//                {
//                    "id": 11124,
//                    "name": "carrot",
//                    "localizedName": "carrot",
//                    "image": "sliced-carrot.png"
//                },
//                {
//                    "id": 11143,
//                    "name": "celery",
//                    "localizedName": "celery",
//                    "image": "celery.jpg"
//                },
//                {
//                    "id": 11282,
//                    "name": "onion",
//                    "localizedName": "onion",
//                    "image": "brown-onion.png"
//                }
//                ],
//                "equipment": [],
//                "length": {
//                "number": 480,
//                "unit": "minutes"
//            }
//            }
//            ]
//        }
//        ],
//        "spoonacularScore": 98.84830474853516,
//        "spoonacularSourceUrl": "https://spoonacular.com/slow-cooker-beef-stew-715446",
//        "usedIngredientCount": 0,
//        "missedIngredientCount": 9,
//        "missedIngredients": [
//        {
//            "id": 6008,
//            "amount": 14.5,
//            "unit": "oz",
//            "unitLong": "ounces",
//            "unitShort": "oz",
//            "aisle": "Canned and Jarred",
//            "name": "beef broth",
//            "original": "1 14.5oz can of Beef Broth",
//            "originalName": "Beef Broth",
//            "meta": [
//            "canned"
//            ],
//            "extendedName": "canned beef broth",
//            "image": "https://img.spoonacular.com/ingredients_100x100/beef-broth.png"
//        },
//        {
//            "id": 11124,
//            "amount": 2.0,
//            "unit": "large",
//            "unitLong": "larges",
//            "unitShort": "large",
//            "aisle": "Produce",
//            "name": "carrots",
//            "original": "2 large carrots, chopped",
//            "originalName": "carrots, chopped",
//            "meta": [
//            "chopped"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/sliced-carrot.png"
//        },
//        {
//            "id": 11143,
//            "amount": 2.0,
//            "unit": "stalks",
//            "unitLong": "stalks",
//            "unitShort": "stalks",
//            "aisle": "Produce",
//            "name": "celery",
//            "original": "2 stalks celery, chopped",
//            "originalName": "celery, chopped",
//            "meta": [
//            "chopped"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/celery.jpg"
//        },
//        {
//            "id": 6147,
//            "amount": 26.0,
//            "unit": "oz",
//            "unitLong": "ounces",
//            "unitShort": "oz",
//            "aisle": "Canned and Jarred",
//            "name": "cream of mushroom soup",
//            "original": "1 26oz can Cream of Mushroom Soup",
//            "originalName": "Cream of Mushroom Soup",
//            "meta": [
//            "canned"
//            ],
//            "extendedName": "canned cream of mushroom soup",
//            "image": "https://img.spoonacular.com/ingredients_100x100/cream-of-mushroom-soup.png"
//        },
//        {
//            "id": 11291,
//            "amount": 3.0,
//            "unit": "",
//            "unitLong": "",
//            "unitShort": "",
//            "aisle": "Produce",
//            "name": "green onions",
//            "original": "3 green onions, chopped",
//            "originalName": "green onions, chopped",
//            "meta": [
//            "chopped"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/spring-onions.jpg"
//        },
//        {
//            "id": 10211352,
//            "amount": 10.0,
//            "unit": "",
//            "unitLong": "",
//            "unitShort": "",
//            "aisle": "Produce",
//            "name": "new potatoes",
//            "original": "10 new (red)potatoes",
//            "originalName": "new (red)potatoes",
//            "meta": [
//            "red",
//            "()"
//            ],
//            "extendedName": "red new potatoes",
//            "image": "https://img.spoonacular.com/ingredients_100x100/new-potatoes.jpg"
//        },
//        {
//            "id": 11282,
//            "amount": 1.0,
//            "unit": "small",
//            "unitLong": "small",
//            "unitShort": "small",
//            "aisle": "Produce",
//            "name": "onion",
//            "original": "1 small onion chopped",
//            "originalName": "onion chopped",
//            "meta": [
//            "chopped"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/brown-onion.png"
//        },
//        {
//            "id": 1042027,
//            "amount": 0.5,
//            "unit": "cup",
//            "unitLong": "cups",
//            "unitShort": "cup",
//            "aisle": null,
//            "name": "dale's seasoning",
//            "original": "½ cup Dale's Seasoning",
//            "originalName": "Dale's Seasoning",
//            "meta": [],
//            "image": "https://img.spoonacular.com/ingredients_100x100/seasoning.png"
//        },
//        {
//            "id": 10023618,
//            "amount": 2.0,
//            "unit": "pounds",
//            "unitLong": "pounds",
//            "unitShort": "lb",
//            "aisle": "Meat",
//            "name": "stew meat",
//            "original": "2 pounds stew meat",
//            "originalName": "stew meat",
//            "meta": [],
//            "image": "https://img.spoonacular.com/ingredients_100x100/beef-cubes-raw.png"
//        }
//        ],
//        "likes": 0,
//        "usedIngredients": [],
//        "unusedIngredients": []
//    },
//    {
//        "id": 782601,
//        "image": "https://img.spoonacular.com/recipes/782601-312x231.jpg",
//        "imageType": "jpg",
//        "title": "Red Kidney Bean Jambalaya",
//        "readyInMinutes": 45,
//        "servings": 6,
//        "sourceUrl": "https://www.foodandspice.com/2016/05/red-kidney-bean-jambalaya.html",
//        "vegetarian": true,
//        "vegan": true,
//        "glutenFree": true,
//        "dairyFree": true,
//        "veryHealthy": true,
//        "cheap": false,
//        "veryPopular": false,
//        "sustainable": false,
//        "lowFodmap": false,
//        "weightWatcherSmartPoints": 9,
//        "gaps": "no",
//        "preparationMinutes": null,
//        "cookingMinutes": null,
//        "aggregateLikes": 53,
//        "healthScore": 96.0,
//        "creditsText": "foodandspice.com",
//        "license": null,
//        "sourceName": "foodandspice.com",
//        "pricePerServing": 168.43,
//        "extendedIngredients": [
//        {
//            "id": 20041,
//            "aisle": "Pasta and Rice",
//            "image": "rice-brown-cooked.png",
//            "consistency": "SOLID",
//            "name": "brown rice",
//            "nameClean": "brown rice",
//            "original": "2/3 cup dried brown rice (2 cups cooked)",
//            "originalName": "2/3 cup dried brown rice cooked)",
//            "amount": 2.0,
//            "unit": "cups",
//            "meta": [
//            "dried",
//            "cooked"
//            ],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "cups",
//            "unitLong": "cups"
//        },
//            "metric": {
//            "amount": 390.0,
//            "unitShort": "g",
//            "unitLong": "grams"
//        }
//        }
//        },
//        {
//            "id": 11124,
//            "aisle": "Produce",
//            "image": "sliced-carrot.png",
//            "consistency": "SOLID",
//            "name": "carrots",
//            "nameClean": "carrots",
//            "original": "2 medium carrots, sliced",
//            "originalName": "carrots, sliced",
//            "amount": 2.0,
//            "unit": "medium",
//            "meta": [
//            "sliced"
//            ],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "medium",
//            "unitLong": "mediums"
//        },
//            "metric": {
//            "amount": 2.0,
//            "unitShort": "medium",
//            "unitLong": "mediums"
//        }
//        }
//        },
//        {
//            "id": 11143,
//            "aisle": "Produce",
//            "image": "celery.jpg",
//            "consistency": "SOLID",
//            "name": "celery",
//            "nameClean": "celery",
//            "original": "2 stalks celery, sliced",
//            "originalName": "celery, sliced",
//            "amount": 2.0,
//            "unit": "stalks",
//            "meta": [
//            "sliced"
//            ],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "stalks",
//            "unitLong": "stalks"
//        },
//            "metric": {
//            "amount": 2.0,
//            "unitShort": "stalks",
//            "unitLong": "stalks"
//        }
//        }
//        },
//        {
//            "id": 2007,
//            "aisle": "Spices and Seasonings",
//            "image": "celery-seed.jpg",
//            "consistency": "SOLID",
//            "name": "celery seed",
//            "nameClean": "celery seed",
//            "original": "1 teaspoon celery seed",
//            "originalName": "celery seed",
//            "amount": 1.0,
//            "unit": "teaspoon",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "tsp",
//            "unitLong": "teaspoon"
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "tsp",
//            "unitLong": "teaspoon"
//        }
//        }
//        },
//        {
//            "id": 16032,
//            "aisle": "Canned and Jarred",
//            "image": "kidney-beans.jpg",
//            "consistency": "SOLID",
//            "name": "kidney beans",
//            "nameClean": "kidney beans",
//            "original": "2/3 cup dried kidney beans (2 cups cooked)",
//            "originalName": "2/3 cup dried kidney beans cooked)",
//            "amount": 2.0,
//            "unit": "cups",
//            "meta": [
//            "dried",
//            "cooked"
//            ],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "cups",
//            "unitLong": "cups"
//        },
//            "metric": {
//            "amount": 368.0,
//            "unitShort": "g",
//            "unitLong": "grams"
//        }
//        }
//        },
//        {
//            "id": 1002023,
//            "aisle": "Spices and Seasonings",
//            "image": "marjoram.jpg",
//            "consistency": "SOLID",
//            "name": "marjoram",
//            "nameClean": "marjoram",
//            "original": "1 teaspoon dried marjoram",
//            "originalName": "dried marjoram",
//            "amount": 1.0,
//            "unit": "teaspoon",
//            "meta": [
//            "dried"
//            ],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "tsp",
//            "unitLong": "teaspoon"
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "tsp",
//            "unitLong": "teaspoon"
//        }
//        }
//        },
//        {
//            "id": 2042,
//            "aisle": "Spices and Seasonings",
//            "image": "thyme.jpg",
//            "consistency": "SOLID",
//            "name": "thyme",
//            "nameClean": "thyme",
//            "original": "2 teaspoons dried thyme",
//            "originalName": "dried thyme",
//            "amount": 2.0,
//            "unit": "teaspoons",
//            "meta": [
//            "dried"
//            ],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "tsps",
//            "unitLong": "teaspoons"
//        },
//            "metric": {
//            "amount": 2.0,
//            "unitShort": "tsps",
//            "unitLong": "teaspoons"
//        }
//        }
//        },
//        {
//            "id": 11209,
//            "aisle": "Produce",
//            "image": "eggplant.png",
//            "consistency": "SOLID",
//            "name": "eggplant",
//            "nameClean": "eggplant",
//            "original": "1 medium eggplant, chopped",
//            "originalName": "eggplant, chopped",
//            "amount": 1.0,
//            "unit": "medium",
//            "meta": [
//            "chopped"
//            ],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "medium",
//            "unitLong": "medium"
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "medium",
//            "unitLong": "medium"
//        }
//        }
//        },
//        {
//            "id": 11215,
//            "aisle": "Produce",
//            "image": "garlic.png",
//            "consistency": "SOLID",
//            "name": "garlic",
//            "nameClean": "garlic",
//            "original": "2 cloves garlic, minced or crushed",
//            "originalName": "garlic, minced or crushed",
//            "amount": 2.0,
//            "unit": "cloves",
//            "meta": [
//            "minced",
//            "crushed"
//            ],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "cloves",
//            "unitLong": "cloves"
//        },
//            "metric": {
//            "amount": 2.0,
//            "unitShort": "cloves",
//            "unitLong": "cloves"
//        }
//        }
//        },
//        {
//            "id": 11052,
//            "aisle": "Produce",
//            "image": "green-beans-or-string-beans.jpg",
//            "consistency": "SOLID",
//            "name": "green beans",
//            "nameClean": "green beans",
//            "original": "3 handfuls of green beans, chopped",
//            "originalName": "green beans, chopped",
//            "amount": 3.0,
//            "unit": "handfuls",
//            "meta": [
//            "chopped"
//            ],
//            "measures": {
//            "us": {
//            "amount": 3.0,
//            "unitShort": "handfuls",
//            "unitLong": "handfuls"
//        },
//            "metric": {
//            "amount": 3.0,
//            "unitShort": "handfuls",
//            "unitLong": "handfuls"
//        }
//        }
//        },
//        {
//            "id": 1002030,
//            "aisle": "Spices and Seasonings",
//            "image": "pepper.jpg",
//            "consistency": "SOLID",
//            "name": "ground pepper",
//            "nameClean": "ground pepper",
//            "original": "fresh ground black pepper",
//            "originalName": "fresh ground black pepper",
//            "amount": 6.0,
//            "unit": "servings",
//            "meta": [
//            "fresh",
//            "black"
//            ],
//            "measures": {
//            "us": {
//            "amount": 6.0,
//            "unitShort": "servings",
//            "unitLong": "servings"
//        },
//            "metric": {
//            "amount": 6.0,
//            "unitShort": "servings",
//            "unitLong": "servings"
//        }
//        }
//        },
//        {
//            "id": 1012038,
//            "aisle": "Spices and Seasonings",
//            "image": "dried-sage.png",
//            "consistency": "SOLID",
//            "name": "ground sage",
//            "nameClean": "ground sage",
//            "original": "2 teaspoons ground sage",
//            "originalName": "ground sage",
//            "amount": 2.0,
//            "unit": "teaspoons",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "tsps",
//            "unitLong": "teaspoons"
//        },
//            "metric": {
//            "amount": 2.0,
//            "unitShort": "tsps",
//            "unitLong": "teaspoons"
//        }
//        }
//        },
//        {
//            "id": 93627,
//            "aisle": "Spices and Seasonings",
//            "image": "dark-sauce.jpg",
//            "consistency": "SOLID",
//            "name": "liquid smoke",
//            "nameClean": "liquid smoke",
//            "original": "1/2 to 1 teaspoon liquid smoke, to taste",
//            "originalName": "liquid smoke, to taste",
//            "amount": 0.5,
//            "unit": "teaspoon",
//            "meta": [
//            "to taste"
//            ],
//            "measures": {
//            "us": {
//            "amount": 0.5,
//            "unitShort": "tsps",
//            "unitLong": "teaspoons"
//        },
//            "metric": {
//            "amount": 0.5,
//            "unitShort": "tsps",
//            "unitLong": "teaspoons"
//        }
//        }
//        },
//        {
//            "id": 4053,
//            "aisle": "Oil, Vinegar, Salad Dressing",
//            "image": "olive-oil.jpg",
//            "consistency": "LIQUID",
//            "name": "olive oil",
//            "nameClean": "olive oil",
//            "original": "2 tablespoons olive oil",
//            "originalName": "olive oil",
//            "amount": 2.0,
//            "unit": "tablespoons",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "Tbsps",
//            "unitLong": "Tbsps"
//        },
//            "metric": {
//            "amount": 2.0,
//            "unitShort": "Tbsps",
//            "unitLong": "Tbsps"
//        }
//        }
//        },
//        {
//            "id": 11821,
//            "aisle": "Produce",
//            "image": "red-pepper.jpg",
//            "consistency": "SOLID",
//            "name": "bell pepper",
//            "nameClean": "bell pepper",
//            "original": "1 red bell pepper, seeded and chopped",
//            "originalName": "red bell pepper, seeded and chopped",
//            "amount": 1.0,
//            "unit": "",
//            "meta": [
//            "red",
//            "seeded",
//            "chopped"
//            ],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "",
//            "unitLong": ""
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "",
//            "unitLong": ""
//        }
//        }
//        },
//        {
//            "id": 11282,
//            "aisle": "Produce",
//            "image": "brown-onion.png",
//            "consistency": "SOLID",
//            "name": "onion",
//            "nameClean": "onion",
//            "original": "1 small white or red onion, diced",
//            "originalName": "white or red onion, diced",
//            "amount": 1.0,
//            "unit": "small",
//            "meta": [
//            "diced",
//            "white",
//            "red"
//            ],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "small",
//            "unitLong": "small"
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "small",
//            "unitLong": "small"
//        }
//        }
//        },
//        {
//            "id": 1012047,
//            "aisle": "Spices and Seasonings",
//            "image": "salt.jpg",
//            "consistency": "SOLID",
//            "name": "sea salt",
//            "nameClean": "sea salt",
//            "original": "1 1/2 teaspoons sea salt, or to taste",
//            "originalName": "sea salt, or to taste",
//            "amount": 1.5,
//            "unit": "teaspoons",
//            "meta": [
//            "to taste"
//            ],
//            "measures": {
//            "us": {
//            "amount": 1.5,
//            "unitShort": "tsps",
//            "unitLong": "teaspoons"
//        },
//            "metric": {
//            "amount": 1.5,
//            "unitShort": "tsps",
//            "unitLong": "teaspoons"
//        }
//        }
//        },
//        {
//            "id": 6168,
//            "aisle": "Condiments",
//            "image": "hot-sauce-or-tabasco.png",
//            "consistency": "LIQUID",
//            "name": "sriracha",
//            "nameClean": "sriracha",
//            "original": "1 teaspoon sriracha or other hot sauce",
//            "originalName": "sriracha or other hot sauce",
//            "amount": 1.0,
//            "unit": "teaspoon",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 1.0,
//            "unitShort": "tsp",
//            "unitLong": "teaspoon"
//        },
//            "metric": {
//            "amount": 1.0,
//            "unitShort": "tsp",
//            "unitLong": "teaspoon"
//        }
//        }
//        },
//        {
//            "id": 11529,
//            "aisle": "Produce",
//            "image": "tomato.png",
//            "consistency": "SOLID",
//            "name": "tomatoes",
//            "nameClean": "tomatoes",
//            "original": "2 medium tomatoes, diced",
//            "originalName": "tomatoes, diced",
//            "amount": 2.0,
//            "unit": "medium",
//            "meta": [
//            "diced"
//            ],
//            "measures": {
//            "us": {
//            "amount": 2.0,
//            "unitShort": "medium",
//            "unitLong": "mediums"
//        },
//            "metric": {
//            "amount": 2.0,
//            "unitShort": "medium",
//            "unitLong": "mediums"
//        }
//        }
//        },
//        {
//            "id": 6615,
//            "aisle": "Canned and Jarred",
//            "image": "chicken-broth.png",
//            "consistency": "LIQUID",
//            "name": "vegetable stock",
//            "nameClean": "vegetable stock",
//            "original": "3 cups vegetable stock",
//            "originalName": "vegetable stock",
//            "amount": 3.0,
//            "unit": "cups",
//            "meta": [],
//            "measures": {
//            "us": {
//            "amount": 3.0,
//            "unitShort": "cups",
//            "unitLong": "cups"
//        },
//            "metric": {
//            "amount": 705.0,
//            "unitShort": "ml",
//            "unitLong": "milliliters"
//        }
//        }
//        }
//        ],
//        "summary": "Red Kidney Bean Jambalayan is a main course that serves 6. One portion of this dish contains approximately <b>18g of protein</b>, <b>6g of fat</b>, and a total of <b>393 calories</b>. For <b>$1.68 per serving</b>, this recipe <b>covers 33%</b> of your daily requirements of vitamins and minerals. 53 people were glad they tried this recipe. A mixture of vegetable stock, tomatoes, onion, and a handful of other ingredients are all it takes to make this recipe so flavorful. It is a good option if you're following a <b>gluten free, dairy free, lacto ovo vegetarian, and vegan</b> diet. This recipe is typical of Cajun cuisine. It is brought to you by foodandspice.blogspot.com. From preparation to the plate, this recipe takes roughly <b>45 minutes</b>. Overall, this recipe earns a <b>tremendous spoonacular score of 99%</b>. Users who liked this recipe also liked <a href=\"https://spoonacular.com/recipes/red-kidney-bean-jambalaya-1407231\">Red Kidney Bean Jambalaya</a>, <a href=\"https://spoonacular.com/recipes/red-kidney-bean-salad-94525\">Red Kidney Bean Salad</a>, and <a href=\"https://spoonacular.com/recipes/red-kidney-bean-curry-80686\">Red Kidney Bean Curry</a>.",
//        "cuisines": [
//        "Creole",
//        "Cajun"
//        ],
//        "dishTypes": [
//        "lunch",
//        "main course",
//        "main dish",
//        "dinner"
//        ],
//        "diets": [
//        "gluten free",
//        "dairy free",
//        "lacto ovo vegetarian",
//        "vegan"
//        ],
//        "occasions": [],
//        "analyzedInstructions": [
//        {
//            "name": "",
//            "steps": [
//            {
//                "number": 1,
//                "step": "Rinse the kidney beans and brown rice separately. Cover the kidney beans with water and soak for 8 hours or overnight. In a separate bowl, cover the brown rice with water and soak for 8 hours or overnight.",
//                "ingredients": [
//                {
//                    "id": 16033,
//                    "name": "kidney beans",
//                    "localizedName": "kidney beans",
//                    "image": "kidney-beans.jpg"
//                },
//                {
//                    "id": 20040,
//                    "name": "brown rice",
//                    "localizedName": "brown rice",
//                    "image": "uncooked-brown-rice.png"
//                },
//                {
//                    "id": 14412,
//                    "name": "water",
//                    "localizedName": "water",
//                    "image": "water.png"
//                }
//                ],
//                "equipment": [
//                {
//                    "id": 404783,
//                    "name": "bowl",
//                    "localizedName": "bowl",
//                    "image": "https://spoonacular.com/cdn/equipment_100x100/bowl.jpg"
//                }
//                ],
//                "length": {
//                "number": 960,
//                "unit": "minutes"
//            }
//            },
//            {
//                "number": 2,
//                "step": "Drain and rinse the kidney beans, then transfer to a medium saucepan and cover with fresh water. Bring to a boil, reduce heat to medium-low, cover, and simmer for 1 hour or until just tender but not falling apart.",
//                "ingredients": [
//                {
//                    "id": 16033,
//                    "name": "kidney beans",
//                    "localizedName": "kidney beans",
//                    "image": "kidney-beans.jpg"
//                },
//                {
//                    "id": 14412,
//                    "name": "water",
//                    "localizedName": "water",
//                    "image": "water.png"
//                }
//                ],
//                "equipment": [
//                {
//                    "id": 404669,
//                    "name": "sauce pan",
//                    "localizedName": "sauce pan",
//                    "image": "https://spoonacular.com/cdn/equipment_100x100/sauce-pan.jpg"
//                }
//                ],
//                "length": {
//                "number": 60,
//                "unit": "minutes"
//            }
//            },
//            {
//                "number": 3,
//                "step": "Drain and set aside.",
//                "ingredients": [],
//                "equipment": []
//            },
//            {
//                "number": 4,
//                "step": "Heat the oil in a large saucepan over medium heat. When hot, add the onion and saut for 5 minutes. Now add the garlic, carrots, celery and green beans, and stir for another 5 minutes. Next add the tomatoes, red pepper, eggplant, sage, thyme, marjoram and celery seed, and continue to stir for another few minutes.",
//                "ingredients": [
//                {
//                    "id": 2007,
//                    "name": "celery seed",
//                    "localizedName": "celery seed",
//                    "image": "celery-seed.jpg"
//                },
//                {
//                    "id": 11052,
//                    "name": "green beans",
//                    "localizedName": "green beans",
//                    "image": "green-beans-or-string-beans.jpg"
//                },
//                {
//                    "id": 11821,
//                    "name": "red pepper",
//                    "localizedName": "red pepper",
//                    "image": "red-pepper.jpg"
//                },
//                {
//                    "id": 11209,
//                    "name": "eggplant",
//                    "localizedName": "eggplant",
//                    "image": "eggplant.png"
//                },
//                {
//                    "id": 2023,
//                    "name": "marjoram",
//                    "localizedName": "marjoram",
//                    "image": "marjoram.jpg"
//                },
//                {
//                    "id": 11529,
//                    "name": "tomato",
//                    "localizedName": "tomato",
//                    "image": "tomato.png"
//                },
//                {
//                    "id": 11124,
//                    "name": "carrot",
//                    "localizedName": "carrot",
//                    "image": "sliced-carrot.png"
//                },
//                {
//                    "id": 11143,
//                    "name": "celery",
//                    "localizedName": "celery",
//                    "image": "celery.jpg"
//                },
//                {
//                    "id": 11215,
//                    "name": "garlic",
//                    "localizedName": "garlic",
//                    "image": "garlic.png"
//                },
//                {
//                    "id": 11282,
//                    "name": "onion",
//                    "localizedName": "onion",
//                    "image": "brown-onion.png"
//                },
//                {
//                    "id": 2049,
//                    "name": "thyme",
//                    "localizedName": "thyme",
//                    "image": "thyme.jpg"
//                },
//                {
//                    "id": 99226,
//                    "name": "sage",
//                    "localizedName": "sage",
//                    "image": "fresh-sage.png"
//                },
//                {
//                    "id": 4582,
//                    "name": "cooking oil",
//                    "localizedName": "cooking oil",
//                    "image": "vegetable-oil.jpg"
//                }
//                ],
//                "equipment": [
//                {
//                    "id": 404669,
//                    "name": "sauce pan",
//                    "localizedName": "sauce pan",
//                    "image": "https://spoonacular.com/cdn/equipment_100x100/sauce-pan.jpg"
//                }
//                ],
//                "length": {
//                "number": 10,
//                "unit": "minutes"
//            }
//            },
//            {
//                "number": 5,
//                "step": "Pour in the vegetable stock, liquid smoke, rice and the cooked kidney beans. Bring to a boil, reduce heat to medium low, cover, and cook, stirring occasionally, for 45 minutes or until the rice is tender.",
//                "ingredients": [
//                {
//                    "id": 6615,
//                    "name": "vegetable stock",
//                    "localizedName": "vegetable stock",
//                    "image": "chicken-broth.png"
//                },
//                {
//                    "id": 16033,
//                    "name": "kidney beans",
//                    "localizedName": "kidney beans",
//                    "image": "kidney-beans.jpg"
//                },
//                {
//                    "id": 93627,
//                    "name": "liquid smoke",
//                    "localizedName": "liquid smoke",
//                    "image": "dark-sauce.jpg"
//                },
//                {
//                    "id": 20444,
//                    "name": "rice",
//                    "localizedName": "rice",
//                    "image": "uncooked-white-rice.png"
//                }
//                ],
//                "equipment": [],
//                "length": {
//                "number": 45,
//                "unit": "minutes"
//            }
//            },
//            {
//                "number": 6,
//                "step": "Add water as necessary if the stew becomes too dry.Season with sriracha, salt and pepper, and taste for seasoning  add more liquid smoke, sriracha, salt, pepper or herbs as desired.",
//                "ingredients": [
//                {
//                    "id": 1102047,
//                    "name": "salt and pepper",
//                    "localizedName": "salt and pepper",
//                    "image": "salt-and-pepper.jpg"
//                },
//                {
//                    "id": 93627,
//                    "name": "liquid smoke",
//                    "localizedName": "liquid smoke",
//                    "image": "dark-sauce.jpg"
//                },
//                {
//                    "id": 1042027,
//                    "name": "seasoning",
//                    "localizedName": "seasoning",
//                    "image": "seasoning.png"
//                },
//                {
//                    "id": 1016168,
//                    "name": "sriracha",
//                    "localizedName": "sriracha",
//                    "image": "hot-sauce-or-tabasco.png"
//                },
//                {
//                    "id": 1002030,
//                    "name": "pepper",
//                    "localizedName": "pepper",
//                    "image": "pepper.jpg"
//                },
//                {
//                    "id": 1002044,
//                    "name": "herbs",
//                    "localizedName": "herbs",
//                    "image": "mixed-fresh-herbs.jpg"
//                },
//                {
//                    "id": 14412,
//                    "name": "water",
//                    "localizedName": "water",
//                    "image": "water.png"
//                },
//                {
//                    "id": 2047,
//                    "name": "salt",
//                    "localizedName": "salt",
//                    "image": "salt.jpg"
//                },
//                {
//                    "id": 0,
//                    "name": "stew",
//                    "localizedName": "stew",
//                    "image": ""
//                }
//                ],
//                "equipment": []
//            }
//            ]
//        }
//        ],
//        "spoonacularScore": 98.81867980957031,
//        "spoonacularSourceUrl": "https://spoonacular.com/red-kidney-bean-jambalaya-782601",
//        "usedIngredientCount": 0,
//        "missedIngredientCount": 17,
//        "missedIngredients": [
//        {
//            "id": 20041,
//            "amount": 2.0,
//            "unit": "cups",
//            "unitLong": "cups",
//            "unitShort": "cup",
//            "aisle": "Pasta and Rice",
//            "name": "brown rice",
//            "original": "2/3 cup dried brown rice (2 cups cooked)",
//            "originalName": "2/3 cup dried brown rice cooked)",
//            "meta": [
//            "dried",
//            "cooked"
//            ],
//            "extendedName": "cooked dried brown rice",
//            "image": "https://img.spoonacular.com/ingredients_100x100/rice-brown-cooked.png"
//        },
//        {
//            "id": 11124,
//            "amount": 2.0,
//            "unit": "medium",
//            "unitLong": "mediums",
//            "unitShort": "medium",
//            "aisle": "Produce",
//            "name": "carrots",
//            "original": "2 medium carrots, sliced",
//            "originalName": "carrots, sliced",
//            "meta": [
//            "sliced"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/sliced-carrot.png"
//        },
//        {
//            "id": 11143,
//            "amount": 2.0,
//            "unit": "stalks",
//            "unitLong": "stalks",
//            "unitShort": "stalks",
//            "aisle": "Produce",
//            "name": "celery",
//            "original": "2 stalks celery, sliced",
//            "originalName": "celery, sliced",
//            "meta": [
//            "sliced"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/celery.jpg"
//        },
//        {
//            "id": 2007,
//            "amount": 1.0,
//            "unit": "teaspoon",
//            "unitLong": "teaspoon",
//            "unitShort": "tsp",
//            "aisle": "Spices and Seasonings",
//            "name": "celery seed",
//            "original": "1 teaspoon celery seed",
//            "originalName": "celery seed",
//            "meta": [],
//            "image": "https://img.spoonacular.com/ingredients_100x100/celery-seed.jpg"
//        },
//        {
//            "id": 16032,
//            "amount": 2.0,
//            "unit": "cups",
//            "unitLong": "cups",
//            "unitShort": "cup",
//            "aisle": "Canned and Jarred",
//            "name": "kidney beans",
//            "original": "2/3 cup dried kidney beans (2 cups cooked)",
//            "originalName": "2/3 cup dried kidney beans cooked)",
//            "meta": [
//            "dried",
//            "cooked"
//            ],
//            "extendedName": "cooked dried kidney beans",
//            "image": "https://img.spoonacular.com/ingredients_100x100/kidney-beans.jpg"
//        },
//        {
//            "id": 1002023,
//            "amount": 1.0,
//            "unit": "teaspoon",
//            "unitLong": "teaspoon",
//            "unitShort": "tsp",
//            "aisle": "Spices and Seasonings",
//            "name": "marjoram",
//            "original": "1 teaspoon dried marjoram",
//            "originalName": "dried marjoram",
//            "meta": [
//            "dried"
//            ],
//            "extendedName": "dried marjoram",
//            "image": "https://img.spoonacular.com/ingredients_100x100/marjoram.jpg"
//        },
//        {
//            "id": 2042,
//            "amount": 2.0,
//            "unit": "teaspoons",
//            "unitLong": "teaspoons",
//            "unitShort": "tsp",
//            "aisle": "Spices and Seasonings",
//            "name": "thyme",
//            "original": "2 teaspoons dried thyme",
//            "originalName": "dried thyme",
//            "meta": [
//            "dried"
//            ],
//            "extendedName": "dried thyme",
//            "image": "https://img.spoonacular.com/ingredients_100x100/thyme.jpg"
//        },
//        {
//            "id": 11209,
//            "amount": 1.0,
//            "unit": "medium",
//            "unitLong": "medium",
//            "unitShort": "medium",
//            "aisle": "Produce",
//            "name": "eggplant",
//            "original": "1 medium eggplant, chopped",
//            "originalName": "eggplant, chopped",
//            "meta": [
//            "chopped"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/eggplant.png"
//        },
//        {
//            "id": 11215,
//            "amount": 2.0,
//            "unit": "cloves",
//            "unitLong": "cloves",
//            "unitShort": "cloves",
//            "aisle": "Produce",
//            "name": "garlic",
//            "original": "2 cloves garlic, minced or crushed",
//            "originalName": "garlic, minced or crushed",
//            "meta": [
//            "minced",
//            "crushed"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/garlic.png"
//        },
//        {
//            "id": 11052,
//            "amount": 3.0,
//            "unit": "handfuls",
//            "unitLong": "handfuls",
//            "unitShort": "handfuls",
//            "aisle": "Produce",
//            "name": "green beans",
//            "original": "3 handfuls of green beans, chopped",
//            "originalName": "green beans, chopped",
//            "meta": [
//            "chopped"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/green-beans-or-string-beans.jpg"
//        },
//        {
//            "id": 1012038,
//            "amount": 2.0,
//            "unit": "teaspoons",
//            "unitLong": "teaspoons",
//            "unitShort": "tsp",
//            "aisle": "Spices and Seasonings",
//            "name": "ground sage",
//            "original": "2 teaspoons ground sage",
//            "originalName": "ground sage",
//            "meta": [],
//            "image": "https://img.spoonacular.com/ingredients_100x100/dried-sage.png"
//        },
//        {
//            "id": 93627,
//            "amount": 0.5,
//            "unit": "teaspoon",
//            "unitLong": "teaspoons",
//            "unitShort": "tsp",
//            "aisle": "Spices and Seasonings",
//            "name": "liquid smoke",
//            "original": "1/2 to 1 teaspoon liquid smoke, to taste",
//            "originalName": "liquid smoke, to taste",
//            "meta": [
//            "to taste"
//            ],
//            "image": "https://img.spoonacular.com/ingredients_100x100/dark-sauce.jpg"
//        },
//        {
//            "id": 11821,
//            "amount": 1.0,
//            "unit": "",
//            "unitLong": "",
//            "unitShort": "",
//            "aisle": "Produce",
//            "name": "bell pepper",
//            "original": "1 red bell pepper, seeded and chopped",
//            "originalName": "red bell pepper, seeded and chopped",
//            "meta": [
//            "red",
//            "seeded",
//            "chopped"
//            ],
//            "extendedName": "red bell pepper",
//            "image": "https://img.spoonacular.com/ingredients_100x100/red-pepper.jpg"
//        },
//        {
//            "id": 11282,
//            "amount": 1.0,
//            "unit": "small",
//            "unitLong": "small",
//            "unitShort": "small",
//            "aisle": "Produce",
//            "name": "onion",
//            "original": "1 small white or red onion, diced",
//            "originalName": "white or red onion, diced",
//            "meta": [
//            "diced",
//            "white",
//            "red"
//            ],
//            "extendedName": "red white diced onion",
//            "image": "https://img.spoonacular.com/ingredients_100x100/brown-onion.png"
//        },
//        {
//            "id": 6168,
//            "amount": 1.0,
//            "unit": "teaspoon",
//            "unitLong": "teaspoon",
//            "unitShort": "tsp",
//            "aisle": "Condiments",
//            "name": "sriracha",
//            "original": "1 teaspoon sriracha or other hot sauce",
//            "originalName": "sriracha or other hot sauce",
//            "meta": [],
//            "image": "https://img.spoonacular.com/ingredients_100x100/hot-sauce-or-tabasco.png"
//        },
//        {
//            "id": 11529,
//            "amount": 2.0,
//            "unit": "medium",
//            "unitLong": "mediums",
//            "unitShort": "medium",
//            "aisle": "Produce",
//            "name": "tomatoes",
//            "original": "2 medium tomatoes, diced",
//            "originalName": "tomatoes, diced",
//            "meta": [
//            "diced"
//            ],
//            "extendedName": "diced tomatoes",
//            "image": "https://img.spoonacular.com/ingredients_100x100/tomato.png"
//        },
//        {
//            "id": 6615,
//            "amount": 3.0,
//            "unit": "cups",
//            "unitLong": "cups",
//            "unitShort": "cup",
//            "aisle": "Canned and Jarred",
//            "name": "vegetable stock",
//            "original": "3 cups vegetable stock",
//            "originalName": "vegetable stock",
//            "meta": [],
//            "image": "https://img.spoonacular.com/ingredients_100x100/chicken-broth.png"
//        }
//        ],
//        "likes": 0,
//        "usedIngredients": [],
//        "unusedIngredients": []
//    }
//    ],
//    "offset": 0,
//    "number": 5,
//    "totalResults": 5224
//}
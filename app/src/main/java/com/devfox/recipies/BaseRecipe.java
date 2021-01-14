package com.devfox.recipies;

import com.devfox.items.Items;

/**
 * A recipe with no inputs
 */
public class BaseRecipe extends Recipe{
    public BaseRecipe(String name, Items outputItem,float outputCountPerMinute){
        super(name,null,outputItem,outputCountPerMinute);
    }
}

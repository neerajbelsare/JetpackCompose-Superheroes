package com.example.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/* @StringRes and @DrawableRes annotations indicate that these properties should hold resource IDs
corresponding to strings and drawables, respectively. */

data class Hero(
    @StringRes val nameRes: Int,        // Int representing the resource ID for the superhero's name (string)
    @StringRes val descriptionRes: Int,     // Int representing the resource ID for the superhero's description (string)
    @DrawableRes val imageRes: Int      // Int representing the resource ID for the superhero's image (drawable)
)

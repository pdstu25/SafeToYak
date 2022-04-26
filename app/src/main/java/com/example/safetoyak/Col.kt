package com.example.safetoyak

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Root

@Root(strict = false, name = "COL")
class Col {
    @field:Attribute(name = "NAME", required = false)
    var name: String? = null

    @field:Attribute(name = "VALUE", required = false)
    var value: String? = null
}
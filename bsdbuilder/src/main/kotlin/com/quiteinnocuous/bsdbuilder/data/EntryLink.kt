package com.quiteinnocuous.bsdbuilder.data

data class EntryLink(
    var id: String,
    var name: String,
    var targetId: String,
    var hidden: Boolean,
    var collective: Boolean,
    var type: String
)
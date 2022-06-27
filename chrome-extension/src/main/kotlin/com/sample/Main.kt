package com.sample

import kotlinx.browser.document
import mui.material.Typography
import react.create
import react.dom.client.createRoot

fun main() {
    console.log("Main started")

    createRoot(document.body!!).render(
        Typography.create {
            +"Hello, world!"
        }
    )
}

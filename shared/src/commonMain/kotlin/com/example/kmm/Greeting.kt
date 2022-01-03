package com.example.kmm

class Greeting {
    fun greeting(): String {
        return "Hello, this OS is ${Platform().platform}!"
    }

    fun getUrl(): String {
        return "https://www.google.com/"
    }
}
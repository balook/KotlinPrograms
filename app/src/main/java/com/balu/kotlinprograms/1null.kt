package com.balu.kotlinprograms

fun main(){
    var name: String? = null
    var number: String = "one"

    print("This is ${name?.length} and ${number!!.length}")

}
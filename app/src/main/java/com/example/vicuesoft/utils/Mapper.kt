package com.example.vicuesoft.utils

interface Mapper<I, O> {

    fun map(input: I): O

    fun reverse(input: O): I = throw UnsupportedOperationException()
}
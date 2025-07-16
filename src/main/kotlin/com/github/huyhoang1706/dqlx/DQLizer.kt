package com.github.huyhoang1706.dqlx

interface DQLizer {
    fun toDQL(): Pair<String, Map<String, Any>>
}
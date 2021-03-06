package com.meltwater.puppy.config

data class QueueData(
        var durable: Boolean = true,
        var auto_delete: Boolean = false,
        var arguments: MutableMap<String, Any> = java.util.HashMap()) {

    fun addArgument(key: String, value: Any): QueueData {
        arguments.put(key, value)
        return this
    }
}

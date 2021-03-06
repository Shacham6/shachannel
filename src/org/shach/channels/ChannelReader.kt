package org.shach.channels

interface ChannelReader<T> {
    fun receive(): T
    fun receiveOrDefaultWithinTimeout(waitDuration: Duration, defaultValue: T?): T?

    @Throws(ChannelReaderException::class)
    fun receive(waitDuration: Duration): T

    fun clone(): ChannelReader<T>
}
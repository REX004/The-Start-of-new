package Lessons.Lesson23Jenerics

interface Storage<T> {
    fun get(): T
    fun add(item: T)
}
package Lessons.Lesson23Jenerics

class Case<T, E>(var item: T, var item2: E): Storage<T> {
    override fun get(): T {
        return item
    }

    fun get2(): E {
        return item2
    }
    override fun add(item: T) {
        this.item = item
    }

}
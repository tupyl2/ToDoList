package lyssa.tupy.todolist

import io.realm.RealmObject

open class Dog : RealmObject() {
    public var name = ""
    public var age = 0
}
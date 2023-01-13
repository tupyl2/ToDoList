package lyssa.tupy.todolist

import android.app.Application
import io.realm.Realm

open class ToDoList : Application() {
    public override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }

}
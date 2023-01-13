package lyssa.tupy.todolist


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import io.realm.Realm


class AddToDoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_to_do)

        title = "New To Do Item"

        val button = findViewById<Button>(R.id.addButton)
        button.setOnClickListener {

            var editText = findViewById<EditText>(R.id.toDoListTextBox)
            var importantCheckBox = findViewById<CheckBox>(R.id.importantCheckBox)
            var todo = ToDoItem()
            todo.name = editText.text.toString()
            todo.important = importantCheckBox.isChecked
            val realm = Realm.getDefaultInstance()
            realm.beginTransaction()
            realm.copyToRealm(todo)
            realm.commitTransaction()

            finish()
        }
    }
}
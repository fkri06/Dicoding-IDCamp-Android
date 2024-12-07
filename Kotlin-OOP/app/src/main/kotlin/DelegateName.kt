package org.dicoding.kotlin.app
import kotlin.reflect.KProperty

class DelegateName {
    private var value: Any = "Default"

    operator fun getValue(thisRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $thisRef")
        return value
    }

    operator fun setValue(thisRef: Any, property: KProperty<*>, newValue: Any) {
        println("Fungsi ini sama seperti setter untuk property ${property.name} pada class $thisRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }

}
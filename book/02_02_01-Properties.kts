// in Kotlin
class Person(
    val name: String, //immutable and readonly
    var isMarried: Boolean //mutable and writable
)

// usage from Java
Person person = new Person("Bob", true);
System.out.println(person.getName()); // Bob
System.out.println(person.isMarried()); // true
person.setMarried(false)

// usage from Kotlin
val person = Person("Bob", true)
println(person.name) // Bob
println(person.isMarried) // true
person.isMarried = false
class User(var firstName: String, var lastName: String, var age: Int) {

    override fun toString(): String {
        return "First name: $firstName, Last name: $lastName, Age: $age"
    }

}
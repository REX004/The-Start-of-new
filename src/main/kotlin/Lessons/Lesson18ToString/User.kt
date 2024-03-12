class User(var firstName: String, var lastName: String, var age: Int) {

    override fun toString(): String {

        return "First name: $firstName, Last name: $lastName, Age: $age"

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        return firstName == other.firstName
    }

    override fun hashCode(): Int {
        return firstName.hashCode()
    }


}
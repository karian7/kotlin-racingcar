package calculation

class Sum(lhs: String, rhs: String) : MathNumber() {
    override val value: Number by lazy { lhs.toInt() + rhs.toInt() }
}

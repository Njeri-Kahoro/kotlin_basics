fun main() {
    print("Enter Marks: ")

    val marks=Integer.valueOf(readlnOrNull())
    if (marks>=80) {
        print("Grade A")
    }
    else if (marks>=60) {
        print("Grade B")
    }
    else if (marks<60) {
        print("Grade C")
    }
    }


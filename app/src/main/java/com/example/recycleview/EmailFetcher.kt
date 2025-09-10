import com.example.recycleview.Email

class EmailFetcher {
    companion object {
        private val senders = listOf(
            "Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes",
            "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval",
            "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould"
        )
        private const val title = "Welcome to Kotlin!"
        private const val summary = "Welcome to the Android Kotlin Course! We're excited to have you join us and learn how to develop Android apps using Kotlin. Here are some tips to get started."

        private var currentIndex = 0

        fun getEmails(): MutableList<Email> {
            val emails = mutableListOf<Email>()
            val endIndex = minOf(10, senders.size)
            for (i in 0 until endIndex) {
                emails.add(Email(senders[i], title, summary))
            }
            currentIndex = endIndex
            return emails
        }

        fun getNext5Emails(): MutableList<Email> {
            val newEmails = mutableListOf<Email>()
            val endIndex = minOf(currentIndex + 5, senders.size)

            for (i in currentIndex until endIndex) {
                newEmails.add(Email(senders[i], title, summary))
            }

            currentIndex = endIndex
            return newEmails
        }
    }
}

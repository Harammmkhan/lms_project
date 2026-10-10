public class LibraryService {

    /**
     * Returns the copy count after issuing one copy of a book.
     * @throws BookUnavailableException if no copies are available.
     */
    public static int issueBook(int availableCopies, String title)
            throws BookUnavailableException {
                if (title == null || title.trim().isEmpty()) {
    throw new IllegalArgumentException("Book title cannot be empty.");
}

        if (availableCopies <= 0) {
            throw new BookUnavailableException(
                "'" + title + "' has no copies available."
            );
        }

        return availableCopies - 1;
    }

    public static void main(String[] args) {

        try {
            System.out.println(
                "Remaining copies: " + issueBook(3, "Clean Code")
            );

            issueBook(0, "Clean Code");

        } catch (BookUnavailableException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
        /**
     * Checks whether a member ID exists in the array.
     *
     * @param memberIds the array of member IDs
     * @param targetId the ID to search for
     * @return true if the ID exists; otherwise, false
     */
    public static boolean findMemberById(int[] memberIds, int targetId) {
    for (int id : memberIds) {
        if (id == targetId) {
            return true;
        }
    }
    return false;
}
}

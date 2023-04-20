    public class Books{
        String title;
        String author;
        int numberofCopies;

        public BookRentalSystem(String title, String author, int numberofCopies) {
            this.title = title;
            this.author = author;
            this.numberofCopies = numberofCopies;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getNumberofCopies() {
            return numberofCopies;
        }

        public void setnumberofCopies(int numberofCopies) {
            this.numberofCopies = numberofCopies;
        }
    }

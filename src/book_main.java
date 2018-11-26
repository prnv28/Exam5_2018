class book {
    private String author_name;
    public book() {
        author_name = "";
    }
    public book(String author_name) {
        this.author_name = author_name;
    }
    public void display() {
        System.out.println("Author name: " + this.author_name);
    }
}
class book_publication extends book {
    private String title;
    public book_publication() {
        super();
        this.title = "";
    }
    public book_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }
    public void display() {
        super.display();
        System.out.println("Book Title: " + this.title);
    }
}
class paper_publication extends book {
    private String title;
    public paper_publication() {
        super();
        this.title = "";
    }
    public paper_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }
    public void display() {
        super.display();
        System.out.println("Paper Title: " + this.title);
    }
}
class book_main {
    public static void main(String[] args) {
        String author = "Andrew";
        book_publication book = new book_publication(author, "Computer Networks");
        paper_publication paper = new paper_publication(author, "Distributed Operating Systems");
        book b_ref = book;
        b_ref.display();
        b_ref = paper;
        b_ref.display();
    }
}
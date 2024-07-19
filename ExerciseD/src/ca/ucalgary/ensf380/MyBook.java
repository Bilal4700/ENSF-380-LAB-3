package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {
        Author author1 = new Author("Fateh Ali", "546 Gujranwala", 22);
        Author author2 = new Author("Bilal Kharal", "54 Kainchi mor", 13);
        Publisher publisher = new Publisher("Kharal Family", "chack 47");
        Classic classicBook = new Classic();
        classicBook.setTheAuthor(author1);
        classicBook.setBookPublisher(new Publisher[]{publisher});
        
        Novel novel = new Novel();
        novel.setTheAuthors(new Author[]{author1, author2});
        Series series = new Series();
        series.setSeriesName("Dhoom 21");
        novel.setMySeries(series);

        Contract contract = new Contract("2025-10-24", publisher, new Author[]{author1, author2});

        System.out.println();
        
        System.out.println("Author 1: " + author1.getName() + ", Address: " + author1.getAddress() + ", Age: " + author1.getAge());
        System.out.println("Author 2: " + author2.getName() + ", Address: " + author2.getAddress() + ", Age: " + author2.getAge());
        
        System.out.println();
        System.out.println("Publisher: " + publisher.getName() + ", Address: " + publisher.getAddress());

        System.out.println("");
        System.out.println("Classic Book Author: " + classicBook.getTheAuthor().getName());
        Publisher[] publishers = classicBook.getBookPublisher();
        System.out.print("Classic Book Publishers: ");
        for (Publisher pub : publishers) {
            System.out.print(pub.getName() + " ");
        }
        System.out.println();

        System.out.println();
        Author[] novelAuthors = novel.getTheAuthors();
        System.out.print("Novel Authors: ");
        for (Author auth : novelAuthors) {
            System.out.print(auth.getName() + ", ");
        }
        System.out.println();
        System.out.println("Novel Series: " + novel.getMySeries().getSeriesName());

        System.out.println();
        System.out.println("Contract Date: " + contract.getDate());
        System.out.println("Contract Publisher: " + contract.getPublisherInfo().getName());
        Author[] contractAuthors = contract.getAuthorInfo();
        System.out.print("Contract Authors: ");
        for (Author auth : contractAuthors) {
            System.out.print(auth.getName() + ", ");
        }
        System.out.println();
    }
}

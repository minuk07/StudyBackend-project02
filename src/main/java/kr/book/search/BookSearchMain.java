package kr.book.search;

// import com.itextpdf.io.IOException;  // 제거
import java.io.IOException;            // 추가

import java.util.List;
import java.util.Scanner;

public class BookSearchMain {
    public static void main(String[] args) throws IOException {  // java.io.IOException
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("도서제목을 입력하세요:");
            String bookTitle = scanner.nextLine();
            List<Book> books = KakaoBookApi.searchBooks(bookTitle);

            if (books.isEmpty()) {
                System.out.println("검색 결과가 없습니다.");
            } else {
                for (Book book : books) {
                    System.out.println(book);
                }
                String fileName = "도서목록.pdf";
                 PdfGenerator.generateBookListPdf(books, fileName);
                 System.out.println(fileName + " 파일이 생성되었습니다.");
            }
        } catch (IOException e) {  // java.io.IOException
            System.err.println("에러가 발생했습니다: " + e.getMessage());
        }
    }
}
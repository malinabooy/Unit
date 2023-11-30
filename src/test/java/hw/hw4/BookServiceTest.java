package hw.hw4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {
    private BookRepository mockRepository;
    private BookService bookService;

    private Book book;
    @BeforeEach
    void setUp() {
        // Создаем мок-объект BookRepository
        mockRepository = mock(BookRepository.class);

        // Создаем экземпляр BookService с мок-объектом BookRepository
        bookService = new BookService(mockRepository);

        // Вызываем метод findBookById и проверяем результат
        book = bookService.findBookById("1");

    }

    @Test
    void findBookById() {
        assertNotNull(book);
        assertEquals("Book1", book.getTitle());
        assertEquals("Author1", book.getAuthor());

        // Проверяем, что метод findById был вызван с ожидаемым аргументом
        verify(mockRepository).findById("1");
    }

    @Test
    void findAllBooks() {
        // Настраиваем поведение мок-объекта для метода findAll
        when(mockRepository.findAll()).thenReturn(Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        ));

        // Вызываем метод findAllBooks и проверяем результат
        List<Book> books = bookService.findAllBooks();
        assertNotNull(books);
        assertEquals(2, books.size());

        // Проверяем, что метод findAll был вызван
        verify(mockRepository).findAll();
    }
}
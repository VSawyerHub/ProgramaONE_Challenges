import model.Book;
import model.DataBook;
import model.DataWriter;
import model.Writer;
import repository.BookRepository;
import repository.WriterRepository;
import service.ConsumeAPI;
import service.ConvertData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private Scanner reading = new Scanner(System.in);
    private ConsumeAPI consume = new ConsumeAPI();
    private BookRepository repositoryBook;
    private WriterRepository repositoryWriter;
    private ConvertData convert = new ConvertData();
    private List<Book> books = new ArrayList<>();
    private final String ADDRESS = "https://gutendex.com/books?search=";


    public Main(BookRepository repositoryBook, WriterRepository repositoryWriter) {
        this.repositoryBook = repositoryBook;
        this.repositoryWriter = repositoryWriter;
    }

    public void showMenu() {
        var op = -1;
        while (op != 0) {
            var menu = """
                    *****  LiterAlura  *****
                                        
                    Choice an option:
                                        
                    1 - Search for books by title
                    2 - List registered books
                    3 - List registered authors
                    4 - List living authors
                    5 - List books by language
                    6 - Search for author by name
                    7 - Top 10 downloaded books
                                        
                    0 - Exit
                    """;

            System.out.println(menu);
            op = reading.nextInt();
            reading.nextLine();

            switch (op) {
                case 1:
                    buscarLivrosPorTitulo();
                    break;
                case 2:
                    listarLivrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivos();
                    break;
                case 5:
                    listarLivrosPorIdioma();
                    break;
                case 6:
                    buscarAutorPorNome();
                    break;
                case 7:
                    top10LivrosBaixados();
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void buscarLivrosPorTitulo() {
        System.out.println("Name of the book: ");
        var buscaLivro = reading.nextLine();
        var dados = consume.getData(ADDRESS + buscaLivro.replace(" ", "%20"));
        saveInBank(dados);
    }

    private void saveInBank(String data) {
        try {
            Book book = new Book(convert.getData(data, DataBook.class));
            Writer writer = new Writer(convert.getData(data, DataWriter.class));
            Writer bancoAutor = null;
            Book bancoLivro = null;
            if (!repositoryWriter.existsByName(writer.getName())) {
                repositoryWriter.save(writer);
                bancoAutor = writer;
            } else {
                bancoAutor = repositoryWriter.findByName(writer.getName());
            }
            if (!repositoryBook.existsByTitle(book.getTitle())) {
                book.setWriter(bancoAutor);
                repositoryBook.save(book);
                bancoLivro = book;
            } else {
                bancoLivro = repositoryBook.findByTitle(book.getTitle());
            }
            System.out.println(bancoLivro);
        } catch (NullPointerException e) {
            System.out.println("Book not found :(");
        }
    }

    private void listarLivrosRegistrados() {
        var buscarNoBanco = repositoryBook.findAll();
        if (!buscarNoBanco.isEmpty()) {
            System.out.println("\nBooks found in bank: ");
            buscarNoBanco.forEach(System.out::println);
        } else {
            System.out.println("\nNone book found");
        }
    }

    private void listarAutoresRegistrados() {
        var buscarNoBanco = repositoryWriter.findAll();
        if (!buscarNoBanco.isEmpty()) {
            System.out.println("\nWriters found in bank: ");
            buscarNoBanco.forEach(System.out::println);
        } else {
            System.out.println("\nNone writer found");
        }
    }

    private void listarAutoresVivos() {
        System.out.println("\nYear: \n");
        var year = reading.nextInt();
        reading.nextLine();
        var buscarAutoresNoBanco = repositoryWriter.searchForYearBirthday(year);
        if (!buscarAutoresNoBanco.isEmpty()) {
            System.out.println("\nAlive writers in" + year + ": ");
            buscarAutoresNoBanco.forEach(System.out::println);
        } else {
            System.out.println("\nNone writer found");
        }
    }

    private void listarLivrosPorIdioma() {
        var idiomasNoBanco = repositoryBook.searchIdiom();
        System.out.println("\nIdioms found in bank: ");
        idiomasNoBanco.forEach(System.out::println);
        System.out.println("\nIdioms: \n");
        var idiomaPesquisa = reading.nextLine();
        repositoryBook.searchForIdiom(idiomaPesquisa).forEach(System.out::println);
    }

    private void buscarAutorPorNome() {
        System.out.println("\nWriter's name: \n");
        var autorPesquisa = reading.nextLine();
        var autor = repositoryWriter.searchByName(autorPesquisa);
        if (!autor.isEmpty()){
            autor.forEach(System.out::println);
        } else {
            System.out.println("\nNone writer found");
        }
    }

    private void top10LivrosBaixados() {
        var top10 = repositoryBook.findTop10ByOrderByNumberDownloadsDesc();
        top10.forEach(System.out::println);
    }
}
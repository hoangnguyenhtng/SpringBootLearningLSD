package service;

public class BookServiceProxy implements service.BookService {
  private String _endpoint = null;
  private service.BookService bookService = null;
  
  public BookServiceProxy() {
    _initBookServiceProxy();
  }
  
  public BookServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookServiceProxy();
  }
  
  private void _initBookServiceProxy() {
    try {
      bookService = (new service.BookServiceServiceLocator()).getBookService();
      if (bookService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookService != null)
      ((javax.xml.rpc.Stub)bookService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.BookService getBookService() {
    if (bookService == null)
      _initBookServiceProxy();
    return bookService;
  }
  
  public entity.Book getBookById(int bookId) throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.getBookById(bookId);
  }
  
  public entity.Book[] getListBook() throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.getListBook();
  }
  
  public boolean insertBook(entity.Book book) throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.insertBook(book);
  }
  
  public boolean updateBook(entity.Book book) throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.updateBook(book);
  }
  
  public boolean deleteBook(int bookId) throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.deleteBook(bookId);
  }
  
  public entity.Book[] getBooksByName(java.lang.String bookName) throws java.rmi.RemoteException{
    if (bookService == null)
      _initBookServiceProxy();
    return bookService.getBooksByName(bookName);
  }
  
  
}
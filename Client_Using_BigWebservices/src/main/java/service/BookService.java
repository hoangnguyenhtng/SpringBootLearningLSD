/**
 * BookService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface BookService extends java.rmi.Remote {
    public entity.Book getBookById(int bookId) throws java.rmi.RemoteException;
    public entity.Book[] getListBook() throws java.rmi.RemoteException;
    public boolean insertBook(entity.Book book) throws java.rmi.RemoteException;
    public boolean updateBook(entity.Book book) throws java.rmi.RemoteException;
    public boolean deleteBook(int bookId) throws java.rmi.RemoteException;
    public entity.Book[] getBooksByName(java.lang.String bookName) throws java.rmi.RemoteException;
}

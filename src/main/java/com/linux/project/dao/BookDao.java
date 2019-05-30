package com.linux.project.dao;

import com.linux.project.model.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.linux.project.utils.HibernateSessionFactoryUtil;
import org.springframework.stereotype.Repository;


@Repository
public class BookDao {


    public void addBook(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(book);
        tx1.commit();
        session.close();
    }

    public Book getBookById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Book.class, id);
    }


}

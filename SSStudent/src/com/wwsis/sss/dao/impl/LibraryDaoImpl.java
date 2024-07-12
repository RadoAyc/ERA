package com.wwsis.sss.dao.impl;

import com.wwsis.sss.dao.LibraryDao;
import com.wwsis.sss.entity.Library;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class LibraryDaoImpl implements LibraryDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addLibraryRecord(Library library) {
        entityManager.persist(library);
    }

    @Override
    public void updateLibraryRecord(Library library) {
        entityManager.merge(library);
    }

    @Override
    public void deleteLibraryRecord(int libraryId) {
        Library library = entityManager.find(Library.class, libraryId);
        if (library != null) {
            entityManager.remove(library);
        }
    }

    @Override
    public Library getLibraryRecordById(int libraryId) {
        return entityManager.find(Library.class, libraryId);
    }

    @Override
    public List<Library> getAllLibraryRecords() {
        return entityManager.createQuery("SELECT l FROM Library l", Library.class).getResultList();
    }
}


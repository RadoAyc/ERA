package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Library;
import java.util.List;

public interface LibraryDao {
    void addLibraryRecord(Library library);
    void updateLibraryRecord(Library library);
    void deleteLibraryRecord(int libraryId);
    Library getLibraryRecordById(int libraryId);
    List<Library> getAllLibraryRecords();
}


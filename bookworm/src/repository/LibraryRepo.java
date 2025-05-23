package repository;

import dto.LibraryDTO;

public interface LibraryRepo {
    boolean persist(LibraryDTO libraryDTO);
}

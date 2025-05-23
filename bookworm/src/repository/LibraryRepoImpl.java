package repository;

import dto.LibraryDTO;

public class LibraryRepoImpl implements LibraryRepo{
    @Override
    public boolean persist(LibraryDTO libraryDTO) {
            if(libraryDTO!=null){
                System.out.println("libraryDTO is not null");
            }else{
                System.out.println("libraryDTO is null");
            }
            System.out.println("persist method in libraryRepoImpl");
            return true;
        }
    }

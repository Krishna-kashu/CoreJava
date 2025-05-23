package service;

import dto.LibraryDTO;

public class LibraryServiceImpl implements LibraryService{

    @Override
    public boolean save(LibraryDTO libraryDTO) {
        if(libraryDTO!=null){
            String name = libraryDTO.getName();
            if(name.length()>=3 && name.length()<20){
                System.out.println("valid");
            }else{
                System.out.println("name should be between 3 to 20 characters");
                return false;
            }

            String cost = libraryDTO.getCost();
            if(cost !=null){
                System.out.println("valid");
            }else{
                System.out.println("Cost can not be null");
                return false;
            }
            String id = libraryDTO.getBookID();
            if(id !=null){
                System.out.println("valid");
            }else{
                System.out.println("ID can not be null");
                return false;
            }
            String author = libraryDTO.getAuthorName();
            if(author !=null){
                System.out.println("valid");
            }else{
                System.out.println("author name can not be null");
                return false;
            }


        }else{
            System.out.println("Details can not be null");
            return false;
        }
        return true;


    }

    }




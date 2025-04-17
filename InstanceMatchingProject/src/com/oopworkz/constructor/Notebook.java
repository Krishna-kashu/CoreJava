package com.oopworkz.constructor;
import java.util.Objects;

public class Notebook {

    private int pages;
    private String coverType;
    private String brand;
    private boolean isHardcover;

    public Notebook(int pages, String coverType, String brand, boolean isHardcover) {
        this.pages = pages;
        this.coverType = coverType;
        this.brand = brand;
        this.isHardcover = isHardcover;
    }

    @Override
    public String toString() {
        return "Notebook{" +"pages=" + pages +", coverType=" + coverType + ", brand=" + brand + ", isHardcover=" + isHardcover +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Notebook) {
            Notebook notebook = (Notebook) obj;
            if (Objects.equals(this.pages, notebook.pages) &&
                    Objects.equals(this.coverType, notebook.coverType)) {
                System.out.println("Notebook is matching..");
                return true;
            }
        }
        return false;
    }
}

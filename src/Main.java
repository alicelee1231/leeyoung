import self.com.dao.SampleDAO;
import self.com.dto.SampleDTO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SampleDAO dao = new SampleDAO();

        //access to DB
        ArrayList<SampleDTO> books = dao.findAll();

        for(SampleDTO book : books){
            System.out.println("id" + book.getId());
            System.out.println("name" + book.getName());
            System.out.println("price" + book.getPrice());
        }
    }
}